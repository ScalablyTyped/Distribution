package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carousel {
  
  trait ICarousel
    extends StObject
       with IContainer {
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the index of the currently active card
      * @returns Number The index of the currently active card.
      */
    var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of animation
      * @returns Object
      */
    var getAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of bufferSize
      * @returns Number
      */
    var getBufferSize: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of directionLock
      * @returns Boolean
      */
    var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of indicator
      * @returns any
      */
    var getIndicator: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of itemConfig
      * @returns Object
      */
    var getItemConfig: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of itemLength
      * @returns Object
      */
    var getItemLength: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var indicator: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns true when direction is horizontal
      * @returns Boolean
      */
    var isHorizontal: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns true when direction is vertical
      * @returns Boolean
      */
    var isVertical: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Switches to the next card
      * @returns Ext.carousel.Carousel this
      */
    var next: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Switches to the previous card
      * @returns Ext.carousel.Carousel this
      */
    var prev: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Switches to the previous card
      * @returns Ext.carousel.Carousel this
      */
    var previous: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Sets the value of animation
      * @param animation Object The new value.
      */
    var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of bufferSize
      * @param bufferSize Number The new value.
      */
    var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of directionLock
      * @param directionLock Boolean The new value.
      */
    var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicator
      * @param indicator Boolean The new value.
      */
    var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of itemConfig
      * @param itemConfig Object The new value.
      */
    var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of itemLength
      * @param itemLength Object The new value.
      */
    var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ICarousel {
    
    inline def apply(): typings.senchaTouch.Ext.carousel.ICarousel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.carousel.ICarousel]
    }
    
    extension [Self <: typings.senchaTouch.Ext.carousel.ICarousel](x: Self) {
      
      inline def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetActiveIndex(value: () => Double): Self = StObject.set(x, "getActiveIndex", js.Any.fromFunction0(value))
      
      inline def setGetActiveIndexUndefined: Self = StObject.set(x, "getActiveIndex", js.undefined)
      
      inline def setGetAnimation(value: () => Any): Self = StObject.set(x, "getAnimation", js.Any.fromFunction0(value))
      
      inline def setGetAnimationUndefined: Self = StObject.set(x, "getAnimation", js.undefined)
      
      inline def setGetBufferSize(value: () => Double): Self = StObject.set(x, "getBufferSize", js.Any.fromFunction0(value))
      
      inline def setGetBufferSizeUndefined: Self = StObject.set(x, "getBufferSize", js.undefined)
      
      inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionLock(value: () => Boolean): Self = StObject.set(x, "getDirectionLock", js.Any.fromFunction0(value))
      
      inline def setGetDirectionLockUndefined: Self = StObject.set(x, "getDirectionLock", js.undefined)
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetIndicator(value: () => Any): Self = StObject.set(x, "getIndicator", js.Any.fromFunction0(value))
      
      inline def setGetIndicatorUndefined: Self = StObject.set(x, "getIndicator", js.undefined)
      
      inline def setGetItemConfig(value: () => Any): Self = StObject.set(x, "getItemConfig", js.Any.fromFunction0(value))
      
      inline def setGetItemConfigUndefined: Self = StObject.set(x, "getItemConfig", js.undefined)
      
      inline def setGetItemLength(value: () => Any): Self = StObject.set(x, "getItemLength", js.Any.fromFunction0(value))
      
      inline def setGetItemLengthUndefined: Self = StObject.set(x, "getItemLength", js.undefined)
      
      inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setIsHorizontal(value: () => Boolean): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
      
      inline def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      inline def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setNext(value: () => typings.senchaTouch.Ext.carousel.ICarousel): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: () => typings.senchaTouch.Ext.carousel.ICarousel): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setPrevious(value: () => typings.senchaTouch.Ext.carousel.ICarousel): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setSetAnimation(value: /* animation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAnimation", js.Any.fromFunction1(value))
      
      inline def setSetAnimationUndefined: Self = StObject.set(x, "setAnimation", js.undefined)
      
      inline def setSetBufferSize(value: /* bufferSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setBufferSize", js.Any.fromFunction1(value))
      
      inline def setSetBufferSizeUndefined: Self = StObject.set(x, "setBufferSize", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDirectionLock", js.Any.fromFunction1(value))
      
      inline def setSetDirectionLockUndefined: Self = StObject.set(x, "setDirectionLock", js.undefined)
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIndicator", js.Any.fromFunction1(value))
      
      inline def setSetIndicatorUndefined: Self = StObject.set(x, "setIndicator", js.undefined)
      
      inline def setSetItemConfig(value: /* itemConfig */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setItemConfig", js.Any.fromFunction1(value))
      
      inline def setSetItemConfigUndefined: Self = StObject.set(x, "setItemConfig", js.undefined)
      
      inline def setSetItemLength(value: /* itemLength */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setItemLength", js.Any.fromFunction1(value))
      
      inline def setSetItemLengthUndefined: Self = StObject.set(x, "setItemLength", js.undefined)
    }
  }
  
  trait IIndicator
    extends StObject
       with IComponent {
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  }
  object IIndicator {
    
    inline def apply(): IIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIndicator]
    }
    
    extension [Self <: IIndicator](x: Self) {
      
      inline def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    }
  }
  
  trait IInfinite
    extends StObject
       with typings.senchaTouch.Ext.carousel.ICarousel {
    
    /** [Method] Returns the value of innerItemConfig
      * @returns Object
      */
    var getInnerItemConfig: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of maxItemIndex
      * @returns Object
      */
    var getMaxItemIndex: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of indicator
      * @param indicator Object The new value.
      */
    @JSName("setIndicator")
    var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of innerItemConfig
      * @param innerItemConfig Object The new value.
      */
    var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxItemIndex
      * @param maxItemIndex Object The new value.
      */
    var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IInfinite {
    
    inline def apply(): IInfinite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInfinite]
    }
    
    extension [Self <: IInfinite](x: Self) {
      
      inline def setGetInnerItemConfig(value: () => Any): Self = StObject.set(x, "getInnerItemConfig", js.Any.fromFunction0(value))
      
      inline def setGetInnerItemConfigUndefined: Self = StObject.set(x, "getInnerItemConfig", js.undefined)
      
      inline def setGetMaxItemIndex(value: () => Any): Self = StObject.set(x, "getMaxItemIndex", js.Any.fromFunction0(value))
      
      inline def setGetMaxItemIndexUndefined: Self = StObject.set(x, "getMaxItemIndex", js.undefined)
      
      inline def setSetIndicator(value: /* indicator */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setIndicator", js.Any.fromFunction1(value))
      
      inline def setSetIndicatorUndefined: Self = StObject.set(x, "setIndicator", js.undefined)
      
      inline def setSetInnerItemConfig(value: /* innerItemConfig */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInnerItemConfig", js.Any.fromFunction1(value))
      
      inline def setSetInnerItemConfigUndefined: Self = StObject.set(x, "setInnerItemConfig", js.undefined)
      
      inline def setSetMaxItemIndex(value: /* maxItemIndex */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMaxItemIndex", js.Any.fromFunction1(value))
      
      inline def setSetMaxItemIndexUndefined: Self = StObject.set(x, "setMaxItemIndex", js.undefined)
    }
  }
  
  trait IItem
    extends StObject
       with IDecorator {
    
    /** [Method] Returns the value of translatable
      * @returns Boolean
      */
    var getTranslatable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Boolean The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IItem {
    
    inline def apply(): IItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItem]
    }
    
    extension [Self <: IItem](x: Self) {
      
      inline def setGetTranslatable(value: () => Boolean): Self = StObject.set(x, "getTranslatable", js.Any.fromFunction0(value))
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1(value))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
    }
  }
}
