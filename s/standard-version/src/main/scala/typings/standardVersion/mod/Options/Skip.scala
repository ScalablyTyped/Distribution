package typings.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'bump' | 'changelog' | 'commit' | 'tag', boolean>> */
@js.native
trait Skip extends js.Object {
  var bump: js.UndefOr[Boolean] = js.native
  var changelog: js.UndefOr[Boolean] = js.native
  var commit: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[Boolean] = js.native
}

object Skip {
  @scala.inline
  def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  @scala.inline
  implicit class SkipOps[Self <: Skip] (val x: Self) extends AnyVal {
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
    def setBump(value: Boolean): Self = this.set("bump", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBump: Self = this.set("bump", js.undefined)
    @scala.inline
    def setChangelog(value: Boolean): Self = this.set("changelog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangelog: Self = this.set("changelog", js.undefined)
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

