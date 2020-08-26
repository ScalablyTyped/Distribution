package typings.senchaTouch.Ext.device.camera

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimulator extends IAbstract {
  /** [Method] Allows you to capture a photo
    * @param options Object
    */
  @JSName("capture")
  var capture_ISimulator: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of samples
    * @returns Array
    */
  var getSamples: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of samples
    * @param samples Array The new value.
    */
  var setSamples: js.UndefOr[js.Function1[/* samples */ js.UndefOr[Array], Unit]] = js.native
}

object ISimulator {
  @scala.inline
  def apply(): ISimulator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimulator]
  }
  @scala.inline
  implicit class ISimulatorOps[Self <: ISimulator] (val x: Self) extends AnyVal {
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
    def setCapture(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("capture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setGetSamples(value: () => Array): Self = this.set("getSamples", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSamples: Self = this.set("getSamples", js.undefined)
    @scala.inline
    def setSetSamples(value: /* samples */ js.UndefOr[Array] => Unit): Self = this.set("setSamples", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSamples: Self = this.set("setSamples", js.undefined)
  }
  
}

