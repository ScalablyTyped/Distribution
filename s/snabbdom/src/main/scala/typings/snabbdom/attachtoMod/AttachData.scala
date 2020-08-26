package typings.snabbdom.attachtoMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachData
  extends /* i */ NumberDictionary[js.Any]
     with /* key */ StringDictionary[js.Any] {
  var placeholder: js.UndefOr[js.Any] = js.native
  var real: js.UndefOr[Node] = js.native
}

object AttachData {
  @scala.inline
  def apply(): AttachData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachData]
  }
  @scala.inline
  implicit class AttachDataOps[Self <: AttachData] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: js.Any): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReal(value: Node): Self = this.set("real", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReal: Self = this.set("real", js.undefined)
  }
  
}

