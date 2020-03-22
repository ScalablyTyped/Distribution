package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.AnonAdult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  /**
    * Array of Catalog objects, a list of other addon manifests.
    *
    * This can be used for an addon to act just as a catalog of other addons.
    */
  var addonCatalogs: js.UndefOr[js.Array[ManifestCatalog]] = js.undefined
  /**
    * Background image for the addon.
    *
    * URL to png/jpg, at least 1024x786 resolution.
    */
  var background: js.UndefOr[String] = js.undefined
  var behaviorHints: js.UndefOr[AnonAdult] = js.undefined
  /**
    * A list of the content catalogs your addon provides.
    *
    * Leave this an empty array ([]) if your addon does not provide the catalog resource.
    */
  var catalogs: js.Array[ManifestCatalog]
  /**
    * Contact email for addon issues.
    * Used for the Report button in the app.
    * Also, the Stremio team may reach you on this email for anything relating your addon.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  /**
    *  Human readable description
    */
  var description: String
  /**
    * Identifier, dot-separated, e.g. "com.stremio.filmon"
    */
  var id: String
  /**
    * Use this if you want your addon to be called only for specific content IDs.
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Logo icon, URL to png, monochrome, 256x256.
    */
  var logo: js.UndefOr[String] = js.undefined
  /**
    * Human readable name
    */
  var name: String
  /**
    * Supported resources, defined as an array of objects (long version) or strings (short version).
    *
    * Example #1: [{"name": "stream", "types": ["movie"], "idPrefixes": ["tt"]}]
    *
    * Example #2: ["catalog", "meta", "stream", "subtitles", "addon_catalog"]
    */
  var resources: js.Array[FullManifestResource | ShortManifestResource]
  /**
    * Supported types.
    */
  var types: js.Array[ContentType]
  /**
    * Semantic version of the addon
    */
  var version: String
}

object Manifest {
  @scala.inline
  def apply(
    catalogs: js.Array[ManifestCatalog],
    description: String,
    id: String,
    name: String,
    resources: js.Array[FullManifestResource | ShortManifestResource],
    types: js.Array[ContentType],
    version: String,
    addonCatalogs: js.Array[ManifestCatalog] = null,
    background: String = null,
    behaviorHints: AnonAdult = null,
    contactEmail: String = null,
    idPrefixes: js.Array[String] = null,
    logo: String = null
  ): Manifest = {
    val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (addonCatalogs != null) __obj.updateDynamic("addonCatalogs")(addonCatalogs.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (behaviorHints != null) __obj.updateDynamic("behaviorHints")(behaviorHints.asInstanceOf[js.Any])
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (idPrefixes != null) __obj.updateDynamic("idPrefixes")(idPrefixes.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

