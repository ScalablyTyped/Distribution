package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, 'position'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.MetadataSettings._Impl>> */
trait PickImplpositionPartialPiContent
  extends StObject
     with Param {
  
  var content: js.UndefOr[String] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var position: String & js.UndefOr[String]
  
  var title: js.UndefOr[String] = js.undefined
  
  var variation: js.UndefOr[String] = js.undefined
}
object PickImplpositionPartialPiContent {
  
  inline def apply(position: String & js.UndefOr[String]): PickImplpositionPartialPiContent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpositionPartialPiContent]
  }
  
  extension [Self <: PickImplpositionPartialPiContent](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String & js.UndefOr[String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
