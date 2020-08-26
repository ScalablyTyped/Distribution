package typings.sentryWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCommitsOptions extends js.Object {
  var auto: js.UndefOr[Boolean] = js.native
  var commit: js.UndefOr[String] = js.native
  var previousCommit: js.UndefOr[String] = js.native
  var repo: String = js.native
}

object SetCommitsOptions {
  @scala.inline
  def apply(repo: String): SetCommitsOptions = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCommitsOptions]
  }
  @scala.inline
  implicit class SetCommitsOptionsOps[Self <: SetCommitsOptions] (val x: Self) extends AnyVal {
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
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setPreviousCommit(value: String): Self = this.set("previousCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousCommit: Self = this.set("previousCommit", js.undefined)
  }
  
}

