package typings.serverless.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def appendFileSync(filePath: String, contents: String): js.Thenable[js.Object]
  def copyDirContentsSync(srcDir: String, destDir: String): Unit
  def dirExistsSync(dirPath: String): Boolean
  def fileExistsSync(filePath: String): Boolean
  def findServicePath(): String
  def generateShortId(length: Double): String
  def getVersion(): String
  def logStat(serverless: typings.serverless.mod.^, context: String): js.Thenable[js.Object]
  def readFile(filePath: String): js.Thenable[js.Object]
  def readFileSync(filePath: String): js.Object
  def walkDirSync(dirPath: String): js.Array[String]
  def writeFile(filePath: String, contents: String): js.Thenable[js.Object]
  def writeFileDir(filePath: String): Unit
  def writeFileSync(filePath: String, contents: String): Unit
}

object Utils {
  @scala.inline
  def apply(
    appendFileSync: (String, String) => js.Thenable[js.Object],
    copyDirContentsSync: (String, String) => Unit,
    dirExistsSync: String => Boolean,
    fileExistsSync: String => Boolean,
    findServicePath: () => String,
    generateShortId: Double => String,
    getVersion: () => String,
    logStat: (typings.serverless.mod.^, String) => js.Thenable[js.Object],
    readFile: String => js.Thenable[js.Object],
    readFileSync: String => js.Object,
    walkDirSync: String => js.Array[String],
    writeFile: (String, String) => js.Thenable[js.Object],
    writeFileDir: String => Unit,
    writeFileSync: (String, String) => Unit
  ): Utils = {
    val __obj = js.Dynamic.literal(appendFileSync = js.Any.fromFunction2(appendFileSync), copyDirContentsSync = js.Any.fromFunction2(copyDirContentsSync), dirExistsSync = js.Any.fromFunction1(dirExistsSync), fileExistsSync = js.Any.fromFunction1(fileExistsSync), findServicePath = js.Any.fromFunction0(findServicePath), generateShortId = js.Any.fromFunction1(generateShortId), getVersion = js.Any.fromFunction0(getVersion), logStat = js.Any.fromFunction2(logStat), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), walkDirSync = js.Any.fromFunction1(walkDirSync), writeFile = js.Any.fromFunction2(writeFile), writeFileDir = js.Any.fromFunction1(writeFileDir), writeFileSync = js.Any.fromFunction2(writeFileSync))
  
    __obj.asInstanceOf[Utils]
  }
}

