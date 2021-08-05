package typings.socketcluster

import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsutilMod {
  
  @JSImport("socketcluster/fsutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileExists(filePath: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForFile(filePath: PathLike, checkInterval: Double, startTime: Double, maxWaitDuration: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForFile")(filePath.asInstanceOf[js.Any], checkInterval.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], maxWaitDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForFile(
    filePath: PathLike,
    checkInterval: Double,
    startTime: Double,
    maxWaitDuration: Double,
    timeoutErrorMessage: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForFile")(filePath.asInstanceOf[js.Any], checkInterval.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], maxWaitDuration.asInstanceOf[js.Any], timeoutErrorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
