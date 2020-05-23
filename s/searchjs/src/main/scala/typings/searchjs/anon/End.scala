package typings.searchjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Boolean
  var joinAnd: String
  var negator: Boolean
  var propertySearch: Boolean
  var propertySearchDepth: Double
  var separator: String
  var start: Boolean
  var text: Boolean
  var word: Boolean
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
}

