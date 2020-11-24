package typings.reactNativeWindows.viewWindowsPropsMod

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewWindowsProps
  extends ViewProps
     with IKeyboardProps {
  
  /** @Deprecated Use focusable instead.*/
  var acceptsKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates to accessibility services that the UI Component is within a set and has the given numbered position.
    *
    * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
    */
  var accessibilityPosInSet: js.UndefOr[Double] = js.native
  
  /**
    * Indicates to accessibility services that the UI Component is within a set with the given size.
    *
    * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
    */
  var accessibilitySetSize: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[js.Any] = js.native
}
object IViewWindowsProps {
  
  @scala.inline
  def apply(): IViewWindowsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewWindowsProps]
  }
  
  @scala.inline
  implicit class IViewWindowsPropsOps[Self <: IViewWindowsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptsKeyboardFocus(value: Boolean): Self = this.set("acceptsKeyboardFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptsKeyboardFocus: Self = this.set("acceptsKeyboardFocus", js.undefined)
    
    @scala.inline
    def setAccessibilityPosInSet(value: Double): Self = this.set("accessibilityPosInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityPosInSet: Self = this.set("accessibilityPosInSet", js.undefined)
    
    @scala.inline
    def setAccessibilitySetSize(value: Double): Self = this.set("accessibilitySetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilitySetSize: Self = this.set("accessibilitySetSize", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
