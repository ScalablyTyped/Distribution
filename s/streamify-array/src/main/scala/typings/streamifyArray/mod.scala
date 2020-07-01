package typings.streamifyArray

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("streamify-array", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Converts an array into a Node readable stream.
    * Elements get removed from the array when they are read from the stream.
    */
  def apply(input: js.Array[_]): Readable = js.native
}

