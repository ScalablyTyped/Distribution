package typings.strange.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strange", JSImport.Namespace)
@js.native
/**
  *
  * @param begin Range's beginning, or left endpoint.
  * @param end Range's end, or right endpoint.
  * @param bounds Range's bounds.
  */
class Class[T /* <: Endpoint */] ()
  extends typings.std.Range {
  def this(begin: T) = this()
  def this(begin: T, end: T) = this()
  def this(begin: Null, end: T) = this()
  def this(begin: T, end: T, bounds: Bounds) = this()
  def this(begin: T, end: Null, bounds: Bounds) = this()
  def this(begin: Null, end: T, bounds: Bounds) = this()
  def this(begin: Null, end: Null, bounds: Bounds) = this()
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  /* CompleteClass */
  override val collapsed: Boolean = js.native
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

