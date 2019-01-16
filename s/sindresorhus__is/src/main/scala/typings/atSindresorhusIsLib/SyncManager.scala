package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncManager extends js.Object {
  def getTags(): Promise[Array[java.lang.String]]
  def register(tag: java.lang.String): Promise[scala.Unit]
}

@JSGlobal("SyncManager")
@js.native
object SyncManager
  extends org.scalablytyped.runtime.Instantiable0[SyncManager]

