package typings.reactMdl.mod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRenderedComponent extends StObject {
  
  var component: js.UndefOr[String | Element | js.Function] = js.native
}
object CustomRenderedComponent {
  
  @scala.inline
  def apply(): CustomRenderedComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRenderedComponent]
  }
  
  @scala.inline
  implicit class CustomRenderedComponentMutableBuilder[Self <: CustomRenderedComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String | Element | js.Function): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
