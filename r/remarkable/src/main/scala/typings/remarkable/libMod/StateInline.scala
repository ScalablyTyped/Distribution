package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateInline extends js.Object {
  var env: Env
  /** Set true when seek link label */
  var isInLabel: Boolean
  /**
    * Track unpaired `[` for link labels.
    */
  var labelUnmatchedScopes: Double
  var level: Double
  /**
    * Temporary storage for link url.
    */
  var linkContent: String
  /**
    * Increment for each nesting link.
    * Used to prevent nesting in definitions.
    */
  var linkLevel: Double
  var parser: ParserInline
  var pending: String
  var pendingLevel: Double
  var pos: Double
  var posMax: Double
  var src: String
  var tokens: js.Array[ContentToken]
  def push(token: ContentToken): Unit
  def pushPending(): Unit
}

object StateInline {
  @scala.inline
  def apply(
    env: Env,
    isInLabel: Boolean,
    labelUnmatchedScopes: Double,
    level: Double,
    linkContent: String,
    linkLevel: Double,
    parser: ParserInline,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: ContentToken => Unit,
    pushPending: () => Unit,
    src: String,
    tokens: js.Array[ContentToken]
  ): StateInline = {
    val __obj = js.Dynamic.literal(env = env, isInLabel = isInLabel, labelUnmatchedScopes = labelUnmatchedScopes, level = level, linkContent = linkContent, linkLevel = linkLevel, parser = parser, pending = pending, pendingLevel = pendingLevel, pos = pos, posMax = posMax, push = js.Any.fromFunction1(push), pushPending = js.Any.fromFunction0(pushPending), src = src, tokens = tokens)
  
    __obj.asInstanceOf[StateInline]
  }
}

