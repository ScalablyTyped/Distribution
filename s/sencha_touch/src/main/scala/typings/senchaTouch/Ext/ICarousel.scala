package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICarousel extends IContainer {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the index of the currently active card
    * @returns Number The index of the currently active card.
    */
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of animation
    * @returns Object
    */
  var getAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of bufferSize
    * @returns Number
    */
  var getBufferSize: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of directionLock
    * @returns Boolean
    */
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of indicator
    * @returns any
    */
  var getIndicator: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of itemConfig
    * @returns Object
    */
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of itemLength
    * @returns Object
    */
  var getItemLength: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true when direction is horizontal
    * @returns Boolean
    */
  var isHorizontal: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true when direction is vertical
    * @returns Boolean
    */
  var isVertical: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Switches to the next card
    * @returns Ext.carousel.Carousel this
    */
  var next: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Switches to the previous card
    * @returns Ext.carousel.Carousel this
    */
  var prev: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Switches to the previous card
    * @returns Ext.carousel.Carousel this
    */
  var previous: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Sets the value of animation
    * @param animation Object The new value.
    */
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of bufferSize
    * @param bufferSize Number The new value.
    */
  var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of directionLock
    * @param directionLock Boolean The new value.
    */
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of indicator
    * @param indicator Boolean The new value.
    */
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of itemConfig
    * @param itemConfig Object The new value.
    */
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of itemLength
    * @param itemLength Object The new value.
    */
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.native
}
object ICarousel {
  
  @scala.inline
  def apply(): ICarousel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICarousel]
  }
  
  @scala.inline
  implicit class ICarouselMutableBuilder[Self <: ICarousel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGetActiveIndex(value: () => Double): Self = StObject.set(x, "getActiveIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveIndexUndefined: Self = StObject.set(x, "getActiveIndex", js.undefined)
    
    @scala.inline
    def setGetAnimation(value: () => _): Self = StObject.set(x, "getAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnimationUndefined: Self = StObject.set(x, "getAnimation", js.undefined)
    
    @scala.inline
    def setGetBufferSize(value: () => Double): Self = StObject.set(x, "getBufferSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBufferSizeUndefined: Self = StObject.set(x, "getBufferSize", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => java.lang.String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionLock(value: () => Boolean): Self = StObject.set(x, "getDirectionLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionLockUndefined: Self = StObject.set(x, "getDirectionLock", js.undefined)
    
    @scala.inline
    def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    @scala.inline
    def setGetIndicator(value: () => _): Self = StObject.set(x, "getIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorUndefined: Self = StObject.set(x, "getIndicator", js.undefined)
    
    @scala.inline
    def setGetItemConfig(value: () => _): Self = StObject.set(x, "getItemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemConfigUndefined: Self = StObject.set(x, "getItemConfig", js.undefined)
    
    @scala.inline
    def setGetItemLength(value: () => _): Self = StObject.set(x, "getItemLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemLengthUndefined: Self = StObject.set(x, "getItemLength", js.undefined)
    
    @scala.inline
    def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setIsHorizontal(value: () => Boolean): Self = StObject.set(x, "isHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
    
    @scala.inline
    def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    @scala.inline
    def setNext(value: () => ICarousel): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrev(value: () => ICarousel): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setPrevious(value: () => ICarousel): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setSetAnimation(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnimationUndefined: Self = StObject.set(x, "setAnimation", js.undefined)
    
    @scala.inline
    def setSetBufferSize(value: /* bufferSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setBufferSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBufferSizeUndefined: Self = StObject.set(x, "setBufferSize", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDirectionLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectionLockUndefined: Self = StObject.set(x, "setDirectionLock", js.undefined)
    
    @scala.inline
    def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    @scala.inline
    def setSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIndicatorUndefined: Self = StObject.set(x, "setIndicator", js.undefined)
    
    @scala.inline
    def setSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemConfigUndefined: Self = StObject.set(x, "setItemConfig", js.undefined)
    
    @scala.inline
    def setSetItemLength(value: /* itemLength */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItemLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemLengthUndefined: Self = StObject.set(x, "setItemLength", js.undefined)
  }
}
