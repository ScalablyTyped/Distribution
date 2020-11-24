package typings.serverless.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends js.Object {
  
  def appendFileSync(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  
  def copyDirContentsSync(srcDir: String, destDir: String): Unit = js.native
  
  def dirExistsSync(dirPath: String): Boolean = js.native
  
  def fileExistsSync(filePath: String): Boolean = js.native
  
  def findServicePath(): String = js.native
  
  def generateShortId(length: Double): String = js.native
  
  def getVersion(): String = js.native
  
  def logStat(serverless: typings.serverless.mod.^, context: String): js.Thenable[js.Object] = js.native
  
  def readFile(filePath: String): js.Thenable[js.Object] = js.native
  
  def readFileSync(filePath: String): js.Object = js.native
  
  def walkDirSync(dirPath: String): js.Array[String] = js.native
  
  def writeFile(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  
  def writeFileDir(filePath: String): Unit = js.native
  
  def writeFileSync(filePath: String, contents: String): Unit = js.native
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
  
  @scala.inline
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendFileSync(value: (String, String) => js.Thenable[js.Object]): Self = this.set("appendFileSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyDirContentsSync(value: (String, String) => Unit): Self = this.set("copyDirContentsSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDirExistsSync(value: String => Boolean): Self = this.set("dirExistsSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileExistsSync(value: String => Boolean): Self = this.set("fileExistsSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindServicePath(value: () => String): Self = this.set("findServicePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateShortId(value: Double => String): Self = this.set("generateShortId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = this.set("getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogStat(value: (typings.serverless.mod.^, String) => js.Thenable[js.Object]): Self = this.set("logStat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadFile(value: String => js.Thenable[js.Object]): Self = this.set("readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadFileSync(value: String => js.Object): Self = this.set("readFileSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWalkDirSync(value: String => js.Array[String]): Self = this.set("walkDirSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteFile(value: (String, String) => js.Thenable[js.Object]): Self = this.set("writeFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteFileDir(value: String => Unit): Self = this.set("writeFileDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteFileSync(value: (String, String) => Unit): Self = this.set("writeFileSync", js.Any.fromFunction2(value))
  }
}
