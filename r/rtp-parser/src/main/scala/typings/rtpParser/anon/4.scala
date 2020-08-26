package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var mediaType: V = js.native
  var name: unassigned = js.native
}

object `4` {
  @scala.inline
  def apply(mediaType: V, name: unassigned): `4` = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
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
    def setMediaType(value: V): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: unassigned): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

