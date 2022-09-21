package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'title'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl>> */
trait PickImpltitlePartialPickIContent
  extends StObject
     with Param {
  
  var content: js.UndefOr[String] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var title: String & js.UndefOr[String]
  
  var variation: js.UndefOr[String] = js.undefined
}
object PickImpltitlePartialPickIContent {
  
  inline def apply(title: String & js.UndefOr[String]): PickImpltitlePartialPickIContent = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltitlePartialPickIContent]
  }
  
  extension [Self <: PickImpltitlePartialPickIContent](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTitle(value: String & js.UndefOr[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
