package typings.rotJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rotJs.rotJsStrings.hex
  - typings.rotJs.rotJsStrings.rect
  - typings.rotJs.rotJsStrings.tile
  - typings.rotJs.rotJsStrings.`tile-gl`
  - typings.rotJs.rotJsStrings.term
*/
trait LayoutType extends js.Object

object LayoutType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.rotJs.rotJsStrings.hex = this.cast("hex")
  @scala.inline
  def rect: typings.rotJs.rotJsStrings.rect = this.cast("rect")
  @scala.inline
  def term: typings.rotJs.rotJsStrings.term = this.cast("term")
  @scala.inline
  def tile: typings.rotJs.rotJsStrings.tile = this.cast("tile")
  @scala.inline
  def `tile-gl`: typings.rotJs.rotJsStrings.`tile-gl` = this.cast("tile-gl")
}

