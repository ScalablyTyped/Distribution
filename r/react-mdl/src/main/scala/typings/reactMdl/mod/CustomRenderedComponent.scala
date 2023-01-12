package typings.reactMdl.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRenderedComponent extends StObject {
  
  var component: js.UndefOr[String | Element | js.Function] = js.undefined
}
object CustomRenderedComponent {
  
  inline def apply(): CustomRenderedComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRenderedComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRenderedComponent] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: String | Element | js.Function): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
