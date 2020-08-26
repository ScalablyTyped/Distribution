package typings.searchjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End extends js.Object {
  var end: Boolean = js.native
  var joinAnd: String = js.native
  var negator: Boolean = js.native
  var propertySearch: Boolean = js.native
  var propertySearchDepth: Double = js.native
  var separator: String = js.native
  var start: Boolean = js.native
  var text: Boolean = js.native
  var word: Boolean = js.native
}

object End {
  @scala.inline
  def apply(
    end: Boolean,
    joinAnd: String,
    negator: Boolean,
    propertySearch: Boolean,
    propertySearchDepth: Double,
    separator: String,
    start: Boolean,
    text: Boolean,
    word: Boolean
  ): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], joinAnd = joinAnd.asInstanceOf[js.Any], negator = negator.asInstanceOf[js.Any], propertySearch = propertySearch.asInstanceOf[js.Any], propertySearchDepth = propertySearchDepth.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  @scala.inline
  implicit class EndOps[Self <: End] (val x: Self) extends AnyVal {
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
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setJoinAnd(value: String): Self = this.set("joinAnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegator(value: Boolean): Self = this.set("negator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertySearch(value: Boolean): Self = this.set("propertySearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertySearchDepth(value: Double): Self = this.set("propertySearchDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: Boolean): Self = this.set("word", value.asInstanceOf[js.Any])
  }
  
}

