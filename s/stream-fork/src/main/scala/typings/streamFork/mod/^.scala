package typings.streamFork.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-fork", JSImport.Namespace)
@js.native
class ^ protected () extends Fork {
  /**
    * A specialized Writable stream. It propagates every piece of data downstream to its dependent Writable streams (including Transform and Duplex streams).
    * @param outputs outputs is an array of Writable streams, which will be used duplicate written chunks or items.
    * @param options options is an options object, which is used to create a Writable stream.
    * Read all about it in Implementing a Writable stream. If it is not specified or falsy, {objectMode: true} is assumed. This default is useful for creating object mode streams.
    */
  def this(outputs: js.Array[Writable]) = this()
  def this(outputs: js.Array[Writable], options: ForkOptions) = this()
}

@JSImport("stream-fork", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * It is a factory function, which accepts the same arguments as the constructor, and returns a fully constructed Fork object.
    */
  def fork(outputs: js.Array[Writable]): Fork = js.native
  def fork(outputs: js.Array[Writable], options: ForkOptions): Fork = js.native
}

