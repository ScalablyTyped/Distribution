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
object SyncManager
  extends org.scalablytyped.runtime.Instantiable0[SyncManager]

