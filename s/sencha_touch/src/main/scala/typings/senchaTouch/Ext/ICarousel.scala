package typings.senchaTouch.Ext

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
  implicit class ICarouselOps[Self <: ICarousel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: java.lang.String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGetActiveIndex(value: () => Double): Self = this.set("getActiveIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveIndex: Self = this.set("getActiveIndex", js.undefined)
    
    @scala.inline
    def setGetAnimation(value: () => _): Self = this.set("getAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnimation: Self = this.set("getAnimation", js.undefined)
    
    @scala.inline
    def setGetBufferSize(value: () => Double): Self = this.set("getBufferSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBufferSize: Self = this.set("getBufferSize", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => java.lang.String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetDirectionLock(value: () => Boolean): Self = this.set("getDirectionLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirectionLock: Self = this.set("getDirectionLock", js.undefined)
    
    @scala.inline
    def setGetIndicator(value: () => _): Self = this.set("getIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIndicator: Self = this.set("getIndicator", js.undefined)
    
    @scala.inline
    def setGetItemConfig(value: () => _): Self = this.set("getItemConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemConfig: Self = this.set("getItemConfig", js.undefined)
    
    @scala.inline
    def setGetItemLength(value: () => _): Self = this.set("getItemLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemLength: Self = this.set("getItemLength", js.undefined)
    
    @scala.inline
    def setIndicator(value: Boolean): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setIsHorizontal(value: () => Boolean): Self = this.set("isHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsHorizontal: Self = this.set("isHorizontal", js.undefined)
    
    @scala.inline
    def setIsVertical(value: () => Boolean): Self = this.set("isVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
    
    @scala.inline
    def setNext(value: () => ICarousel): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrev(value: () => ICarousel): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setPrevious(value: () => ICarousel): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setSetAnimation(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = this.set("setAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAnimation: Self = this.set("setAnimation", js.undefined)
    
    @scala.inline
    def setSetBufferSize(value: /* bufferSize */ js.UndefOr[Double] => Unit): Self = this.set("setBufferSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBufferSize: Self = this.set("setBufferSize", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = this.set("setDirectionLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirectionLock: Self = this.set("setDirectionLock", js.undefined)
    
    @scala.inline
    def setSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = this.set("setIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIndicator: Self = this.set("setIndicator", js.undefined)
    
    @scala.inline
    def setSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemConfig: Self = this.set("setItemConfig", js.undefined)
    
    @scala.inline
    def setSetItemLength(value: /* itemLength */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemLength: Self = this.set("setItemLength", js.undefined)
  }
}
