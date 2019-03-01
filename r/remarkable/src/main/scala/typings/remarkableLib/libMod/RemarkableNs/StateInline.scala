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

object StateInline {
  @scala.inline
  def apply(
    env: Env,
    isInLabel: scala.Boolean,
    labelUnmatchedScopes: scala.Double,
    level: scala.Double,
    linkContent: java.lang.String,
    linkLevel: scala.Double,
    parser: remarkableLib.libMod.ParserInline,
    pending: java.lang.String,
    pendingLevel: scala.Double,
    pos: scala.Double,
    posMax: scala.Double,
    push: js.Function1[ContentToken, scala.Unit],
    pushPending: js.Function0[scala.Unit],
    src: java.lang.String,
    tokens: js.Array[ContentToken]
  ): StateInline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("env")(env)
    __obj.updateDynamic("isInLabel")(isInLabel)
    __obj.updateDynamic("labelUnmatchedScopes")(labelUnmatchedScopes)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("linkContent")(linkContent)
    __obj.updateDynamic("linkLevel")(linkLevel)
    __obj.updateDynamic("parser")(parser)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("pendingLevel")(pendingLevel)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("posMax")(posMax)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("pushPending")(pushPending)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[StateInline]
  }
}

