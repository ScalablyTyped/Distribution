package typings.reactHotkeys.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentProps
  extends StObject
     with ComponentPropsBase {
  
  var ref: js.UndefOr[MutableRefObject[ComponentClass[js.Object, ComponentState]]] = js.undefined
}
object ComponentProps {
  
  inline def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentProps = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  extension [Self <: ComponentProps](x: Self) {
    
    inline def setRef(value: MutableRefObject[ComponentClass[js.Object, ComponentState]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
