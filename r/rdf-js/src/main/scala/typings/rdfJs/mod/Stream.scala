package typings.rdfJs.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream[Q /* <: BaseQuad */] extends EventEmitter {
  /**
    * This method pulls a quad out of the internal buffer and returns it.
    * If there is no quad available, then it will return null.
    *
    * @return A quad from the internal buffer, or null if none is available.
    */
  def read(): Q | Null = js.native
}

