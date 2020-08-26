package typings.prosemirrorCollab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapSelectionBackward extends js.Object {
  var mapSelectionBackward: js.UndefOr[Boolean] = js.native
}

object MapSelectionBackward {
  @scala.inline
  def apply(): MapSelectionBackward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapSelectionBackward]
  }
  @scala.inline
  implicit class MapSelectionBackwardOps[Self <: MapSelectionBackward] (val x: Self) extends AnyVal {
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
    def setMapSelectionBackward(value: Boolean): Self = this.set("mapSelectionBackward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapSelectionBackward: Self = this.set("mapSelectionBackward", js.undefined)
  }
  
}

