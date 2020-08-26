package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait listenToDocOptions extends js.Object {
  /**
    * The context of your component.
    */
  var context: js.Object = js.native
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.native
}

object listenToDocOptions {
  @scala.inline
  def apply(context: js.Object): listenToDocOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[listenToDocOptions]
  }
  @scala.inline
  implicit class listenToDocOptionsOps[Self <: listenToDocOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFailure(value: () => Unit): Self = this.set("onFailure", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setThen(value: () => Unit): Self = this.set("then", js.Any.fromFunction0(value))
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
  
}

