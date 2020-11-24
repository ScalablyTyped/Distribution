package typings.senchaTouch.Ext.fx.animation

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IEvented {
  
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of after
    * @returns Object
    */
  var getAfter: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of before
    * @returns Object
    */
  var getBefore: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of delay
    * @returns Number
    */
  var getDelay: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of duration
    * @returns Number
    */
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of easing
    * @returns String
    */
  var getEasing: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of iteration
    * @returns Number
    */
  var getIteration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of onBeforeEnd
    * @returns Object
    */
  var getOnBeforeEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of onBeforeStart
    * @returns Object
    */
  var getOnBeforeStart: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of onEnd
    * @returns Object
    */
  var getOnEnd: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of preserveEndState
    * @returns Boolean
    */
  var getPreserveEndState: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of replacePrevious
    * @returns Boolean
    */
  var getReplacePrevious: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of reverse
    * @returns Object
    */
  var getReverse: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of after
    * @param after Object The new value.
    */
  var setAfter: js.UndefOr[js.Function1[/* after */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of before
    * @param before Object The new value.
    */
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of delay
    * @param delay Number The new value.
    */
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of duration
    * @param duration Number The new value.
    */
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of easing
    * @param easing String The new value.
    */
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of iteration
    * @param iteration Number The new value.
    */
  var setIteration: js.UndefOr[js.Function1[/* iteration */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of onBeforeEnd
    * @param onBeforeEnd Object The new value.
    */
  var setOnBeforeEnd: js.UndefOr[js.Function1[/* onBeforeEnd */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of onBeforeStart
    * @param onBeforeStart Object The new value.
    */
  var setOnBeforeStart: js.UndefOr[js.Function1[/* onBeforeStart */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of onEnd
    * @param onEnd Object The new value.
    */
  var setOnEnd: js.UndefOr[js.Function1[/* onEnd */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of preserveEndState
    * @param preserveEndState Boolean The new value.
    */
  var setPreserveEndState: js.UndefOr[js.Function1[/* preserveEndState */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of replacePrevious
    * @param replacePrevious Boolean The new value.
    */
  var setReplacePrevious: js.UndefOr[js.Function1[/* replacePrevious */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of reverse
    * @param reverse Object The new value.
    */
  var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}
object IAbstract {
  
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    
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
    def setBefore(value: js.Any): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setGetAfter(value: () => _): Self = this.set("getAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAfter: Self = this.set("getAfter", js.undefined)
    
    @scala.inline
    def setGetBefore(value: () => _): Self = this.set("getBefore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBefore: Self = this.set("getBefore", js.undefined)
    
    @scala.inline
    def setGetDelay(value: () => Double): Self = this.set("getDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDelay: Self = this.set("getDelay", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    
    @scala.inline
    def setGetEasing(value: () => String): Self = this.set("getEasing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEasing: Self = this.set("getEasing", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    
    @scala.inline
    def setGetIteration(value: () => Double): Self = this.set("getIteration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIteration: Self = this.set("getIteration", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    
    @scala.inline
    def setGetOnBeforeEnd(value: () => _): Self = this.set("getOnBeforeEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOnBeforeEnd: Self = this.set("getOnBeforeEnd", js.undefined)
    
    @scala.inline
    def setGetOnBeforeStart(value: () => _): Self = this.set("getOnBeforeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOnBeforeStart: Self = this.set("getOnBeforeStart", js.undefined)
    
    @scala.inline
    def setGetOnEnd(value: () => _): Self = this.set("getOnEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOnEnd: Self = this.set("getOnEnd", js.undefined)
    
    @scala.inline
    def setGetPreserveEndState(value: () => Boolean): Self = this.set("getPreserveEndState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreserveEndState: Self = this.set("getPreserveEndState", js.undefined)
    
    @scala.inline
    def setGetReplacePrevious(value: () => Boolean): Self = this.set("getReplacePrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetReplacePrevious: Self = this.set("getReplacePrevious", js.undefined)
    
    @scala.inline
    def setGetReverse(value: () => _): Self = this.set("getReverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetReverse: Self = this.set("getReverse", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    
    @scala.inline
    def setSetAfter(value: /* after */ js.UndefOr[js.Any] => Unit): Self = this.set("setAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAfter: Self = this.set("setAfter", js.undefined)
    
    @scala.inline
    def setSetBefore(value: /* before */ js.UndefOr[js.Any] => Unit): Self = this.set("setBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBefore: Self = this.set("setBefore", js.undefined)
    
    @scala.inline
    def setSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = this.set("setDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDelay: Self = this.set("setDelay", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDuration: Self = this.set("setDuration", js.undefined)
    
    @scala.inline
    def setSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = this.set("setEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEasing: Self = this.set("setEasing", js.undefined)
    
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
    
    @scala.inline
    def setSetIteration(value: /* iteration */ js.UndefOr[Double] => Unit): Self = this.set("setIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIteration: Self = this.set("setIteration", js.undefined)
    
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    
    @scala.inline
    def setSetOnBeforeEnd(value: /* onBeforeEnd */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnBeforeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOnBeforeEnd: Self = this.set("setOnBeforeEnd", js.undefined)
    
    @scala.inline
    def setSetOnBeforeStart(value: /* onBeforeStart */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnBeforeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOnBeforeStart: Self = this.set("setOnBeforeStart", js.undefined)
    
    @scala.inline
    def setSetOnEnd(value: /* onEnd */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOnEnd: Self = this.set("setOnEnd", js.undefined)
    
    @scala.inline
    def setSetPreserveEndState(value: /* preserveEndState */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreserveEndState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPreserveEndState: Self = this.set("setPreserveEndState", js.undefined)
    
    @scala.inline
    def setSetReplacePrevious(value: /* replacePrevious */ js.UndefOr[Boolean] => Unit): Self = this.set("setReplacePrevious", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReplacePrevious: Self = this.set("setReplacePrevious", js.undefined)
    
    @scala.inline
    def setSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = this.set("setReverse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReverse: Self = this.set("setReverse", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
  }
}
