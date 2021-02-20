package typings.smb2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smb2", JSImport.Namespace)
  @js.native
  class ^ protected () extends SMB2 {
    def this(options: SMB2Options) = this()
  }
  
  @js.native
  trait SMB2 extends StObject {
    
    def close(): Unit = js.native
    
    def exists(path: String): Unit = js.native
    def exists(path: String, callback: js.Function2[/* error */ js.Any, /* exists */ Boolean, Unit]): Unit = js.native
    
    def mkdir(dir: String): Unit = js.native
    def mkdir(dir: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def mkdir(dir: String, mode: String): Unit = js.native
    def mkdir(dir: String, mode: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def readFile(fileName: String): Unit = js.native
    def readFile(fileName: String, callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]): Unit = js.native
    def readFile(
      fileName: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(fileName: String, options: SMB2ReadFileOptions): Unit = js.native
    def readFile(
      fileName: String,
      options: SMB2ReadFileOptions,
      callback: js.Function2[/* error */ js.Any, /* data */ String, Unit]
    ): Unit = js.native
    
    def readdir(dir: String): Unit = js.native
    def readdir(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = js.native
    
    def rename(oldPath: String, newPath: String): Unit = js.native
    def rename(oldPath: String, newPath: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def rmdir(dir: String): Unit = js.native
    def rmdir(dir: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def unlink(fileName: String): Unit = js.native
    def unlink(fileName: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def writeFile(fileName: String, data: String): Unit = js.native
    def writeFile(fileName: String, data: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def writeFile(
      fileName: String,
      data: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def writeFile(fileName: String, data: String, options: SMB2ReadFileOptions): Unit = js.native
    def writeFile(
      fileName: String,
      data: String,
      options: SMB2ReadFileOptions,
      callback: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait SMB2Options extends StObject {
    
    var autoCloseTimeout: js.UndefOr[Double] = js.native
    
    var domain: String = js.native
    
    var packetConcurrency: js.UndefOr[Double] = js.native
    
    var password: String = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var share: String = js.native
    
    var username: String = js.native
  }
  object SMB2Options {
    
    @scala.inline
    def apply(domain: String, password: String, share: String, username: String): SMB2Options = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMB2Options]
    }
    
    @scala.inline
    implicit class SMB2OptionsMutableBuilder[Self <: SMB2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCloseTimeout(value: Double): Self = StObject.set(x, "autoCloseTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseTimeoutUndefined: Self = StObject.set(x, "autoCloseTimeout", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketConcurrency(value: Double): Self = StObject.set(x, "packetConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketConcurrencyUndefined: Self = StObject.set(x, "packetConcurrency", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setShare(value: String): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SMB2ReadFileOptions extends StObject {
    
    var encoding: String | Null = js.native
  }
  object SMB2ReadFileOptions {
    
    @scala.inline
    def apply(): SMB2ReadFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMB2ReadFileOptions]
    }
    
    @scala.inline
    implicit class SMB2ReadFileOptionsMutableBuilder[Self <: SMB2ReadFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
    }
  }
}
