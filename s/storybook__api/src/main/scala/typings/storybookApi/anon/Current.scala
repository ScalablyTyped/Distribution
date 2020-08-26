package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: typings.storybookApi.versionsMod.Version | Version = js.native
  var latest: js.UndefOr[typings.storybookApi.versionsMod.Version] = js.native
  var next: js.UndefOr[typings.storybookApi.versionsMod.Version] = js.native
}

object Current {
  @scala.inline
  def apply(current: typings.storybookApi.versionsMod.Version | Version): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
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
    def setCurrent(value: typings.storybookApi.versionsMod.Version | Version): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatest(value: typings.storybookApi.versionsMod.Version): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setNext(value: typings.storybookApi.versionsMod.Version): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

