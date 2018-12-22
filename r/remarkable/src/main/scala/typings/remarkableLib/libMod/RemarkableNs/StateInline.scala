package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StateInline extends js.Object {
  var env: Env
  /** Set true when seek link label */
  var isInLabel: scala.Boolean
  /**
         * Track unpaired `[` for link labels.
         */
  var labelUnmatchedScopes: scala.Double
  var level: scala.Double
  /**
         * Temporary storage for link url.
         */
  var linkContent: java.lang.String
  /**
         * Increment for each nesting link.
         * Used to prevent nesting in definitions.
         */
  var linkLevel: scala.Double
  var parser: remarkableLib.libMod.ParserInline
  var pending: java.lang.String
  var pendingLevel: scala.Double
  var pos: scala.Double
  var posMax: scala.Double
  var src: java.lang.String
  var tokens: js.Array[ContentToken]
  def push(token: ContentToken): scala.Unit
  def pushPending(): scala.Unit
}

