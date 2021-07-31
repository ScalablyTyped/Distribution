package typings.reactNativeWindows

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewWindowsPropsMod {
  
  trait IViewWindowsProps
    extends StObject
       with IKeyboardProps
       with ViewProps {
    
    /** @Deprecated Use focusable instead.*/
    var acceptsKeyboardFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates to accessibility services that the UI Component is within a set and has the given numbered position.
      *
      * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
      */
    var accessibilityPosInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates to accessibility services that the UI Component is within a set with the given size.
      *
      * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
      */
    var accessibilitySetSize: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object IViewWindowsProps {
    
    @scala.inline
    def apply(): IViewWindowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewWindowsProps]
    }
    
    @scala.inline
    implicit class IViewWindowsPropsMutableBuilder[Self <: IViewWindowsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptsKeyboardFocus(value: Boolean): Self = StObject.set(x, "acceptsKeyboardFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsKeyboardFocusUndefined: Self = StObject.set(x, "acceptsKeyboardFocus", js.undefined)
      
      @scala.inline
      def setAccessibilityPosInSet(value: Double): Self = StObject.set(x, "accessibilityPosInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityPosInSetUndefined: Self = StObject.set(x, "accessibilityPosInSet", js.undefined)
      
      @scala.inline
      def setAccessibilitySetSize(value: Double): Self = StObject.set(x, "accessibilitySetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilitySetSizeUndefined: Self = StObject.set(x, "accessibilitySetSize", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
