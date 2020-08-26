package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.Adult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends js.Object {
  /**
    * Array of Catalog objects, a list of other addon manifests.
    *
    * This can be used for an addon to act just as a catalog of other addons.
    */
  var addonCatalogs: js.UndefOr[js.Array[ManifestCatalog]] = js.native
  /**
    * Background image for the addon.
    *
    * URL to png/jpg, at least 1024x786 resolution.
    */
  var background: js.UndefOr[String] = js.native
  var behaviorHints: js.UndefOr[Adult] = js.native
  /**
    * A list of the content catalogs your addon provides.
    *
    * Leave this an empty array ([]) if your addon does not provide the catalog resource.
    */
  var catalogs: js.Array[ManifestCatalog] = js.native
  /**
    * Contact email for addon issues.
    * Used for the Report button in the app.
    * Also, the Stremio team may reach you on this email for anything relating your addon.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    *  Human readable description
    */
  var description: String = js.native
  /**
    * Identifier, dot-separated, e.g. "com.stremio.filmon"
    */
  var id: String = js.native
  /**
    * Use this if you want your addon to be called only for specific content IDs.
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Logo icon, URL to png, monochrome, 256x256.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * Human readable name
    */
  var name: String = js.native
  /**
    * Supported resources, defined as an array of objects (long version) or strings (short version).
    *
    * Example #1: [{"name": "stream", "types": ["movie"], "idPrefixes": ["tt"]}]
    *
    * Example #2: ["catalog", "meta", "stream", "subtitles", "addon_catalog"]
    */
  var resources: js.Array[FullManifestResource | ShortManifestResource] = js.native
  /**
    * Supported types.
    */
  var types: js.Array[ContentType] = js.native
  /**
    * Semantic version of the addon
    */
  var version: String = js.native
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
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(catalogs = catalogs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCatalogsVarargs(value: ManifestCatalog*): Self = this.set("catalogs", js.Array(value :_*))
    @scala.inline
    def setCatalogs(value: js.Array[ManifestCatalog]): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: (FullManifestResource | ShortManifestResource)*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[FullManifestResource | ShortManifestResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: ContentType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[ContentType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddonCatalogsVarargs(value: ManifestCatalog*): Self = this.set("addonCatalogs", js.Array(value :_*))
    @scala.inline
    def setAddonCatalogs(value: js.Array[ManifestCatalog]): Self = this.set("addonCatalogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonCatalogs: Self = this.set("addonCatalogs", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBehaviorHints(value: Adult): Self = this.set("behaviorHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviorHints: Self = this.set("behaviorHints", js.undefined)
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setIdPrefixesVarargs(value: String*): Self = this.set("idPrefixes", js.Array(value :_*))
    @scala.inline
    def setIdPrefixes(value: js.Array[String]): Self = this.set("idPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdPrefixes: Self = this.set("idPrefixes", js.undefined)
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
  }
  
}

