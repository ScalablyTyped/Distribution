package typings.promiseSftp

import typings.ssh2Streams.mod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: Attributes
    
    var filename: String
    
    var longname: String
  }
  object Attrs {
    
    inline def apply(attrs: Attributes, filename: String, longname: String): Attrs = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLongname(value: String): Self = StObject.set(x, "longname", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoClose extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object AutoClose {
    
    inline def apply(): AutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoClose]
    }
    
    extension [Self <: AutoClose](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait Buffer extends StObject {
    
    /** The buffer passed to `#read()`, but offset-adjusted */
    var buffer: typings.node.Buffer
    
    /** The number of bytes successfully read */
    var bytesRead: Double
    
    /** The position passed to `#read()` */
    var position: Double
  }
  object Buffer {
    
    inline def apply(buffer: typings.node.Buffer, bytesRead: Double, position: Double): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: typings.node.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait Echo extends StObject {
    
    /** Whether the user's input should be displayed on-screen */
    var echo: Boolean
    
    /** The query to pose to the user */
    var prompt: String
  }
  object Echo {
    
    inline def apply(echo: Boolean, prompt: String): Echo = {
      val __obj = js.Dynamic.literal(echo = echo.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Echo]
    }
    
    extension [Self <: Echo](x: Self) {
      
      inline def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var group: String
    
    var other: String
    
    var user: String
  }
  object Group {
    
    inline def apply(group: String, other: String, user: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
