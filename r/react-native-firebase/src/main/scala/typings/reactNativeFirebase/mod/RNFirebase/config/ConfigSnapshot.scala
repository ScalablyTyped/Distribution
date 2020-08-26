package typings.reactNativeFirebase.mod.RNFirebase.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigSnapshot extends js.Object {
  var source: String = js.native
  def `val`(): js.Any = js.native
}

object ConfigSnapshot {
  @scala.inline
  def apply(source: String, `val`: () => js.Any): ConfigSnapshot = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[ConfigSnapshot]
  }
  @scala.inline
  implicit class ConfigSnapshotOps[Self <: ConfigSnapshot] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: () => js.Any): Self = this.set("val", js.Any.fromFunction0(value))
  }
  
}

