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
    appendFileSync: js.Function2[java.lang.String, java.lang.String, js.Thenable[js.Object]],
    copyDirContentsSync: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    dirExistsSync: js.Function1[java.lang.String, scala.Boolean],
    fileExistsSync: js.Function1[java.lang.String, scala.Boolean],
    findServicePath: js.Function0[java.lang.String],
    generateShortId: js.Function1[scala.Double, java.lang.String],
    getVersion: js.Function0[java.lang.String],
    logStat: js.Function2[serverlessLib.serverlessMod.namespaced, java.lang.String, js.Thenable[js.Object]],
    readFile: js.Function1[java.lang.String, js.Thenable[js.Object]],
    readFileSync: js.Function1[java.lang.String, js.Object],
    walkDirSync: js.Function1[java.lang.String, js.Array[java.lang.String]],
    writeFile: js.Function2[java.lang.String, java.lang.String, js.Thenable[js.Object]],
    writeFileDir: js.Function1[java.lang.String, scala.Unit],
    writeFileSync: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendFileSync")(appendFileSync)
    __obj.updateDynamic("copyDirContentsSync")(copyDirContentsSync)
    __obj.updateDynamic("dirExistsSync")(dirExistsSync)
    __obj.updateDynamic("fileExistsSync")(fileExistsSync)
    __obj.updateDynamic("findServicePath")(findServicePath)
    __obj.updateDynamic("generateShortId")(generateShortId)
    __obj.updateDynamic("getVersion")(getVersion)
    __obj.updateDynamic("logStat")(logStat)
    __obj.updateDynamic("readFile")(readFile)
    __obj.updateDynamic("readFileSync")(readFileSync)
    __obj.updateDynamic("walkDirSync")(walkDirSync)
    __obj.updateDynamic("writeFile")(writeFile)
    __obj.updateDynamic("writeFileDir")(writeFileDir)
    __obj.updateDynamic("writeFileSync")(writeFileSync)
    __obj.asInstanceOf[Utils]
  }
}

