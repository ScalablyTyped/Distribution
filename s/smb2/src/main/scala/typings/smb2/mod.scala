package typings.smb2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smb2", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SMB2 {
    def this(options: SMB2Options) = this()
  }
  
  @js.native
  trait SMB2 extends StObject {
    
    def close(): Unit = js.native
    
    def exists(path: String): Unit = js.native
    def exists(path: String, callback: js.Function2[/* error */ Any, /* exists */ Boolean, Unit]): Unit = js.native
    
    def mkdir(dir: String): Unit = js.native
    def mkdir(dir: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def mkdir(dir: String, mode: String): Unit = js.native
    def mkdir(dir: String, mode: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def readFile(fileName: String): Unit = js.native
    def readFile(fileName: String, callback: js.Function2[/* error */ Any, /* data */ String, Unit]): Unit = js.native
    def readFile(fileName: String, options: Unit, callback: js.Function2[/* error */ Any, /* data */ String, Unit]): Unit = js.native
    def readFile(fileName: String, options: SMB2ReadFileOptions): Unit = js.native
    def readFile(
      fileName: String,
      options: SMB2ReadFileOptions,
      callback: js.Function2[/* error */ Any, /* data */ String, Unit]
    ): Unit = js.native
    
    def readdir(dir: String): Unit = js.native
    def readdir(dir: String, callback: js.Function2[/* error */ Any, /* files */ js.Array[String], Unit]): Unit = js.native
    
    def rename(oldPath: String, newPath: String): Unit = js.native
    def rename(oldPath: String, newPath: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def rmdir(dir: String): Unit = js.native
    def rmdir(dir: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def unlink(fileName: String): Unit = js.native
    def unlink(fileName: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def writeFile(fileName: String, data: String): Unit = js.native
    def writeFile(fileName: String, data: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def writeFile(fileName: String, data: String, options: Unit, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def writeFile(fileName: String, data: String, options: SMB2ReadFileOptions): Unit = js.native
    def writeFile(
      fileName: String,
      data: String,
      options: SMB2ReadFileOptions,
      callback: js.Function1[/* error */ Any, Unit]
    ): Unit = js.native
  }
  
  trait SMB2Options extends StObject {
    
    var autoCloseTimeout: js.UndefOr[Double] = js.undefined
    
    var domain: String
    
    var packetConcurrency: js.UndefOr[Double] = js.undefined
    
    var password: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var share: String
    
    var username: String
  }
  object SMB2Options {
    
    inline def apply(domain: String, password: String, share: String, username: String): SMB2Options = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMB2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMB2Options] (val x: Self) extends AnyVal {
      
      inline def setAutoCloseTimeout(value: Double): Self = StObject.set(x, "autoCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseTimeoutUndefined: Self = StObject.set(x, "autoCloseTimeout", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setPacketConcurrency(value: Double): Self = StObject.set(x, "packetConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPacketConcurrencyUndefined: Self = StObject.set(x, "packetConcurrency", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setShare(value: String): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait SMB2ReadFileOptions extends StObject {
    
    var encoding: String | Null
  }
  object SMB2ReadFileOptions {
    
    inline def apply(): SMB2ReadFileOptions = {
      val __obj = js.Dynamic.literal(encoding = null)
      __obj.asInstanceOf[SMB2ReadFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMB2ReadFileOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    }
  }
}
