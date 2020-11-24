package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.Id
import typings.stremioAddonSdk.anon.addonsArrayAddonCatalogCa
import typings.stremioAddonSdk.anon.metaMetaDetailCache
import typings.stremioAddonSdk.anon.metasArrayMetaPreviewCach
import typings.stremioAddonSdk.anon.streamsArrayStreamCache
import typings.stremioAddonSdk.anon.subtitlesArraySubtitleCac
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stremio-addon-sdk", "addonBuilder")
@js.native
class addonBuilder protected () extends js.Object {
  /**
    * Creates an addon builder object with a given manifest.
    */
  def this(manifest: Manifest) = this()
  
  /**
    * Handles catalog requests, including search.
    *
    * Docs: https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/requests/defineCatalogHandler.md
    */
  def defineCatalogHandler(handler: js.Function1[/* args */ Args, js.Promise[metasArrayMetaPreviewCach]]): Unit = js.native
  
  /**
    * Handles metadata requests (title, year, poster, background, etc.).
    *
    * Docs: https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/requests/defineMetaHandler.md
    */
  def defineMetaHandler(handler: js.Function1[/* args */ Id, js.Promise[metaMetaDetailCache]]): Unit = js.native
  
  /**
    * Handles addon catalog requests
    *
    * As opposed to defineCatalogHandler() which handles meta catalogs, this method handles catalogs of addon manifests.
    * This means that an addon can be used to just pass a list of other addons that can be installed in Stremio.
    *
    * Docs: https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/requests/defineResourceHandler.md
    */
  def defineResourceHandler(args: Id): js.Promise[addonsArrayAddonCatalogCa] = js.native
  
  /**
    * Handles stream requests.
    *
    * The stream responses should be ordered from highest to lowest quality.
    *
    * Docs: https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/requests/defineStreamHandler.md
    */
  def defineStreamHandler(handler: js.Function1[/* args */ Id, js.Promise[streamsArrayStreamCache]]): Unit = js.native
  
  /**
    * Handles subtitle requests.
    *
    * Docs: https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/requests/defineSubtitlesHandler.md
    */
  def defineSubtitlesHandler(
    handler: js.Function1[
      /* args */ typings.stremioAddonSdk.anon.Extra, 
      js.Promise[subtitlesArraySubtitleCac]
    ]
  ): Unit = js.native
  
  /**
    * Turns the addon into an addonInterface, which is an immutable (frozen) object that has {manifest, get} where:
    *
    * * manifest is a regular manifest object
    * * get is a function that takes one argument of the form { resource, type, id, extra } and returns a Promise
    */
  def getInterface(): AddonInterface = js.native
}
