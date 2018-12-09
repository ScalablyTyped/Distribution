package typings
package socketclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster/fsutil", JSImport.Namespace)
@js.native
object fsutilMod extends js.Object {
  def fileExists(filePath: nodeLib.fsMod.PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def waitForFile(
    filePath: nodeLib.fsMod.PathLike,
    checkInterval: scala.Double,
    startTime: scala.Double,
    maxWaitDuration: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def waitForFile(
    filePath: nodeLib.fsMod.PathLike,
    checkInterval: scala.Double,
    startTime: scala.Double,
    maxWaitDuration: scala.Double,
    timeoutErrorMessage: java.lang.String
  ): js.Promise[scala.Unit] = js.native
}

