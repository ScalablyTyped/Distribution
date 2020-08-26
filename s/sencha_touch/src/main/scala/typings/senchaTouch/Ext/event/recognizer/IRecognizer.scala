package typings.senchaTouch.Ext.event.recognizer

import typings.senchaTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecognizer extends IIdentifiable {
  /** [Method] Returns the value of callbackScope
    * @returns Object
    */
  var getCallbackScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Retrieves the id of this component
    * @returns String id
    */
  @JSName("getId")
  var getId_IRecognizer: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of onFailed
    * @returns Object
    */
  var getOnFailed: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of onRecognized
    * @returns Object
    */
  var getOnRecognized: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of callbackScope
    * @param callbackScope Object The new value.
    */
  var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onFailed
    * @param onFailed Object The new value.
    */
  var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onRecognized
    * @param onRecognized Object The new value.
    */
  var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRecognizer {
  @scala.inline
  def apply(): IRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecognizer]
  }
  @scala.inline
  implicit class IRecognizerOps[Self <: IRecognizer] (val x: Self) extends AnyVal {
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
    def setGetCallbackScope(value: () => _): Self = this.set("getCallbackScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCallbackScope: Self = this.set("getCallbackScope", js.undefined)
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setGetOnFailed(value: () => _): Self = this.set("getOnFailed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOnFailed: Self = this.set("getOnFailed", js.undefined)
    @scala.inline
    def setGetOnRecognized(value: () => _): Self = this.set("getOnRecognized", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOnRecognized: Self = this.set("getOnRecognized", js.undefined)
    @scala.inline
    def setSetCallbackScope(value: /* callbackScope */ js.UndefOr[js.Any] => Unit): Self = this.set("setCallbackScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCallbackScope: Self = this.set("setCallbackScope", js.undefined)
    @scala.inline
    def setSetOnFailed(value: /* onFailed */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnFailed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOnFailed: Self = this.set("setOnFailed", js.undefined)
    @scala.inline
    def setSetOnRecognized(value: /* onRecognized */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnRecognized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOnRecognized: Self = this.set("setOnRecognized", js.undefined)
  }
  
}

