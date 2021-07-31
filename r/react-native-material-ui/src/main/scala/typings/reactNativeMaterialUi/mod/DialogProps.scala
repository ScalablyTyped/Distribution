package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps extends StObject {
  
  var children: Element | js.Array[Element]
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[`0`] = js.undefined
}
object DialogProps {
  
  @scala.inline
  def apply(children: Element | js.Array[Element]): DialogProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  @scala.inline
  implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: `0`): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
