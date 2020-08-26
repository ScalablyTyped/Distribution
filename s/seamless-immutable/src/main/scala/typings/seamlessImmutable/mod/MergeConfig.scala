package typings.seamlessImmutable.mod

import typings.seamlessImmutable.seamlessImmutableStrings.merge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeConfig extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var merger: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* config */ js.Any, _]] = js.native
  var mode: js.UndefOr[typings.seamlessImmutable.seamlessImmutableStrings.replace | merge] = js.native
}

object MergeConfig {
  @scala.inline
  def apply(): MergeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeConfig]
  }
  @scala.inline
  implicit class MergeConfigOps[Self <: MergeConfig] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setMerger(value: (/* a */ js.Any, /* b */ js.Any, /* config */ js.Any) => _): Self = this.set("merger", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMerger: Self = this.set("merger", js.undefined)
    @scala.inline
    def setMode(value: typings.seamlessImmutable.seamlessImmutableStrings.replace | merge): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

