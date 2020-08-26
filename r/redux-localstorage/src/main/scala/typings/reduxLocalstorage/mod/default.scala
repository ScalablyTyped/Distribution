package typings.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-localstorage", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](): js.Any = js.native
  def apply[A](storage: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  def apply[A](storage: js.UndefOr[scala.Nothing], key: String): js.Any = js.native
  def apply[A](storage: js.UndefOr[scala.Nothing], key: String, callback: js.Function): js.Any = js.native
  def apply[A](storage: StorageAdapter[A]): js.Any = js.native
  def apply[A](storage: StorageAdapter[A], key: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  def apply[A](storage: StorageAdapter[A], key: String): js.Any = js.native
  def apply[A](storage: StorageAdapter[A], key: String, callback: js.Function): js.Any = js.native
}

