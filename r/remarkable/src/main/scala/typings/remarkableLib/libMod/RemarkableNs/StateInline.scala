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
    val __obj = js.Dynamic.literal(env = env, isInLabel = isInLabel, labelUnmatchedScopes = labelUnmatchedScopes, level = level, linkContent = linkContent, linkLevel = linkLevel, parser = parser, pending = pending, pendingLevel = pendingLevel, pos = pos, posMax = posMax, push = push, pushPending = pushPending, src = src, tokens = tokens)
  
    __obj.asInstanceOf[StateInline]
  }
}

