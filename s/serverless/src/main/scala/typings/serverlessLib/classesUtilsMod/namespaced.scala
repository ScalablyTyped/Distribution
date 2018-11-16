package typings
package serverlessLib.classesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/classes/Utils", JSImport.Namespace)
@js.native
class namespaced protected () extends Utils {
  def this(serverless: serverlessLib.serverlessMod.namespaced) = this()
  /* CompleteClass */
  override def appendFileSync(filePath: java.lang.String, contents: java.lang.String): stdLib.PromiseLike[js.Object] = js.native
  /* CompleteClass */
  override def copyDirContentsSync(srcDir: java.lang.String, destDir: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def dirExistsSync(dirPath: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def fileExistsSync(filePath: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def findServicePath(): java.lang.String = js.native
  /* CompleteClass */
  override def generateShortId(length: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def getVersion(): java.lang.String = js.native
  /* CompleteClass */
  override def logStat(serverless: serverlessLib.serverlessMod.namespaced, context: java.lang.String): stdLib.PromiseLike[js.Object] = js.native
  /* CompleteClass */
  override def readFile(filePath: java.lang.String): stdLib.PromiseLike[js.Object] = js.native
  /* CompleteClass */
  override def readFileSync(filePath: java.lang.String): js.Object = js.native
  /* CompleteClass */
  override def walkDirSync(dirPath: java.lang.String): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def writeFile(filePath: java.lang.String, contents: java.lang.String): stdLib.PromiseLike[js.Object] = js.native
  /* CompleteClass */
  override def writeFileDir(filePath: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def writeFileSync(filePath: java.lang.String, contents: java.lang.String): scala.Unit = js.native
}

