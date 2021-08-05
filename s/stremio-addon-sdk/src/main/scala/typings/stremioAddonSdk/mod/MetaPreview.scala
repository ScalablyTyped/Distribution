package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typings.stremioAddonSdk.stremioAddonSdkStrings.regular
import typings.stremioAddonSdk.stremioAddonSdkStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summarized collection of meta items.
  *
  * Catalogs are displayed on the Stremio's Board, Discover and Search.
  */
trait MetaPreview extends StObject {
  
  /**
    * The background shown on the stremio detail page.
    *
    * Heavily encouraged if you want your content to look good.
    *
    * URL to PNG, max file size 500kb.
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * A few sentences describing your content.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Universal identifier.
    * You may use a prefix unique to your addon.
    *
    * Example: 'yt_id:UCrDkAvwZum-UTjHmzDI2iIw'
    */
  var id: String
  
  /**
    * The logo shown on the stremio detail page.
    *
    * Encouraged if you want your content to look good.
    *
    * URL to PNG.
    */
  var logo: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the content.
    */
  var name: String
  
  /**
    * URL to PNG of poster.
    *
    * Accepted aspect ratios: 1:0.675 (IMDb poster type) or 1:1 (square).
    *
    * You can use any resolution, as long as the file size is below 100kb.
    * Below 50kb is recommended
    */
  var poster: js.UndefOr[String] = js.undefined
  
  /**
    * Poster can be square (1:1 aspect) or regular (1:0.675) or landscape (1:1.77).
    *
    * Defaults to 'regular'.
    */
  var posterShape: js.UndefOr[square | regular | landscape] = js.undefined
  
  /**
    * Type of the content.
    */
  var `type`: ContentType
}
object MetaPreview {
  
  inline def apply(id: String, name: String, `type`: ContentType): MetaPreview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPreview]
  }
  
  extension [Self <: MetaPreview](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterShape(value: square | regular | landscape): Self = StObject.set(x, "posterShape", value.asInstanceOf[js.Any])
    
    inline def setPosterShapeUndefined: Self = StObject.set(x, "posterShape", js.undefined)
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
