package typings.senchaTouch.Ext.chart.axis.segmenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INames extends ISegmenter {
  /** [Method] Add step units to the value
    * @param value Object
    * @param step Object
    * @param unit Object
    */
  @JSName("add")
  var add_INames: js.UndefOr[
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
  var align_INames: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* step */ js.UndefOr[js.Any], 
      /* unit */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Given a start point and estimated step size of a range determine the preferred step size
    * @param min Object
    * @param estStepSize Object
    * @param minIdx Object
    * @param data Object
    * @returns Object Return the step size by an object of step x unit.
    */
  @JSName("preferredStep")
  var preferredStep_INames: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      /* minIdx */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
}

object INames {
  @scala.inline
  def apply(): INames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INames]
  }
  @scala.inline
  implicit class INamesOps[Self <: INames] (val x: Self) extends AnyVal {
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
    def setPreferredStep(
      value: (/* min */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], /* minIdx */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => _
    ): Self = this.set("preferredStep", js.Any.fromFunction4(value))
    @scala.inline
    def deletePreferredStep: Self = this.set("preferredStep", js.undefined)
  }
  
}

