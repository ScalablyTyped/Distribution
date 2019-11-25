package typings.rotDashJs.libDisplayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rotDashJs.rotDashJsStrings.hex
  - typings.rotDashJs.rotDashJsStrings.rect
  - typings.rotDashJs.rotDashJsStrings.tile
  - typings.rotDashJs.rotDashJsStrings.`tile-gl`
  - typings.rotDashJs.rotDashJsStrings.term
*/
trait LayoutType extends js.Object

object LayoutType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.rotDashJs.rotDashJsStrings.hex = this.cast("hex")
  @scala.inline
  def rect: typings.rotDashJs.rotDashJsStrings.rect = this.cast("rect")
  @scala.inline
  def term: typings.rotDashJs.rotDashJsStrings.term = this.cast("term")
  @scala.inline
  def tile: typings.rotDashJs.rotDashJsStrings.tile = this.cast("tile")
  @scala.inline
  def `tile-gl`: typings.rotDashJs.rotDashJsStrings.`tile-gl` = this.cast("tile-gl")
}

