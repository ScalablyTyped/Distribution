package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTransformStream extends js.Object {
  val readable: ReadableStream[_]
  /**
    * Returns a writable stream which accepts string chunks and runs them through UTF-8's encoder before making them available to readable.
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * textReadable
    * .pipeThrough(new TextEncoderStream())
    * .pipeTo(byteWritable);
    */
  val writable: WritableStream[_]
}

object GenericTransformStream {
  @scala.inline
  def apply(readable: ReadableStream[_], writable: WritableStream[_]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable, writable = writable)
  
    __obj.asInstanceOf[GenericTransformStream]
  }
}

