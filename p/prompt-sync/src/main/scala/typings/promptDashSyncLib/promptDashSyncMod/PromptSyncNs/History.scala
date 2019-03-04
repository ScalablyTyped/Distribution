package typings
package promptDashSyncLib.promptDashSyncMod.PromptSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  def atEnd(): scala.Boolean
  def atPenultimate(): scala.Boolean
  def atStart(): scala.Boolean
  def next(): java.lang.String
  def pastEnd(): scala.Boolean
  def prev(): java.lang.String
  def push(str: java.lang.String): scala.Unit
  def reset(): scala.Unit
  def save(): scala.Unit
}

object History {
  @scala.inline
  def apply(
    atEnd: js.Function0[scala.Boolean],
    atPenultimate: js.Function0[scala.Boolean],
    atStart: js.Function0[scala.Boolean],
    next: js.Function0[java.lang.String],
    pastEnd: js.Function0[scala.Boolean],
    prev: js.Function0[java.lang.String],
    push: js.Function1[java.lang.String, scala.Unit],
    reset: js.Function0[scala.Unit],
    save: js.Function0[scala.Unit]
  ): History = {
    val __obj = js.Dynamic.literal(atEnd = atEnd, atPenultimate = atPenultimate, atStart = atStart, next = next, pastEnd = pastEnd, prev = prev, push = push, reset = reset, save = save)
  
    __obj.asInstanceOf[History]
  }
}

