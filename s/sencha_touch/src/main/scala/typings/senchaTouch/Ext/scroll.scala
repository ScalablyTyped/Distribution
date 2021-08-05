package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scroll {
  
  type IIndicator = IBase
  
  trait IScroller
    extends StObject
       with IEvented {
    
    /** [Config Option] (Number) */
    var acceleration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var directionLock: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var friction: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of directionLock
      * @returns Boolean
      */
    var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of disabled
      * @returns Boolean
      */
    var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of initialOffset
      * @returns Object/Number
      */
    var getInitialOffset: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of momentumEasing
      * @returns Object
      */
    var getMomentumEasing: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of slotSnapEasing
      * @returns Object
      */
    var getSlotSnapEasing: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of slotSnapSize
      * @returns Number/Object
      */
    var getSlotSnapSize: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Object/Number) */
    var initialOffset: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns true if a specified axis is enabled
      * @param axis String The axis to check (x or y).
      * @returns Boolean true if the axis is enabled.
      */
    var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Config Option] (Object) */
    var momentumEasing: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Change the scroll offset by the given amount
      * @param x Number The offset to scroll by on the x axis.
      * @param y Number The offset to scroll by on the y axis.
      * @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
      * @returns Ext.scroll.Scroller this
      */
    var scrollBy: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animation */ js.UndefOr[js.Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls to the given location
      * @param x Number The scroll position on the x axis.
      * @param y Number The scroll position on the y axis.
      * @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
      * @returns Ext.scroll.Scroller this
      */
    var scrollTo: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animation */ js.UndefOr[js.Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls to the end of the scrollable view
      * @param animation Object
      * @returns Ext.scroll.Scroller this
      */
    var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of directionLock
      * @param directionLock Boolean The new value.
      */
    var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of disabled
      * @param disabled Boolean The new value.
      */
    var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of initialOffset
      * @param initialOffset Object/Number The new value.
      */
    var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of momentumEasing
      * @param momentumEasing Object The new value.
      */
    var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the offset of this scroller
      * @param offset Object The offset to move to.
      * @returns Ext.scroll.Scroller this
      */
    var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
    
    /** [Method] Sets the value of slotSnapEasing
      * @param slotSnapEasing Object The new value.
      */
    var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of slotSnapSize
      * @param slotSnapSize Number/Object The new value.
      */
    var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var slotSnapSize: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Updates the boundary information for this scroller
      * @returns Ext.scroll.Scroller this
      */
    var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.undefined
  }
  object IScroller {
    
    inline def apply(): IScroller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScroller]
    }
    
    extension [Self <: IScroller](x: Self) {
      
      inline def setAcceleration(value: Double): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      inline def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
      
      inline def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionLock(value: Boolean): Self = StObject.set(x, "directionLock", value.asInstanceOf[js.Any])
      
      inline def setDirectionLockUndefined: Self = StObject.set(x, "directionLock", js.undefined)
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionLock(value: () => Boolean): Self = StObject.set(x, "getDirectionLock", js.Any.fromFunction0(value))
      
      inline def setGetDirectionLockUndefined: Self = StObject.set(x, "getDirectionLock", js.undefined)
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
      
      inline def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
      
      inline def setGetInitialOffset(value: () => js.Any): Self = StObject.set(x, "getInitialOffset", js.Any.fromFunction0(value))
      
      inline def setGetInitialOffsetUndefined: Self = StObject.set(x, "getInitialOffset", js.undefined)
      
      inline def setGetMomentumEasing(value: () => js.Any): Self = StObject.set(x, "getMomentumEasing", js.Any.fromFunction0(value))
      
      inline def setGetMomentumEasingUndefined: Self = StObject.set(x, "getMomentumEasing", js.undefined)
      
      inline def setGetSlotSnapEasing(value: () => js.Any): Self = StObject.set(x, "getSlotSnapEasing", js.Any.fromFunction0(value))
      
      inline def setGetSlotSnapEasingUndefined: Self = StObject.set(x, "getSlotSnapEasing", js.undefined)
      
      inline def setGetSlotSnapSize(value: () => js.Any): Self = StObject.set(x, "getSlotSnapSize", js.Any.fromFunction0(value))
      
      inline def setGetSlotSnapSizeUndefined: Self = StObject.set(x, "getSlotSnapSize", js.undefined)
      
      inline def setGetTranslatable(value: () => js.Any): Self = StObject.set(x, "getTranslatable", js.Any.fromFunction0(value))
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setInitialOffset(value: js.Any): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
      
      inline def setInitialOffsetUndefined: Self = StObject.set(x, "initialOffset", js.undefined)
      
      inline def setIsAxisEnabled(value: /* axis */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isAxisEnabled", js.Any.fromFunction1(value))
      
      inline def setIsAxisEnabledUndefined: Self = StObject.set(x, "isAxisEnabled", js.undefined)
      
      inline def setMomentumEasing(value: js.Any): Self = StObject.set(x, "momentumEasing", value.asInstanceOf[js.Any])
      
      inline def setMomentumEasingUndefined: Self = StObject.set(x, "momentumEasing", js.undefined)
      
      inline def setScrollBy(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
      ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
      
      inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
      
      inline def setScrollTo(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction3(value))
      
      inline def setScrollToEnd(value: /* animation */ js.UndefOr[js.Any] => IScroller): Self = StObject.set(x, "scrollToEnd", js.Any.fromFunction1(value))
      
      inline def setScrollToEndUndefined: Self = StObject.set(x, "scrollToEnd", js.undefined)
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDirectionLock", js.Any.fromFunction1(value))
      
      inline def setSetDirectionLockUndefined: Self = StObject.set(x, "setDirectionLock", js.undefined)
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
      
      inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
      
      inline def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInitialOffset", js.Any.fromFunction1(value))
      
      inline def setSetInitialOffsetUndefined: Self = StObject.set(x, "setInitialOffset", js.undefined)
      
      inline def setSetMomentumEasing(value: /* momentumEasing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMomentumEasing", js.Any.fromFunction1(value))
      
      inline def setSetMomentumEasingUndefined: Self = StObject.set(x, "setMomentumEasing", js.undefined)
      
      inline def setSetOffset(value: /* offset */ js.UndefOr[js.Any] => IScroller): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetOffsetUndefined: Self = StObject.set(x, "setOffset", js.undefined)
      
      inline def setSetSlotSnapEasing(value: /* slotSnapEasing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSlotSnapEasing", js.Any.fromFunction1(value))
      
      inline def setSetSlotSnapEasingUndefined: Self = StObject.set(x, "setSlotSnapEasing", js.undefined)
      
      inline def setSetSlotSnapSize(value: /* slotSnapSize */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSlotSnapSize", js.Any.fromFunction1(value))
      
      inline def setSetSlotSnapSizeUndefined: Self = StObject.set(x, "setSlotSnapSize", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1(value))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
      
      inline def setSlotSnapSize(value: js.Any): Self = StObject.set(x, "slotSnapSize", value.asInstanceOf[js.Any])
      
      inline def setSlotSnapSizeUndefined: Self = StObject.set(x, "slotSnapSize", js.undefined)
      
      inline def setUpdateBoundary(value: () => IScroller): Self = StObject.set(x, "updateBoundary", js.Any.fromFunction0(value))
      
      inline def setUpdateBoundaryUndefined: Self = StObject.set(x, "updateBoundary", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with IEvented {
    
    /** [Method] Returns the value of cls
      * @returns String
      */
    var getCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of indicators
      * @returns Object
      */
    var getIndicators: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of indicatorsHidingDelay
      * @returns Number
      */
    var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of indicatorsUi
      * @returns String
      */
    var getIndicatorsUi: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the scroller instance in this view
      * @returns Ext.scroll.View The scroller
      */
    var getScroller: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (String) */
    var indicatorsUi: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of cls
      * @param cls String The new value.
      */
    var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicators
      * @param indicators Object The new value.
      */
    var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicatorsHidingDelay
      * @param indicatorsHidingDelay Number The new value.
      */
    var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicatorsUi
      * @param indicatorsUi String The new value.
      */
    var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of scroller
      * @param scroller Object The new value.
      */
    var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IView {
    
    inline def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
      
      inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      inline def setGetElement(value: () => js.Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetIndicators(value: () => js.Any): Self = StObject.set(x, "getIndicators", js.Any.fromFunction0(value))
      
      inline def setGetIndicatorsHidingDelay(value: () => Double): Self = StObject.set(x, "getIndicatorsHidingDelay", js.Any.fromFunction0(value))
      
      inline def setGetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "getIndicatorsHidingDelay", js.undefined)
      
      inline def setGetIndicatorsUi(value: () => java.lang.String): Self = StObject.set(x, "getIndicatorsUi", js.Any.fromFunction0(value))
      
      inline def setGetIndicatorsUiUndefined: Self = StObject.set(x, "getIndicatorsUi", js.undefined)
      
      inline def setGetIndicatorsUndefined: Self = StObject.set(x, "getIndicators", js.undefined)
      
      inline def setGetScroller(value: () => IView): Self = StObject.set(x, "getScroller", js.Any.fromFunction0(value))
      
      inline def setGetScrollerUndefined: Self = StObject.set(x, "getScroller", js.undefined)
      
      inline def setIndicatorsUi(value: java.lang.String): Self = StObject.set(x, "indicatorsUi", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUiUndefined: Self = StObject.set(x, "indicatorsUi", js.undefined)
      
      inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      inline def setSetIndicators(value: /* indicators */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIndicators", js.Any.fromFunction1(value))
      
      inline def setSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIndicatorsHidingDelay", js.Any.fromFunction1(value))
      
      inline def setSetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "setIndicatorsHidingDelay", js.undefined)
      
      inline def setSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIndicatorsUi", js.Any.fromFunction1(value))
      
      inline def setSetIndicatorsUiUndefined: Self = StObject.set(x, "setIndicatorsUi", js.undefined)
      
      inline def setSetIndicatorsUndefined: Self = StObject.set(x, "setIndicators", js.undefined)
      
      inline def setSetScroller(value: /* scroller */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScroller", js.Any.fromFunction1(value))
      
      inline def setSetScrollerUndefined: Self = StObject.set(x, "setScroller", js.undefined)
    }
  }
  
  object indicator {
    
    trait IAbstract
      extends StObject
         with IComponent {
      
      /** [Config Option] (Boolean) */
      var autoHide: js.UndefOr[Boolean] = js.undefined
      
      /** [Method] Returns the value of active
        * @returns Boolean
        */
      var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Returns the value of autoHide
        * @returns Boolean
        */
      var getAutoHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Returns the value of axis
        * @returns String
        */
      var getAxis: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of barCls
        * @returns String
        */
      var getBarCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of length
        * @returns Object
        */
      var getLength: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Returns the value of minLength
        * @returns Number
        */
      var getMinLength: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of ratio
        * @returns Number
        */
      var getRatio: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of value
        * @returns Object
        */
      var getValue: js.UndefOr[js.Function0[js.Any]] = js.undefined
      
      /** [Method] Sets the value of active
        * @param active Boolean The new value.
        */
      var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Sets the value of autoHide
        * @param autoHide Boolean The new value.
        */
      var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Sets the value of axis
        * @param axis String The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of barCls
        * @param barCls String The new value.
        */
      var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of length
        * @param length Object The new value.
        */
      var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[js.Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of minLength
        * @param minLength Number The new value.
        */
      var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of ratio
        * @param ratio Number The new value.
        */
      var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of value
        * @param value Object The new value.
        */
      var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    }
    object IAbstract {
      
      inline def apply(): IAbstract = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAbstract]
      }
      
      extension [Self <: IAbstract](x: Self) {
        
        inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
        
        inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
        
        inline def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
        
        inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
        
        inline def setGetAutoHide(value: () => Boolean): Self = StObject.set(x, "getAutoHide", js.Any.fromFunction0(value))
        
        inline def setGetAutoHideUndefined: Self = StObject.set(x, "getAutoHide", js.undefined)
        
        inline def setGetAxis(value: () => java.lang.String): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        inline def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        inline def setGetBarCls(value: () => java.lang.String): Self = StObject.set(x, "getBarCls", js.Any.fromFunction0(value))
        
        inline def setGetBarClsUndefined: Self = StObject.set(x, "getBarCls", js.undefined)
        
        inline def setGetLength(value: () => js.Any): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
        
        inline def setGetLengthUndefined: Self = StObject.set(x, "getLength", js.undefined)
        
        inline def setGetMinLength(value: () => Double): Self = StObject.set(x, "getMinLength", js.Any.fromFunction0(value))
        
        inline def setGetMinLengthUndefined: Self = StObject.set(x, "getMinLength", js.undefined)
        
        inline def setGetRatio(value: () => Double): Self = StObject.set(x, "getRatio", js.Any.fromFunction0(value))
        
        inline def setGetRatioUndefined: Self = StObject.set(x, "getRatio", js.undefined)
        
        inline def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
        
        inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
        
        inline def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
        
        inline def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
        
        inline def setSetAutoHide(value: /* autoHide */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoHide", js.Any.fromFunction1(value))
        
        inline def setSetAutoHideUndefined: Self = StObject.set(x, "setAutoHide", js.undefined)
        
        inline def setSetAxis(value: /* axis */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        inline def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        inline def setSetBarCls(value: /* barCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBarCls", js.Any.fromFunction1(value))
        
        inline def setSetBarClsUndefined: Self = StObject.set(x, "setBarCls", js.undefined)
        
        inline def setSetLength(value: /* length */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
        
        inline def setSetLengthUndefined: Self = StObject.set(x, "setLength", js.undefined)
        
        inline def setSetMinLength(value: /* minLength */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinLength", js.Any.fromFunction1(value))
        
        inline def setSetMinLengthUndefined: Self = StObject.set(x, "setMinLength", js.undefined)
        
        inline def setSetRatio(value: /* ratio */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRatio", js.Any.fromFunction1(value))
        
        inline def setSetRatioUndefined: Self = StObject.set(x, "setRatio", js.undefined)
        
        inline def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
        
        inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      }
    }
    
    trait ICssTransform
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_ICssTransform: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_ICssTransform: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object ICssTransform {
      
      inline def apply(): ICssTransform = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICssTransform]
      }
      
      extension [Self <: ICssTransform](x: Self) {
        
        inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    trait IRounded
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IRounded: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IRounded: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object IRounded {
      
      inline def apply(): IRounded = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRounded]
      }
      
      extension [Self <: IRounded](x: Self) {
        
        inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    trait IScrollPosition
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IScrollPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IScrollPosition: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object IScrollPosition {
      
      inline def apply(): IScrollPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScrollPosition]
      }
      
      extension [Self <: IScrollPosition](x: Self) {
        
        inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
  }
}
