package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncManager extends js.Object {
  def getTags(): js.Promise[js.Array[java.lang.String]]
  def register(tag: java.lang.String): js.Promise[scala.Unit]
}

@JSGlobal("SyncManager")
@js.native
class SyncManagerCls () extends SyncManager {
  /* CompleteClass */
  override def getTags(): js.Promise[js.Array[java.lang.String]] = js.native
  /* CompleteClass */
  override def register(tag: java.lang.String): js.Promise[scala.Unit] = js.native
}

@JSGlobal("SyncManager")
@js.native
object SyncManager
  extends org.scalablytyped.runtime.Instantiable0[SyncManager]

