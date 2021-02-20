package typings.socketcluster

import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsutilMod {
  
  @JSImport("socketcluster/fsutil", "fileExists")
  @js.native
  def fileExists(filePath: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  
  @JSImport("socketcluster/fsutil", "waitForFile")
  @js.native
  def waitForFile(filePath: PathLike, checkInterval: Double, startTime: Double, maxWaitDuration: Double): js.Promise[Unit] = js.native
  @JSImport("socketcluster/fsutil", "waitForFile")
  @js.native
  def waitForFile(
    filePath: PathLike,
    checkInterval: Double,
    startTime: Double,
    maxWaitDuration: Double,
    timeoutErrorMessage: String
  ): js.Promise[Unit] = js.native
}
