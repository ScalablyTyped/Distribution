package typings.reduxDashLocalstorageDashDebounce.reduxDashLocalstorageDashDebounceMod

import typings.reduxDashLocalstorage.reduxDashLocalstorageMod.StorageAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage-debounce", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(wait: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def apply(wait: Double, options: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def apply(wait: Double, options: DebounceOptions): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
}

