package typings.reactFocusOn

import typings.react.mod.CSSProperties
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TypesMod {
  
  trait CommonProps extends StObject {
    
    /**
      * [scroll-lock] allows scroll based zoom
      * @default false
      * @see https://github.com/theKashey/react-remove-scroll#usage
      */
    var allowPinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [scroll-lock] full page inert (event suppression)
      * @default false
      * @see {@link https://github.com/theKashey/react-remove-scroll#usage}
      */
    var inert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [scroll-lock] control isolation
      * @see {@link https://github.com/theKashey/react-remove-scroll#usage}
      */
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * callback on lock activation
      * @param node the main node
      */
    var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * action to perform on click outside
      */
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    /**
      * callback on lock deactivation
      */
    var onDeactivation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * action to perform on Esc key press
      */
    var onEscapeKey: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * a list of elements which should be considered as a part of the lock
      */
    var shards: js.UndefOr[js.Array[RefObject[Any] | HTMLElement]] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowPinchZoomUndefined: Self = StObject.set(x, "allowPinchZoom", js.undefined)
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setOnActivation(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onActivation", js.Any.fromFunction1(value))
      
      inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      inline def setOnClickOutside(value: /* event */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnDeactivation(value: () => Unit): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction0(value))
      
      inline def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      inline def setOnEscapeKey(value: /* event */ Event => Unit): Self = StObject.set(x, "onEscapeKey", js.Any.fromFunction1(value))
      
      inline def setOnEscapeKeyUndefined: Self = StObject.set(x, "onEscapeKey", js.undefined)
      
      inline def setShards(value: js.Array[RefObject[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefObject[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
    }
  }
  
  trait EffectProps
    extends StObject
       with CommonProps {
    
    def setLockProps(settings: LockProps): Unit
  }
  object EffectProps {
    
    inline def apply(setLockProps: LockProps => Unit): EffectProps = {
      val __obj = js.Dynamic.literal(setLockProps = js.Any.fromFunction1(setLockProps))
      __obj.asInstanceOf[EffectProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EffectProps] (val x: Self) extends AnyVal {
      
      inline def setSetLockProps(value: LockProps => Unit): Self = StObject.set(x, "setLockProps", js.Any.fromFunction1(value))
    }
  }
  
  trait LockProps extends StObject {
    
    var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onDeactivation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[
        js.Function1[/* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* e */ typings.react.mod.TouchEvent[Element], Unit]] = js.undefined
  }
  object LockProps {
    
    inline def apply(): LockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockProps] (val x: Self) extends AnyVal {
      
      inline def setOnActivation(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onActivation", js.Any.fromFunction1(value))
      
      inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      inline def setOnDeactivation(value: () => Unit): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction0(value))
      
      inline def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnTouchStart(value: /* e */ typings.react.mod.TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  trait ReactFocusOnProps
    extends StObject
       with CommonProps {
    
    /**
      * allows replacement of the host node
      * @default div
      */
    var as: js.UndefOr[String | ElementType[Any]] = js.undefined
    
    /**
      * [focus-lock] control autofocus
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The main switch
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls focus lock behavior
      */
    var focusLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [focus-lock] control returnFocus
      * @default true
      */
    var returnFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactFocusLock * / any>['returnFocus'] */ js.Any
      ] = js.undefined
    
    /**
      * Controls scroll lock behavior
      */
    var scrollLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [focus-lock] allows "ignoring" focus on some elements
      * @see {@link https://github.com/theKashey/react-focus-lock#api}
      */
    var shouldIgnore: js.UndefOr[js.Function1[/* candidate */ HTMLElement, Boolean]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReactFocusOnProps {
    
    inline def apply(): ReactFocusOnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFocusOnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactFocusOnProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: String | ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      inline def setReturnFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactFocusLock * / any>['returnFocus'] */ js.Any
      ): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
      
      inline def setScrollLockUndefined: Self = StObject.set(x, "scrollLock", js.undefined)
      
      inline def setShouldIgnore(value: /* candidate */ HTMLElement => Boolean): Self = StObject.set(x, "shouldIgnore", js.Any.fromFunction1(value))
      
      inline def setShouldIgnoreUndefined: Self = StObject.set(x, "shouldIgnore", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ReactFocusOnSideProps
    extends StObject
       with ReactFocusOnProps {
    
    var sideCar: FC[Any]
  }
  object ReactFocusOnSideProps {
    
    inline def apply(sideCar: FC[Any]): ReactFocusOnSideProps = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFocusOnSideProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactFocusOnSideProps] (val x: Self) extends AnyVal {
      
      inline def setSideCar(value: FC[Any]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
    }
  }
}
