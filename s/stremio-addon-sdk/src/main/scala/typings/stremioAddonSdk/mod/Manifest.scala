package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.Adult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
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
  
  var behaviorHints: js.UndefOr[Adult] = js.undefined
  
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
  
  inline def apply(
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
  
  extension [Self <: Manifest](x: Self) {
    
    inline def setAddonCatalogs(value: js.Array[ManifestCatalog]): Self = StObject.set(x, "addonCatalogs", value.asInstanceOf[js.Any])
    
    inline def setAddonCatalogsUndefined: Self = StObject.set(x, "addonCatalogs", js.undefined)
    
    inline def setAddonCatalogsVarargs(value: ManifestCatalog*): Self = StObject.set(x, "addonCatalogs", js.Array(value*))
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBehaviorHints(value: Adult): Self = StObject.set(x, "behaviorHints", value.asInstanceOf[js.Any])
    
    inline def setBehaviorHintsUndefined: Self = StObject.set(x, "behaviorHints", js.undefined)
    
    inline def setCatalogs(value: js.Array[ManifestCatalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsVarargs(value: ManifestCatalog*): Self = StObject.set(x, "catalogs", js.Array(value*))
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixes(value: js.Array[String]): Self = StObject.set(x, "idPrefixes", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixesUndefined: Self = StObject.set(x, "idPrefixes", js.undefined)
    
    inline def setIdPrefixesVarargs(value: String*): Self = StObject.set(x, "idPrefixes", js.Array(value*))
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[FullManifestResource | ShortManifestResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: (FullManifestResource | ShortManifestResource)*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTypes(value: js.Array[ContentType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: ContentType*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
