package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alloc
  extends org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with /**
  * Allocates a new buffer containing the given {str}.
  *
  * @param str String to store in buffer.
  * @param encoding encoding to use, optional.  Default is 'utf8'
  */
/**
  * Allocates a new buffer of {size} octets.
  *
  * @param size count of octets to allocate.
  */
/**
  * Allocates a new buffer containing the given {array} of octets.
  *
  * @param array The octets to store.
  */
/**
  * Produces a Buffer backed by the same allocated memory as
  * the given {ArrayBuffer}.
  *
  *
  * @param arrayBuffer The ArrayBuffer with which to share memory.
  */
/**
  * Copies the passed {buffer} data onto a new {Buffer} instance.
  *
  * @param buffer The buffer to copy.
  */
org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* arrayBuffer */ stdLib.ArrayBuffer) | (/* buffer */ Buffer) | (/* size */ scala.Double) | (/* str */ java.lang.String) | (/* array */ stdLib.Uint8Array), 
      Buffer
    ] {
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
    *    If parameter is omitted, buffer will be filled with zeros.
    * @param encoding encoding used for call to buf.fill while initalizing
    */
  def alloc(size: scala.Double): Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String): Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String, encoding: java.lang.String): Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double): Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double, encoding: java.lang.String): Buffer = js.native
  def alloc(size: scala.Double, fill: Buffer): Buffer = js.native
  def alloc(size: scala.Double, fill: Buffer, encoding: java.lang.String): Buffer = js.native
  /**
    * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafe(size: scala.Double): Buffer = js.native
  /**
    * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafeSlow(size: scala.Double): Buffer = js.native
  /**
    * Gives the actual byte length of a string. encoding defaults to 'utf8'.
    * This is not the same as String.prototype.length since that returns the number of characters in a string.
    *
    * @param string string to test.
    * @param encoding encoding used to evaluate (defaults to 'utf8')
    */
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  /**
    * The same as buf1.compare(buf2).
    */
  def compare(buf1: Buffer, buf2: Buffer): scala.Double = js.native
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
  def concat(list: js.Array[Buffer]): Buffer = js.native
  def concat(list: js.Array[Buffer], totalLength: scala.Double): Buffer = js.native
  /**
    * When passed a reference to the .buffer property of a TypedArray instance,
    * the newly created Buffer will share the same allocated memory as the TypedArray.
    * The optional {byteOffset} and {length} arguments specify a memory range
    * within the {arrayBuffer} that will be shared by the Buffer.
    *
    * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
    */
  def from(arrayBuffer: stdLib.ArrayBuffer): Buffer = js.native
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double): Buffer = js.native
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double, length: scala.Double): Buffer = js.native
  /**
    * Creates a new Buffer containing the given JavaScript string {str}.
    * If provided, the {encoding} parameter identifies the character encoding.
    * If not provided, {encoding} defaults to 'utf8'.
    */
  def from(data: java.lang.String): Buffer = js.native
  /**
    * Creates a new Buffer using the passed {data}
    * @param data data to create a new Buffer
    */
  def from(data: js.Array[_]): Buffer = js.native
  def from(data: Buffer): Buffer = js.native
  def from(str: java.lang.String, encoding: java.lang.String): Buffer = js.native
  /**
    * Returns true if {obj} is a Buffer
    *
    * @param obj object to test.
    */
  def isBuffer(obj: js.Any): /* is simplecrawler.Buffer */ scala.Boolean = js.native
  /**
    * Returns true if {encoding} is a valid encoding argument.
    * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    *
    * @param encoding string to test.
    */
  def isEncoding(encoding: java.lang.String): scala.Boolean = js.native
}

