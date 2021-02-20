package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scroll {
  
  type IIndicator = IBase
  
  @js.native
  trait IScroller extends IEvented {
    
    /** [Config Option] (Number) */
    var acceleration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var directionLock: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var friction: js.UndefOr[Double] = js.native
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of directionLock
      * @returns Boolean
      */
    var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of disabled
      * @returns Boolean
      */
    var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of initialOffset
      * @returns Object/Number
      */
    var getInitialOffset: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of momentumEasing
      * @returns Object
      */
    var getMomentumEasing: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of slotSnapEasing
      * @returns Object
      */
    var getSlotSnapEasing: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of slotSnapSize
      * @returns Number/Object
      */
    var getSlotSnapSize: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (Object/Number) */
    var initialOffset: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns true if a specified axis is enabled
      * @param axis String The axis to check (x or y).
      * @returns Boolean true if the axis is enabled.
      */
    var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Config Option] (Object) */
    var momentumEasing: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Scrolls to the end of the scrollable view
      * @param animation Object
      * @returns Ext.scroll.Scroller this
      */
    var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of directionLock
      * @param directionLock Boolean The new value.
      */
    var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of disabled
      * @param disabled Boolean The new value.
      */
    var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of initialOffset
      * @param initialOffset Object/Number The new value.
      */
    var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of momentumEasing
      * @param momentumEasing Object The new value.
      */
    var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the offset of this scroller
      * @param offset Object The offset to move to.
      * @returns Ext.scroll.Scroller this
      */
    var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.native
    
    /** [Method] Sets the value of slotSnapEasing
      * @param slotSnapEasing Object The new value.
      */
    var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of slotSnapSize
      * @param slotSnapSize Number/Object The new value.
      */
    var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Number/Object) */
    var slotSnapSize: js.UndefOr[js.Any] = js.native
    
    /** [Method] Updates the boundary information for this scroller
      * @returns Ext.scroll.Scroller this
      */
    var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.native
  }
  object IScroller {
    
    @scala.inline
    def apply(): IScroller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScroller]
    }
    
    @scala.inline
    implicit class IScrollerMutableBuilder[Self <: IScroller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceleration(value: Double): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
      
      @scala.inline
      def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionLock(value: Boolean): Self = StObject.set(x, "directionLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionLockUndefined: Self = StObject.set(x, "directionLock", js.undefined)
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectionLock(value: () => Boolean): Self = StObject.set(x, "getDirectionLock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectionLockUndefined: Self = StObject.set(x, "getDirectionLock", js.undefined)
      
      @scala.inline
      def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      @scala.inline
      def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
      
      @scala.inline
      def setGetInitialOffset(value: () => _): Self = StObject.set(x, "getInitialOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialOffsetUndefined: Self = StObject.set(x, "getInitialOffset", js.undefined)
      
      @scala.inline
      def setGetMomentumEasing(value: () => _): Self = StObject.set(x, "getMomentumEasing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMomentumEasingUndefined: Self = StObject.set(x, "getMomentumEasing", js.undefined)
      
      @scala.inline
      def setGetSlotSnapEasing(value: () => _): Self = StObject.set(x, "getSlotSnapEasing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlotSnapEasingUndefined: Self = StObject.set(x, "getSlotSnapEasing", js.undefined)
      
      @scala.inline
      def setGetSlotSnapSize(value: () => _): Self = StObject.set(x, "getSlotSnapSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlotSnapSizeUndefined: Self = StObject.set(x, "getSlotSnapSize", js.undefined)
      
      @scala.inline
      def setGetTranslatable(value: () => _): Self = StObject.set(x, "getTranslatable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      @scala.inline
      def setInitialOffset(value: js.Any): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialOffsetUndefined: Self = StObject.set(x, "initialOffset", js.undefined)
      
      @scala.inline
      def setIsAxisEnabled(value: /* axis */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isAxisEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsAxisEnabledUndefined: Self = StObject.set(x, "isAxisEnabled", js.undefined)
      
      @scala.inline
      def setMomentumEasing(value: js.Any): Self = StObject.set(x, "momentumEasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumEasingUndefined: Self = StObject.set(x, "momentumEasing", js.undefined)
      
      @scala.inline
      def setScrollBy(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
      ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
      
      @scala.inline
      def setScrollTo(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setScrollToEnd(value: /* animation */ js.UndefOr[js.Any] => IScroller): Self = StObject.set(x, "scrollToEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToEndUndefined: Self = StObject.set(x, "scrollToEnd", js.undefined)
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDirectionLock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDirectionLockUndefined: Self = StObject.set(x, "setDirectionLock", js.undefined)
      
      @scala.inline
      def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      @scala.inline
      def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
      
      @scala.inline
      def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInitialOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetInitialOffsetUndefined: Self = StObject.set(x, "setInitialOffset", js.undefined)
      
      @scala.inline
      def setSetMomentumEasing(value: /* momentumEasing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMomentumEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMomentumEasingUndefined: Self = StObject.set(x, "setMomentumEasing", js.undefined)
      
      @scala.inline
      def setSetOffset(value: /* offset */ js.UndefOr[js.Any] => IScroller): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOffsetUndefined: Self = StObject.set(x, "setOffset", js.undefined)
      
      @scala.inline
      def setSetSlotSnapEasing(value: /* slotSnapEasing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSlotSnapEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSlotSnapEasingUndefined: Self = StObject.set(x, "setSlotSnapEasing", js.undefined)
      
      @scala.inline
      def setSetSlotSnapSize(value: /* slotSnapSize */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSlotSnapSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSlotSnapSizeUndefined: Self = StObject.set(x, "setSlotSnapSize", js.undefined)
      
      @scala.inline
      def setSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
      
      @scala.inline
      def setSlotSnapSize(value: js.Any): Self = StObject.set(x, "slotSnapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotSnapSizeUndefined: Self = StObject.set(x, "slotSnapSize", js.undefined)
      
      @scala.inline
      def setUpdateBoundary(value: () => IScroller): Self = StObject.set(x, "updateBoundary", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateBoundaryUndefined: Self = StObject.set(x, "updateBoundary", js.undefined)
    }
  }
  
  @js.native
  trait IView extends IEvented {
    
    /** [Method] Returns the value of cls
      * @returns String
      */
    var getCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of indicators
      * @returns Object
      */
    var getIndicators: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of indicatorsHidingDelay
      * @returns Number
      */
    var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of indicatorsUi
      * @returns String
      */
    var getIndicatorsUi: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the scroller instance in this view
      * @returns Ext.scroll.View The scroller
      */
    var getScroller: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Config Option] (String) */
    var indicatorsUi: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Sets the value of cls
      * @param cls String The new value.
      */
    var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of indicators
      * @param indicators Object The new value.
      */
    var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of indicatorsHidingDelay
      * @param indicatorsHidingDelay Number The new value.
      */
    var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of indicatorsUi
      * @param indicatorsUi String The new value.
      */
    var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of scroller
      * @param scroller Object The new value.
      */
    var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IView {
    
    @scala.inline
    def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    @scala.inline
    implicit class IViewMutableBuilder[Self <: IView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      @scala.inline
      def setGetElement(value: () => _): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      @scala.inline
      def setGetIndicators(value: () => _): Self = StObject.set(x, "getIndicators", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndicatorsHidingDelay(value: () => Double): Self = StObject.set(x, "getIndicatorsHidingDelay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "getIndicatorsHidingDelay", js.undefined)
      
      @scala.inline
      def setGetIndicatorsUi(value: () => java.lang.String): Self = StObject.set(x, "getIndicatorsUi", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndicatorsUiUndefined: Self = StObject.set(x, "getIndicatorsUi", js.undefined)
      
      @scala.inline
      def setGetIndicatorsUndefined: Self = StObject.set(x, "getIndicators", js.undefined)
      
      @scala.inline
      def setGetScroller(value: () => IView): Self = StObject.set(x, "getScroller", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollerUndefined: Self = StObject.set(x, "getScroller", js.undefined)
      
      @scala.inline
      def setIndicatorsUi(value: java.lang.String): Self = StObject.set(x, "indicatorsUi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsUiUndefined: Self = StObject.set(x, "indicatorsUi", js.undefined)
      
      @scala.inline
      def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      @scala.inline
      def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      @scala.inline
      def setSetIndicators(value: /* indicators */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setIndicators", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIndicatorsHidingDelay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "setIndicatorsHidingDelay", js.undefined)
      
      @scala.inline
      def setSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setIndicatorsUi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIndicatorsUiUndefined: Self = StObject.set(x, "setIndicatorsUi", js.undefined)
      
      @scala.inline
      def setSetIndicatorsUndefined: Self = StObject.set(x, "setIndicators", js.undefined)
      
      @scala.inline
      def setSetScroller(value: /* scroller */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScroller", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScrollerUndefined: Self = StObject.set(x, "setScroller", js.undefined)
    }
  }
  
  object indicator {
    
    @js.native
    trait IAbstract extends IComponent {
      
      /** [Config Option] (Boolean) */
      var autoHide: js.UndefOr[Boolean] = js.native
      
      /** [Method] Returns the value of active
        * @returns Boolean
        */
      var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
      
      /** [Method] Returns the value of autoHide
        * @returns Boolean
        */
      var getAutoHide: js.UndefOr[js.Function0[Boolean]] = js.native
      
      /** [Method] Returns the value of axis
        * @returns String
        */
      var getAxis: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Returns the value of barCls
        * @returns String
        */
      var getBarCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Returns the value of length
        * @returns Object
        */
      var getLength: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of minLength
        * @returns Number
        */
      var getMinLength: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Returns the value of ratio
        * @returns Number
        */
      var getRatio: js.UndefOr[js.Function0[Double]] = js.native
      
      /** [Method] Returns the value of value
        * @returns Object
        */
      var getValue: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of active
        * @param active Boolean The new value.
        */
      var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
      
      /** [Method] Sets the value of autoHide
        * @param autoHide Boolean The new value.
        */
      var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[Boolean], Unit]] = js.native
      
      /** [Method] Sets the value of axis
        * @param axis String The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Unit]] = js.native
      
      /** [Method] Sets the value of barCls
        * @param barCls String The new value.
        */
      var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[java.lang.String], Unit]] = js.native
      
      /** [Method] Sets the value of length
        * @param length Object The new value.
        */
      var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of minLength
        * @param minLength Number The new value.
        */
      var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[Double], Unit]] = js.native
      
      /** [Method] Sets the value of ratio
        * @param ratio Number The new value.
        */
      var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[Double], Unit]] = js.native
      
      /** [Method] Sets the value of value
        * @param value Object The new value.
        */
      var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    }
    object IAbstract {
      
      @scala.inline
      def apply(): IAbstract = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAbstract]
      }
      
      @scala.inline
      implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
        
        @scala.inline
        def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
        
        @scala.inline
        def setGetAutoHide(value: () => Boolean): Self = StObject.set(x, "getAutoHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAutoHideUndefined: Self = StObject.set(x, "getAutoHide", js.undefined)
        
        @scala.inline
        def setGetAxis(value: () => java.lang.String): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        @scala.inline
        def setGetBarCls(value: () => java.lang.String): Self = StObject.set(x, "getBarCls", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetBarClsUndefined: Self = StObject.set(x, "getBarCls", js.undefined)
        
        @scala.inline
        def setGetLength(value: () => _): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLengthUndefined: Self = StObject.set(x, "getLength", js.undefined)
        
        @scala.inline
        def setGetMinLength(value: () => Double): Self = StObject.set(x, "getMinLength", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetMinLengthUndefined: Self = StObject.set(x, "getMinLength", js.undefined)
        
        @scala.inline
        def setGetRatio(value: () => Double): Self = StObject.set(x, "getRatio", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetRatioUndefined: Self = StObject.set(x, "getRatio", js.undefined)
        
        @scala.inline
        def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
        
        @scala.inline
        def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
        
        @scala.inline
        def setSetAutoHide(value: /* autoHide */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoHide", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAutoHideUndefined: Self = StObject.set(x, "setAutoHide", js.undefined)
        
        @scala.inline
        def setSetAxis(value: /* axis */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        @scala.inline
        def setSetBarCls(value: /* barCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBarCls", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetBarClsUndefined: Self = StObject.set(x, "setBarCls", js.undefined)
        
        @scala.inline
        def setSetLength(value: /* length */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLengthUndefined: Self = StObject.set(x, "setLength", js.undefined)
        
        @scala.inline
        def setSetMinLength(value: /* minLength */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinLength", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMinLengthUndefined: Self = StObject.set(x, "setMinLength", js.undefined)
        
        @scala.inline
        def setSetRatio(value: /* ratio */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRatio", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetRatioUndefined: Self = StObject.set(x, "setRatio", js.undefined)
        
        @scala.inline
        def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      }
    }
    
    @js.native
    trait ICssTransform extends IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_ICssTransform: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_ICssTransform: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    }
    object ICssTransform {
      
      @scala.inline
      def apply(): ICssTransform = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICssTransform]
      }
      
      @scala.inline
      implicit class ICssTransformMutableBuilder[Self <: ICssTransform] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        @scala.inline
        def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    @js.native
    trait IRounded extends IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IRounded: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IRounded: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    }
    object IRounded {
      
      @scala.inline
      def apply(): IRounded = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRounded]
      }
      
      @scala.inline
      implicit class IRoundedMutableBuilder[Self <: IRounded] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        @scala.inline
        def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    @js.native
    trait IScrollPosition extends IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IScrollPosition: js.UndefOr[js.Function0[java.lang.String]] = js.native
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IScrollPosition: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
    }
    object IScrollPosition {
      
      @scala.inline
      def apply(): IScrollPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScrollPosition]
      }
      
      @scala.inline
      implicit class IScrollPositionMutableBuilder[Self <: IScrollPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        @scala.inline
        def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
  }
}
