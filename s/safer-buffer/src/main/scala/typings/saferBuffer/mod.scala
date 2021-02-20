package typings.saferBuffer

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safer-buffer", "Buffer")
  @js.native
  class Buffer protected ()
    extends typings.buffer.mod.Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      */
    def this(arrayBuffer: ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      */
    def this(buffer: typings.buffer.mod.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  /* static members */
  object Buffer {
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initializing
      */
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: String): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: String): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: String, encoding: String): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: Double, encoding: String): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typings.buffer.mod.Buffer): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.alloc")
    @js.native
    def alloc(size: Double, fill: typings.buffer.mod.Buffer, encoding: String): typings.buffer.mod.Buffer = js.native
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    @JSImport("safer-buffer", "Buffer.allocUnsafe")
    @js.native
    def allocUnsafe(size: Double): typings.buffer.mod.Buffer = js.native
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    @JSImport("safer-buffer", "Buffer.allocUnsafeSlow")
    @js.native
    def allocUnsafeSlow(size: Double): typings.buffer.mod.Buffer = js.native
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    @JSImport("safer-buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: String): Double = js.native
    @JSImport("safer-buffer", "Buffer.byteLength")
    @js.native
    def byteLength(string: String, encoding: String): Double = js.native
    
    /**
      * The same as buf1.compare(buf2).
      */
    @JSImport("safer-buffer", "Buffer.compare")
    @js.native
    def compare(buf1: Uint8Array, buf2: Uint8Array): Double = js.native
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    @JSImport("safer-buffer", "Buffer.concat")
    @js.native
    def concat(list: js.Array[Uint8Array]): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.concat")
    @js.native
    def concat(list: js.Array[Uint8Array], totalLength: Double): typings.buffer.mod.Buffer = js.native
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
      * @param byteOffset
      * @param length
      */
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: ArrayBuffer): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: Double): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: Double, length: Double): typings.buffer.mod.Buffer = js.native
    /**
      * Allocates a new Buffer using an {array} of octets.
      *
      * @param array
      */
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(array: js.Array[_]): typings.buffer.mod.Buffer = js.native
    /**
      * Copies the passed {buffer} data onto a new Buffer instance.
      *
      * @param buffer
      */
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(buffer: typings.buffer.mod.Buffer): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(buffer: Uint8Array): typings.buffer.mod.Buffer = js.native
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      *
      * @param str
      */
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(str: String): typings.buffer.mod.Buffer = js.native
    @JSImport("safer-buffer", "Buffer.from")
    @js.native
    def from(str: String, encoding: String): typings.buffer.mod.Buffer = js.native
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    @JSImport("safer-buffer", "Buffer.isBuffer")
    @js.native
    def isBuffer(obj: js.Any): /* is buffer.buffer.Buffer */ Boolean = js.native
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    @JSImport("safer-buffer", "Buffer.isEncoding")
    @js.native
    def isEncoding(encoding: String): Boolean = js.native
  }
}
