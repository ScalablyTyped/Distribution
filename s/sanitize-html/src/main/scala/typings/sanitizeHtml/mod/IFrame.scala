package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFrame extends js.Object {
  var attribs: StringDictionary[String] = js.native
  var tag: String = js.native
  var tagPosition: Double = js.native
  var text: String = js.native
}

object IFrame {
  @scala.inline
  def apply(attribs: StringDictionary[String], tag: String, tagPosition: Double, text: String): IFrame = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagPosition = tagPosition.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrame]
  }
  @scala.inline
  implicit class IFrameOps[Self <: IFrame] (val x: Self) extends AnyVal {
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
    def setAttribs(value: StringDictionary[String]): Self = this.set("attribs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagPosition(value: Double): Self = this.set("tagPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

