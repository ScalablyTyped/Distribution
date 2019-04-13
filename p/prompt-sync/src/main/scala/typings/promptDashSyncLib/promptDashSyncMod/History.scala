package typings
package promptDashSyncLib.promptDashSyncMod

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
    atEnd: () => scala.Boolean,
    atPenultimate: () => scala.Boolean,
    atStart: () => scala.Boolean,
    next: () => java.lang.String,
    pastEnd: () => scala.Boolean,
    prev: () => java.lang.String,
    push: java.lang.String => scala.Unit,
    reset: () => scala.Unit,
    save: () => scala.Unit
  ): History = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), atPenultimate = js.Any.fromFunction0(atPenultimate), atStart = js.Any.fromFunction0(atStart), next = js.Any.fromFunction0(next), pastEnd = js.Any.fromFunction0(pastEnd), prev = js.Any.fromFunction0(prev), push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[History]
  }
}

