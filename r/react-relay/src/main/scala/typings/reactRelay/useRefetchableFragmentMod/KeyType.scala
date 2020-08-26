package typings.reactRelay.useRefetchableFragmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyType extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Any] = js.native
}

object KeyType {
  @scala.inline
  def apply(): KeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyType]
  }
  @scala.inline
  implicit class KeyTypeOps[Self <: KeyType] (val x: Self) extends AnyVal {
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
    def setSpace$data(value: js.Any): Self = this.set(" $data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace$data: Self = this.set(" $data", js.undefined)
  }
  
}

