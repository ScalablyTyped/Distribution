package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.reactWidgets.anon.PickPopupPropskeyofPopupP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPopupMod extends Shortcut {
  
  @JSImport("react-widgets/esm/Popup", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PickPopupPropskeyofPopupP] = js.native
  
  @JSImport("react-widgets/esm/Popup", "StaticContainer")
  @js.native
  val StaticContainer: MemoExoticComponent[js.Function1[/* param0 */ StaticContainerProps, ReactElement]] = js.native
  
  trait PopupProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[ComponentType[TransitionProps[Unit]]] = js.undefined
  }
  object PopupProps {
    
    inline def apply(): PopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: () => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction0(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: () => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction0(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTransition(value: ComponentType[TransitionProps[Unit]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait StaticContainerProps extends StObject {
    
    var children: ReactNode
    
    var shouldUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object StaticContainerProps {
    
    inline def apply(): StaticContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PickPopupPropskeyofPopupP]
  
  /* This means you don't have to write `default`, but can instead just say `esmPopupMod.foo` */
  override def _to: ForwardRefExoticComponent[PickPopupPropskeyofPopupP] = default
}
