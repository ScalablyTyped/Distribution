package typings.snyk

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacFileUtilsMod {
  
  @JSImport("snyk/dist/lib/iac/file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDirIfNotExists(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirIfNotExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def isArchive(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isArchive")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isExe(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isExe")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isFile(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def saveFile(dataBuffer: Buffer, savePath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveFile")(dataBuffer.asInstanceOf[js.Any], savePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
