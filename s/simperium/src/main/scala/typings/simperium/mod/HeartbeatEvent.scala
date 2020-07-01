package typings.simperium.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeartbeatEvent extends SimperiumEvent {
  def beat(count: Double): Unit
  def timeout(): Unit
}

object HeartbeatEvent {
  @scala.inline
  def apply(
    beat: Double => Unit,
    timeout: () => Unit,
    StringDictionary: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): HeartbeatEvent = {
    val __obj = js.Dynamic.literal(beat = js.Any.fromFunction1(beat), timeout = js.Any.fromFunction0(timeout))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HeartbeatEvent]
  }
}

