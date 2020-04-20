package typings.reactLinkify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchInfo extends js.Object {
  /**
    * Offset of matched text
    */
  var index: Double
  /**
    * Index of next char after the end of the matched text
    */
  var lastIndex: Double
  /**
    * Link schema, can be empty for fuzzy links, or for protocol-neutral links
    */
  var schema: String
  /**
    * Normalized text
    */
  var text: String
  /**
    * Link, generated from matched text
    */
  var url: String
}

object MatchInfo {
  @scala.inline
  def apply(index: Double, lastIndex: Double, schema: String, text: String, url: String): MatchInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchInfo]
  }
}

