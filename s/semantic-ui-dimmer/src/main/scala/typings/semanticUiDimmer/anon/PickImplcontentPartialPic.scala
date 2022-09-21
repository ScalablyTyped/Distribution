package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'content'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
trait PickImplcontentPartialPic
  extends StObject
     with Param {
  
  var content: String & js.UndefOr[String]
  
  var dimmable: js.UndefOr[String] = js.undefined
  
  var dimmer: js.UndefOr[String] = js.undefined
}
object PickImplcontentPartialPic {
  
  inline def apply(content: String & js.UndefOr[String]): PickImplcontentPartialPic = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontentPartialPic]
  }
  
  extension [Self <: PickImplcontentPartialPic](x: Self) {
    
    inline def setContent(value: String & js.UndefOr[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmableUndefined: Self = StObject.set(x, "dimmable", js.undefined)
    
    inline def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
    
    inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
  }
}
