package typings.stormReactDiagrams.baseEntityMod

import typings.stormReactDiagrams.anon.Locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListener[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] with Locked, Unit]] = js.undefined
}

object BaseListener {
  @scala.inline
  def apply[/* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[typings.stormReactDiagrams.baseEntityMod.BaseListener[_]] */ T](lockChanged: /* event */ BaseEvent[T] with Locked => Unit = null): BaseListener[T] = {
    val __obj = js.Dynamic.literal()
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    __obj.asInstanceOf[BaseListener[T]]
  }
}

