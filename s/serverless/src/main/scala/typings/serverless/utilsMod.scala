package typings.serverless

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("serverless/classes/Utils", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Utils {
    def this(serverless: typings.serverless.mod.^) = this()
    
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
    override def logStat(serverless: typings.serverless.mod.^, context: String): js.Thenable[js.Object] = js.native
    
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
  
  trait Utils extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: Utils](x: Self) {
      
      inline def setAppendFileSync(value: (String, String) => js.Thenable[js.Object]): Self = StObject.set(x, "appendFileSync", js.Any.fromFunction2(value))
      
      inline def setCopyDirContentsSync(value: (String, String) => Unit): Self = StObject.set(x, "copyDirContentsSync", js.Any.fromFunction2(value))
      
      inline def setDirExistsSync(value: String => Boolean): Self = StObject.set(x, "dirExistsSync", js.Any.fromFunction1(value))
      
      inline def setFileExistsSync(value: String => Boolean): Self = StObject.set(x, "fileExistsSync", js.Any.fromFunction1(value))
      
      inline def setFindServicePath(value: () => String): Self = StObject.set(x, "findServicePath", js.Any.fromFunction0(value))
      
      inline def setGenerateShortId(value: Double => String): Self = StObject.set(x, "generateShortId", js.Any.fromFunction1(value))
      
      inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      inline def setLogStat(value: (typings.serverless.mod.^, String) => js.Thenable[js.Object]): Self = StObject.set(x, "logStat", js.Any.fromFunction2(value))
      
      inline def setReadFile(value: String => js.Thenable[js.Object]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: String => js.Object): Self = StObject.set(x, "readFileSync", js.Any.fromFunction1(value))
      
      inline def setWalkDirSync(value: String => js.Array[String]): Self = StObject.set(x, "walkDirSync", js.Any.fromFunction1(value))
      
      inline def setWriteFile(value: (String, String) => js.Thenable[js.Object]): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
      
      inline def setWriteFileDir(value: String => Unit): Self = StObject.set(x, "writeFileDir", js.Any.fromFunction1(value))
      
      inline def setWriteFileSync(value: (String, String) => Unit): Self = StObject.set(x, "writeFileSync", js.Any.fromFunction2(value))
    }
  }
}
