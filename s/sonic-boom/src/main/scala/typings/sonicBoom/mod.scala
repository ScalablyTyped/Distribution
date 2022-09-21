package typings.sonicBoom

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sonic-boom", JSImport.Default)
  @js.native
  open class default protected () extends SonicBoom {
    /**
      * @param [fileDescriptor] File path or numerical file descriptor
      * relative protocol is enabled. Default: process.stdout
      * @returns a new sonic-boom instance
      */
    def this(opts: SonicBoomOpts) = this()
  }
  
  @JSImport("sonic-boom", "SonicBoom")
  @js.native
  open class SonicBoom protected () extends EventEmitter {
    /**
      * @param [fileDescriptor] File path or numerical file descriptor
      * relative protocol is enabled. Default: process.stdout
      * @returns a new sonic-boom instance
      */
    def this(opts: SonicBoomOpts) = this()
    
    /**
      * Closes the stream immediately, the data is not flushed.
      */
    def destroy(): Unit = js.native
    
    /**
      * Closes the stream, the data will be flushed down asynchronously
      */
    def end(): Unit = js.native
    
    /**
      * Writes the current buffer to the file if a write was not in progress.
      * Do nothing if minLength is zero or if it is already writing.
      */
    def flush(): Unit = js.native
    
    /**
      * Flushes the buffered data synchronously. This is a costly operation.
      */
    def flushSync(): Unit = js.native
    
    /**
      * Reopen the file in place, useful for log rotation.
      */
    def reopen(): Unit = js.native
    def reopen(fileDescriptor: String): Unit = js.native
    def reopen(fileDescriptor: Double): Unit = js.native
    
    /**
      * Writes the string to the file. It will return false to signal the producer to slow down.
      */
    def write(string: String): Boolean = js.native
  }
  
  trait SonicBoomOpts extends StObject {
    
    var append: js.UndefOr[Boolean] = js.undefined
    
    var dest: js.UndefOr[String | Double] = js.undefined
    
    var fd: js.UndefOr[Double | String | js.Symbol] = js.undefined
    
    var fsync: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxWrite: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var mkdir: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
    
    var retryEAGAIN: js.UndefOr[
        js.Function3[
          /* err */ js.Error, 
          /* writeBufferLen */ Double, 
          /* remainingBufferLen */ Double, 
          Boolean
        ]
      ] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object SonicBoomOpts {
    
    inline def apply(): SonicBoomOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SonicBoomOpts]
    }
    
    extension [Self <: SonicBoomOpts](x: Self) {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setDest(value: String | Double): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setFd(value: Double | String | js.Symbol): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxWrite(value: Double): Self = StObject.set(x, "maxWrite", value.asInstanceOf[js.Any])
      
      inline def setMaxWriteUndefined: Self = StObject.set(x, "maxWrite", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMkdir(value: Boolean): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMkdirUndefined: Self = StObject.set(x, "mkdir", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRetryEAGAIN(
        value: (/* err */ js.Error, /* writeBufferLen */ Double, /* remainingBufferLen */ Double) => Boolean
      ): Self = StObject.set(x, "retryEAGAIN", js.Any.fromFunction3(value))
      
      inline def setRetryEAGAINUndefined: Self = StObject.set(x, "retryEAGAIN", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
