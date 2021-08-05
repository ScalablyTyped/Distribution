package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericTransformStream extends StObject {
  
  /**
    * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
    */
  val readable: ReadableStream[js.Any]
  
  /**
    * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
    * 
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * 
    * ```
    * var decoder = new TextDecoderStream(encoding);
    * byteReadable
    *   .pipeThrough(decoder)
    *   .pipeTo(textWritable);
    * ```
    * 
    * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
    */
  val writable: WritableStream[js.Any]
}
object GenericTransformStream {
  
  inline def apply(readable: ReadableStream[js.Any], writable: WritableStream[js.Any]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
  
  extension [Self <: GenericTransformStream](x: Self) {
    
    inline def setReadable(value: ReadableStream[js.Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[js.Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
