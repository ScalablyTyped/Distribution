package typings.reactMdUtils

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MutableRefObject
import typings.reactMdUtils.anon.ReadonlyActiveDescendantC
import typings.reactMdUtils.useKeyboardFocusMod.KeyboardFocusCallbacks
import typings.reactMdUtils.useKeyboardFocusMod.KeyboardFocusHookReturnValue
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useActiveDescendantFocusMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/useActiveDescendantFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")().asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](hasDefaultActiveIdOptions: ActiveDescendantFocusHookOptions[E]): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")(hasDefaultActiveIdOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  
  trait ActiveDescendantFocusHookOptions[E /* <: HTMLElement */]
    extends StObject
       with KeyboardFocusCallbacks[E] {
    
    /**
      * An optional DOM id for one of the children that should be focused by
      * default.
      */
    var defaultActiveId: js.UndefOr[String] = js.undefined
  }
  object ActiveDescendantFocusHookOptions {
    
    inline def apply[E /* <: HTMLElement */](): ActiveDescendantFocusHookOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveDescendantFocusHookOptions[E]]
    }
    
    extension [Self <: ActiveDescendantFocusHookOptions[?], E /* <: HTMLElement */](x: Self & ActiveDescendantFocusHookOptions[E]) {
      
      inline def setDefaultActiveId(value: String): Self = StObject.set(x, "defaultActiveId", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIdUndefined: Self = StObject.set(x, "defaultActiveId", js.undefined)
    }
  }
  
  trait ActiveDescendantFocusHookReturnValue[E /* <: HTMLElement */]
    extends StObject
       with KeyboardFocusHookReturnValue[E] {
    
    /**
      * The current DOM id of a child that has keyboard focus.
      */
    var `aria-activedescendant`: String
    
    /**
      * An object of props that should be passed to the
      * {@link ActiveDescendantMovementProvider}.
      */
    var providerProps: ReadonlyActiveDescendantC
  }
  object ActiveDescendantFocusHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      `aria-activedescendant`: String,
      focusIndex: MutableRefObject[Double],
      onFocus: FocusEvent[E, Element] => Unit,
      onKeyDown: KeyboardEvent[E] => Unit,
      providerProps: ReadonlyActiveDescendantC
    ): ActiveDescendantFocusHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(focusIndex = focusIndex.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), providerProps = providerProps.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
    }
    
    extension [Self <: ActiveDescendantFocusHookReturnValue[?], E /* <: HTMLElement */](x: Self & ActiveDescendantFocusHookReturnValue[E]) {
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def setProviderProps(value: ReadonlyActiveDescendantC): Self = StObject.set(x, "providerProps", value.asInstanceOf[js.Any])
    }
  }
}
