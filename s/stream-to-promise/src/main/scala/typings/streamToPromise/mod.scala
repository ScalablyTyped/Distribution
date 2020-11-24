package typings.streamToPromise

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-to-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Return a promise which resolves when the input stream ends
    * @param stream The input stream
    * @returns A promise containing the stream output as a buffer
    */
  def apply(stream: ReadableStream): js.Promise[Buffer] = js.native
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  def apply(stream: WritableStream): js.Promise[Unit] = js.native
  def apply(stream: Readable): js.Promise[Buffer] = js.native
  def apply(stream: Writable): js.Promise[Unit] = js.native
}
