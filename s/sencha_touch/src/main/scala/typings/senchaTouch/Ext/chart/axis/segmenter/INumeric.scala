package typings.senchaTouch.Ext.chart.axis.segmenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumeric extends ISegmenter {
  
  /** [Method] Add step units to the value
    * @param value Object
    * @param step Object
    * @param unit Object
    */
  @JSName("add")
  var add_INumeric: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Align value with step of units
    * @param value Object
    * @param step Object
    * @param unit Object
    * @returns * Aligned value.
    */
  @JSName("align")
  var align_INumeric: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Wraps the provided estimated step size of a range without altering it into a step size object
    * @param start * The start point of range.
    * @param estStepSize * The estimated step size.
    * @returns Object Return the step size by an object of step x unit.
    */
  var exactStep: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
  ] = js.native
}
object INumeric {
  
  @scala.inline
  def apply(): INumeric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumeric]
  }
  
  @scala.inline
  implicit class INumericOps[Self <: INumeric] (val x: Self) extends AnyVal {
    
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
    def setAdd(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAlign(
      value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => _
    ): Self = this.set("align", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setExactStep(value: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _): Self = this.set("exactStep", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExactStep: Self = this.set("exactStep", js.undefined)
  }
}
