package typings.ractive.mod

import typings.ractive.ractiveBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. Cannot be used with enhance. */
  @JSName("append")
  var append_InitOpts: js.UndefOr[`true`] = js.native
  /** Initiial data for this instance. */
  var data: js.UndefOr[Data | DataFn[T]] = js.native
  /** The target element into which to render this instance. */
  var el: js.UndefOr[Target] = js.native
  /** If true, this instance will try to reuse DOM nodes found in its target rather than discarding and replacing them. Cannot be used with append. */
  var enhance: js.UndefOr[`true`] = js.native
  /** The target element into which to render this instance. */
  var target: js.UndefOr[Target] = js.native
  /** An array of plugins to apply to the instance. */
  var use: js.UndefOr[js.Array[PluginInstance]] = js.native
}

object InitOpts {
  @scala.inline
  def apply[/* <: typings.ractive.mod.Ractive[T] */ T](): InitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOpts[T]]
  }
  @scala.inline
  implicit class InitOptsOps[Self <: InitOpts[_], /* <: typings.ractive.mod.Ractive[T] */ T] (val x: Self with InitOpts[T]) extends AnyVal {
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
    def setAppend(value: `true`): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setData(value: Data | DataFn[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEl(value: Target): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setEnhance(value: `true`): Self = this.set("enhance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhance: Self = this.set("enhance", js.undefined)
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUseVarargs(value: PluginInstance*): Self = this.set("use", js.Array(value :_*))
    @scala.inline
    def setUse(value: js.Array[PluginInstance]): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

