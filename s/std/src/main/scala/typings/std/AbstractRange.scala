package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractRange extends js.Object {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean
  /**
    * Returns range's end node.
    */
  val endContainer: Node
  /**
    * Returns range's end offset.
    */
  val endOffset: Double
  /**
    * Returns range's start node.
    */
  val startContainer: Node
  /**
    * Returns range's start offset.
    */
  val startOffset: Double
}

@JSGlobal("AbstractRange")
@js.native
object AbstractRange extends Instantiable0[AbstractRange]

