package typings.senchaTouch.Ext.scroll

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScroller extends IEvented {
  
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var friction: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  
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
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Boolean]] = js.native
  
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
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
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
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
    
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
    def setAcceleration(value: Double): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleration: Self = this.set("acceleration", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionLock(value: Boolean): Self = this.set("directionLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionLock: Self = this.set("directionLock", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetDirectionLock(value: () => Boolean): Self = this.set("getDirectionLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirectionLock: Self = this.set("getDirectionLock", js.undefined)
    
    @scala.inline
    def setGetDisabled(value: () => Boolean): Self = this.set("getDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisabled: Self = this.set("getDisabled", js.undefined)
    
    @scala.inline
    def setGetInitialOffset(value: () => _): Self = this.set("getInitialOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialOffset: Self = this.set("getInitialOffset", js.undefined)
    
    @scala.inline
    def setGetMomentumEasing(value: () => _): Self = this.set("getMomentumEasing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMomentumEasing: Self = this.set("getMomentumEasing", js.undefined)
    
    @scala.inline
    def setGetSlotSnapEasing(value: () => _): Self = this.set("getSlotSnapEasing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSlotSnapEasing: Self = this.set("getSlotSnapEasing", js.undefined)
    
    @scala.inline
    def setGetSlotSnapSize(value: () => _): Self = this.set("getSlotSnapSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSlotSnapSize: Self = this.set("getSlotSnapSize", js.undefined)
    
    @scala.inline
    def setGetTranslatable(value: () => _): Self = this.set("getTranslatable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTranslatable: Self = this.set("getTranslatable", js.undefined)
    
    @scala.inline
    def setInitialOffset(value: js.Any): Self = this.set("initialOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialOffset: Self = this.set("initialOffset", js.undefined)
    
    @scala.inline
    def setIsAxisEnabled(value: /* axis */ js.UndefOr[String] => Boolean): Self = this.set("isAxisEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsAxisEnabled: Self = this.set("isAxisEnabled", js.undefined)
    
    @scala.inline
    def setMomentumEasing(value: js.Any): Self = this.set("momentumEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentumEasing: Self = this.set("momentumEasing", js.undefined)
    
    @scala.inline
    def setScrollBy(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
    ): Self = this.set("scrollBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScrollBy: Self = this.set("scrollBy", js.undefined)
    
    @scala.inline
    def setScrollTo(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
    ): Self = this.set("scrollTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    
    @scala.inline
    def setScrollToEnd(value: /* animation */ js.UndefOr[js.Any] => IScroller): Self = this.set("scrollToEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollToEnd: Self = this.set("scrollToEnd", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = this.set("setDirectionLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirectionLock: Self = this.set("setDirectionLock", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[js.Any] => Unit): Self = this.set("setInitialOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInitialOffset: Self = this.set("setInitialOffset", js.undefined)
    
    @scala.inline
    def setSetMomentumEasing(value: /* momentumEasing */ js.UndefOr[js.Any] => Unit): Self = this.set("setMomentumEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMomentumEasing: Self = this.set("setMomentumEasing", js.undefined)
    
    @scala.inline
    def setSetOffset(value: /* offset */ js.UndefOr[js.Any] => IScroller): Self = this.set("setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOffset: Self = this.set("setOffset", js.undefined)
    
    @scala.inline
    def setSetSlotSnapEasing(value: /* slotSnapEasing */ js.UndefOr[js.Any] => Unit): Self = this.set("setSlotSnapEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSlotSnapEasing: Self = this.set("setSlotSnapEasing", js.undefined)
    
    @scala.inline
    def setSetSlotSnapSize(value: /* slotSnapSize */ js.UndefOr[js.Any] => Unit): Self = this.set("setSlotSnapSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSlotSnapSize: Self = this.set("setSlotSnapSize", js.undefined)
    
    @scala.inline
    def setSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = this.set("setTranslatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTranslatable: Self = this.set("setTranslatable", js.undefined)
    
    @scala.inline
    def setSlotSnapSize(value: js.Any): Self = this.set("slotSnapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotSnapSize: Self = this.set("slotSnapSize", js.undefined)
    
    @scala.inline
    def setUpdateBoundary(value: () => IScroller): Self = this.set("updateBoundary", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdateBoundary: Self = this.set("updateBoundary", js.undefined)
  }
}
