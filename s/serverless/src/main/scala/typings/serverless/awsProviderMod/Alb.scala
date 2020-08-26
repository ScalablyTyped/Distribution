package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alb extends js.Object {
  var authorizers: js.UndefOr[Authorizers] = js.native
  var targetGroupPrefix: js.UndefOr[String] = js.native
}

object Alb {
  @scala.inline
  def apply(): Alb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alb]
  }
  @scala.inline
  implicit class AlbOps[Self <: Alb] (val x: Self) extends AnyVal {
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
    def setAuthorizers(value: Authorizers): Self = this.set("authorizers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizers: Self = this.set("authorizers", js.undefined)
    @scala.inline
    def setTargetGroupPrefix(value: String): Self = this.set("targetGroupPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupPrefix: Self = this.set("targetGroupPrefix", js.undefined)
  }
  
}

