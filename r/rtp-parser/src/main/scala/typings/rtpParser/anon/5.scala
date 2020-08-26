package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  var mediaType: A = js.native
  var name: unassigned = js.native
}

object `5` {
  @scala.inline
  def apply(mediaType: A, name: unassigned): `5` = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
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
    def setMediaType(value: A): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: unassigned): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

