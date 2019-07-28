package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[Unit]
  def enable(): js.Promise[Unit]
  def getState(): js.Promise[NavigationPreloadState]
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
}

@JSGlobal("NavigationPreloadManager")
@js.native
class NavigationPreloadManagerCls () extends NavigationPreloadManager {
  /* CompleteClass */
  override def disable(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def enable(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def getState(): js.Promise[NavigationPreloadState] = js.native
  /* CompleteClass */
  override def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}

@JSGlobal("NavigationPreloadManager")
@js.native
object NavigationPreloadManager extends Instantiable0[NavigationPreloadManager]

