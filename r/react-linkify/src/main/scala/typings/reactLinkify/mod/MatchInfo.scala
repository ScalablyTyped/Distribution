package typings.reactLinkify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchInfo extends js.Object {
  /**
    * Offset of matched text
    */
  var index: Double = js.native
  /**
    * Index of next char after the end of the matched text
    */
  var lastIndex: Double = js.native
  /**
    * Link schema, can be empty for fuzzy links, or for protocol-neutral links
    */
  var schema: String = js.native
  /**
    * Normalized text
    */
  var text: String = js.native
  /**
    * Link, generated from matched text
    */
  var url: String = js.native
}

object MatchInfo {
  @scala.inline
  def apply(index: Double, lastIndex: Double, schema: String, text: String, url: String): MatchInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchInfo]
  }
  @scala.inline
  implicit class MatchInfoOps[Self <: MatchInfo] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastIndex(value: Double): Self = this.set("lastIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

