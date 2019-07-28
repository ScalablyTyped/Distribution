package typings.serverless.classesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Utils", JSImport.Namespace)
@js.native
class ^ protected () extends Utils {
  def this(serverless: typings.serverless.serverlessMod.^) = this()
  /* CompleteClass */
  override def appendFileSync(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  /* CompleteClass */
  override def copyDirContentsSync(srcDir: String, destDir: String): Unit = js.native
  /* CompleteClass */
  override def dirExistsSync(dirPath: String): Boolean = js.native
  /* CompleteClass */
  override def fileExistsSync(filePath: String): Boolean = js.native
  /* CompleteClass */
  override def findServicePath(): String = js.native
  /* CompleteClass */
  override def generateShortId(length: Double): String = js.native
  /* CompleteClass */
  override def getVersion(): String = js.native
  /* CompleteClass */
  override def logStat(serverless: typings.serverless.serverlessMod.^, context: String): js.Thenable[js.Object] = js.native
  /* CompleteClass */
  override def readFile(filePath: String): js.Thenable[js.Object] = js.native
  /* CompleteClass */
  override def readFileSync(filePath: String): js.Object = js.native
  /* CompleteClass */
  override def walkDirSync(dirPath: String): js.Array[String] = js.native
  /* CompleteClass */
  override def writeFile(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  /* CompleteClass */
  override def writeFileDir(filePath: String): Unit = js.native
  /* CompleteClass */
  override def writeFileSync(filePath: String, contents: String): Unit = js.native
}

