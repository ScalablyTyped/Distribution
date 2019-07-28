package typings.reduxDashLocalstorageDashDebounce.reduxDashLocalstorageDashDebounceMod

import typings.reduxDashLocalstorage.reduxDashLocalstorageMod.StorageAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage-debounce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(wait: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def default(wait: Double, options: Double): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
  def default(wait: Double, options: DebounceOptions): js.Function1[/* adapter */ StorageAdapter[_], StorageAdapter[_]] = js.native
}

