package typings.rcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tabs/lib/hooks/useSyncState", JSImport.Namespace)
@js.native
object useSyncStateMod extends js.Object {
  def default[T](defaultState: T, onChange: js.Function2[/* newValue */ T, /* prevValue */ T, Unit]): js.Tuple2[T, js.Function1[/* updater */ T | Updater[T], Unit]] = js.native
  type Updater[T] = js.Function1[/* prev */ T, T]
}

