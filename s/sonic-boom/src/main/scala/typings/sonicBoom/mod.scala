package typings.sonicBoom

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sonic-boom", JSImport.Namespace)
  @js.native
  class ^ protected () extends SonicBoom {
    /**
      * @param [fileDescriptor] File path or numerical file descriptor
      * relative protocol is enabled. Default: process.stdout
      * @returns a new sonic-boom instance
      */
    def this(fileDescriptor: String) = this()
    def this(fileDescriptor: Double) = this()
    def this(fileDescriptor: String, minLength: Double) = this()
    def this(fileDescriptor: Double, minLength: Double) = this()
    def this(fileDescriptor: String, minLength: Double, sync: Boolean) = this()
    def this(fileDescriptor: String, minLength: Unit, sync: Boolean) = this()
    def this(fileDescriptor: Double, minLength: Double, sync: Boolean) = this()
    def this(fileDescriptor: Double, minLength: Unit, sync: Boolean) = this()
  }
  
  @js.native
  trait SonicBoom extends EventEmitter {
    
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
    def write(string: String): Unit = js.native
  }
}
