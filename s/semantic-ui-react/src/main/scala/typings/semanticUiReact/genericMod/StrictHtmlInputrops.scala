package typings.semanticUiReact.genericMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlInputrops extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StrictHtmlInputrops {
  
  @scala.inline
  def apply(): StrictHtmlInputrops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlInputrops]
  }
  
  @scala.inline
  implicit class StrictHtmlInputropsMutableBuilder[Self <: StrictHtmlInputrops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
