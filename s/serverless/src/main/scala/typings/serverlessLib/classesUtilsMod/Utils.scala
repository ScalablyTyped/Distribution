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

object Utils {
  @scala.inline
  def apply(
    appendFileSync: (java.lang.String, java.lang.String) => js.Thenable[js.Object],
    copyDirContentsSync: (java.lang.String, java.lang.String) => scala.Unit,
    dirExistsSync: java.lang.String => scala.Boolean,
    fileExistsSync: java.lang.String => scala.Boolean,
    findServicePath: () => java.lang.String,
    generateShortId: scala.Double => java.lang.String,
    getVersion: () => java.lang.String,
    logStat: (serverlessLib.serverlessMod.namespaced, java.lang.String) => js.Thenable[js.Object],
    readFile: java.lang.String => js.Thenable[js.Object],
    readFileSync: java.lang.String => js.Object,
    walkDirSync: java.lang.String => js.Array[java.lang.String],
    writeFile: (java.lang.String, java.lang.String) => js.Thenable[js.Object],
    writeFileDir: java.lang.String => scala.Unit,
    writeFileSync: (java.lang.String, java.lang.String) => scala.Unit
  ): Utils = {
    val __obj = js.Dynamic.literal(appendFileSync = js.Any.fromFunction2(appendFileSync), copyDirContentsSync = js.Any.fromFunction2(copyDirContentsSync), dirExistsSync = js.Any.fromFunction1(dirExistsSync), fileExistsSync = js.Any.fromFunction1(fileExistsSync), findServicePath = js.Any.fromFunction0(findServicePath), generateShortId = js.Any.fromFunction1(generateShortId), getVersion = js.Any.fromFunction0(getVersion), logStat = js.Any.fromFunction2(logStat), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), walkDirSync = js.Any.fromFunction1(walkDirSync), writeFile = js.Any.fromFunction2(writeFile), writeFileDir = js.Any.fromFunction1(writeFileDir), writeFileSync = js.Any.fromFunction2(writeFileSync))
  
    __obj.asInstanceOf[Utils]
  }
}

