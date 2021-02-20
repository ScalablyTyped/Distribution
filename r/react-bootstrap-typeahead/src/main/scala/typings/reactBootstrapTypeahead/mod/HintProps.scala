package typings.reactBootstrapTypeahead.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HintProps extends StObject {
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var shouldSelect: js.UndefOr[ShouldSelect] = js.native
}
object HintProps {
  
  @scala.inline
  def apply(): HintProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintProps]
  }
  
  @scala.inline
  implicit class HintPropsMutableBuilder[Self <: HintProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setShouldSelect(value: (/* shouldSelect */ Boolean, /* e */ KeyboardEvent[HTMLInputElement]) => Boolean): Self = StObject.set(x, "shouldSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldSelectUndefined: Self = StObject.set(x, "shouldSelect", js.undefined)
  }
}
