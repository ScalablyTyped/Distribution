package typings
package serverlessLib.classesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def appendFileSync(filePath: java.lang.String, contents: java.lang.String): js.Thenable[js.Object]
  def copyDirContentsSync(srcDir: java.lang.String, destDir: java.lang.String): scala.Unit
  def dirExistsSync(dirPath: java.lang.String): scala.Boolean
  def fileExistsSync(filePath: java.lang.String): scala.Boolean
  def findServicePath(): java.lang.String
  def generateShortId(length: scala.Double): java.lang.String
  def getVersion(): java.lang.String
  def logStat(serverless: serverlessLib.serverlessMod.namespaced, context: java.lang.String): js.Thenable[js.Object]
  def readFile(filePath: java.lang.String): js.Thenable[js.Object]
  def readFileSync(filePath: java.lang.String): js.Object
  def walkDirSync(dirPath: java.lang.String): js.Array[java.lang.String]
  def writeFile(filePath: java.lang.String, contents: java.lang.String): js.Thenable[js.Object]
  def writeFileDir(filePath: java.lang.String): scala.Unit
  def writeFileSync(filePath: java.lang.String, contents: java.lang.String): scala.Unit
}

