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
class AbstractRangeCls () extends AbstractRange {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  /* CompleteClass */
  override val endContainer: Node = js.native
  /**
    * Returns range's end offset.
    */
  /* CompleteClass */
  override val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  /* CompleteClass */
  override val startContainer: Node = js.native
  /**
    * Returns range's start offset.
    */
  /* CompleteClass */
  override val startOffset: Double = js.native
}

@JSGlobal("AbstractRange")
@js.native
object AbstractRange extends Instantiable0[AbstractRange]

