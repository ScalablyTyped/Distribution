package typings
package reactDashLinkifyLib.reactDashLinkifyMod.ReactLinkifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matching information
  */
trait MatchInfo extends js.Object {
  /**
    * Offset of matched text
    */
  var index: scala.Double
  /**
    * Index of next char after the end of the matched text
    */
  var lastIndex: scala.Double
  /**
    * Link schema, can be empty for fuzzy links, or for protocol-neutral links
    */
  var schema: java.lang.String
  /**
    * Normalized text
    */
  var text: java.lang.String
  /**
    * Link, generated from matched text
    */
  var url: java.lang.String
}

object MatchInfo {
  @scala.inline
  def apply(
    index: scala.Double,
    lastIndex: scala.Double,
    schema: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): MatchInfo = {
    val __obj = js.Dynamic.literal(index = index, lastIndex = lastIndex, schema = schema, text = text, url = url)
  
    __obj.asInstanceOf[MatchInfo]
  }
}

