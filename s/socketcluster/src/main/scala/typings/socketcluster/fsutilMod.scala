package typings.socketcluster

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster/fsutil", JSImport.Namespace)
@js.native
object fsutilMod extends js.Object {
  def fileExists(filePath: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  def waitForFile(filePath: PathLike, checkInterval: Double, startTime: Double, maxWaitDuration: Double): js.Promise[Unit] = js.native
  def waitForFile(
    filePath: PathLike,
    checkInterval: Double,
    startTime: Double,
    maxWaitDuration: Double,
    timeoutErrorMessage: String
  ): js.Promise[Unit] = js.native
}

