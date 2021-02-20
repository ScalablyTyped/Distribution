package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typings.stremioAddonSdk.stremioAddonSdkStrings.regular
import typings.stremioAddonSdk.stremioAddonSdkStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summarized collection of meta items.
  *
  * Catalogs are displayed on the Stremio's Board, Discover and Search.
  */
@js.native
trait MetaPreview extends StObject {
  
  /**
    * The background shown on the stremio detail page.
    *
    * Heavily encouraged if you want your content to look good.
    *
    * URL to PNG, max file size 500kb.
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * A few sentences describing your content.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Universal identifier.
    * You may use a prefix unique to your addon.
    *
    * Example: 'yt_id:UCrDkAvwZum-UTjHmzDI2iIw'
    */
  var id: String = js.native
  
  /**
    * The logo shown on the stremio detail page.
    *
    * Encouraged if you want your content to look good.
    *
    * URL to PNG.
    */
  var logo: js.UndefOr[String] = js.native
  
  /**
    * Name of the content.
    */
  var name: String = js.native
  
  /**
    * URL to PNG of poster.
    *
    * Accepted aspect ratios: 1:0.675 (IMDb poster type) or 1:1 (square).
    *
    * You can use any resolution, as long as the file size is below 100kb.
    * Below 50kb is recommended
    */
  var poster: js.UndefOr[String] = js.native
  
  /**
    * Poster can be square (1:1 aspect) or regular (1:0.675) or landscape (1:1.77).
    *
    * Defaults to 'regular'.
    */
  var posterShape: js.UndefOr[square | regular | landscape] = js.native
  
  /**
    * Type of the content.
    */
  var `type`: ContentType = js.native
}
object MetaPreview {
  
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): MetaPreview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPreview]
  }
  
  @scala.inline
  implicit class MetaPreviewMutableBuilder[Self <: MetaPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterShape(value: square | regular | landscape): Self = StObject.set(x, "posterShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterShapeUndefined: Self = StObject.set(x, "posterShape", js.undefined)
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
