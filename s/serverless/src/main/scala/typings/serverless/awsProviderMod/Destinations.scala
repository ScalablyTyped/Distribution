package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destinations extends js.Object {
  var onFailure: js.UndefOr[String] = js.native
  var onSuccess: js.UndefOr[String] = js.native
}

object Destinations {
  @scala.inline
  def apply(): Destinations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destinations]
  }
  @scala.inline
  implicit class DestinationsOps[Self <: Destinations] (val x: Self) extends AnyVal {
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
    def setOnFailure(value: String): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: String): Self = this.set("onSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

