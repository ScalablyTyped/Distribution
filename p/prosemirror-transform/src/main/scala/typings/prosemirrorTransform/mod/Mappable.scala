package typings.prosemirrorTransform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mappable extends js.Object {
  
  /**
    * Map a position through this object. When given, `assoc` (should
    * be -1 or 1, defaults to 1) determines with which side the
    * position is associated, which determines in which direction to
    * move when a chunk of content is inserted at the mapped position.
    */
  def map(pos: Double): Double = js.native
  def map(pos: Double, assoc: Double): Double = js.native
  
  /**
    * Map a position, and return an object containing additional
    * information about the mapping. The result's `deleted` field tells
    * you whether the position was deleted (completely enclosed in a
    * replaced range) during the mapping. When content on only one side
    * is deleted, the position itself is only considered deleted when
    * `assoc` points in the direction of the deleted content.
    */
  def mapResult(pos: Double): MapResult = js.native
  def mapResult(pos: Double, assoc: Double): MapResult = js.native
}
