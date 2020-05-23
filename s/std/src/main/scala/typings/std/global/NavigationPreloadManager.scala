package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.NavigationPreloadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NavigationPreloadManager")
@js.native
class NavigationPreloadManager ()
  extends typings.std.NavigationPreloadManager {
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
object NavigationPreloadManager
  extends Instantiable0[typings.std.NavigationPreloadManager]

