package typings.promptDashSync.promptDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  def atEnd(): Boolean
  def atPenultimate(): Boolean
  def atStart(): Boolean
  def next(): String
  def pastEnd(): Boolean
  def prev(): String
  def push(str: String): Unit
  def reset(): Unit
  def save(): Unit
}

object History {
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    atPenultimate: () => Boolean,
    atStart: () => Boolean,
    next: () => String,
    pastEnd: () => Boolean,
    prev: () => String,
    push: String => Unit,
    reset: () => Unit,
    save: () => Unit
  ): History = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), atPenultimate = js.Any.fromFunction0(atPenultimate), atStart = js.Any.fromFunction0(atStart), next = js.Any.fromFunction0(next), pastEnd = js.Any.fromFunction0(pastEnd), prev = js.Any.fromFunction0(prev), push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[History]
  }
}

