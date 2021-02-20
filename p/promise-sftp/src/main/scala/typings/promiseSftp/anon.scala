package typings.promiseSftp

import typings.ssh2Streams.mod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attrs extends StObject {
    
    var attrs: Attributes = js.native
    
    var filename: String = js.native
    
    var longname: String = js.native
  }
  object Attrs {
    
    @scala.inline
    def apply(attrs: Attributes, filename: String, longname: String): Attrs = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongname(value: String): Self = StObject.set(x, "longname", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoClose extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var fd: js.UndefOr[Double] = js.native
    
    var flags: js.UndefOr[String] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object AutoClose {
    
    @scala.inline
    def apply(): AutoClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoClose]
    }
    
    @scala.inline
    implicit class AutoCloseMutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait Buffer extends StObject {
    
    /** The buffer passed to `#read()`, but offset-adjusted */
    var buffer: typings.node.Buffer = js.native
    
    /** The number of bytes successfully read */
    var bytesRead: Double = js.native
    
    /** The position passed to `#read()` */
    var position: Double = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: typings.node.Buffer, bytesRead: Double, position: Double): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: typings.node.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Echo extends StObject {
    
    /** Whether the user's input should be displayed on-screen */
    var echo: Boolean = js.native
    
    /** The query to pose to the user */
    var prompt: String = js.native
  }
  object Echo {
    
    @scala.inline
    def apply(echo: Boolean, prompt: String): Echo = {
      val __obj = js.Dynamic.literal(echo = echo.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Echo]
    }
    
    @scala.inline
    implicit class EchoMutableBuilder[Self <: Echo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Group extends StObject {
    
    var group: String = js.native
    
    var other: String = js.native
    
    var user: String = js.native
  }
  object Group {
    
    @scala.inline
    def apply(group: String, other: String, user: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
