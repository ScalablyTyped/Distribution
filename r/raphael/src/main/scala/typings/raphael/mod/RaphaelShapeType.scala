package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raphael.raphaelStrings.circle
  - typings.raphael.raphaelStrings.ellipse
  - typings.raphael.raphaelStrings.image
  - typings.raphael.raphaelStrings.rect
  - typings.raphael.raphaelStrings.text
  - typings.raphael.raphaelStrings.path
  - typings.raphael.raphaelStrings.set
*/
trait RaphaelShapeType extends js.Object

object RaphaelShapeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.raphael.raphaelStrings.circle = this.cast("circle")
  @scala.inline
  def ellipse: typings.raphael.raphaelStrings.ellipse = this.cast("ellipse")
  @scala.inline
  def image: typings.raphael.raphaelStrings.image = this.cast("image")
  @scala.inline
  def path: typings.raphael.raphaelStrings.path = this.cast("path")
  @scala.inline
  def rect: typings.raphael.raphaelStrings.rect = this.cast("rect")
  @scala.inline
  def set: typings.raphael.raphaelStrings.set = this.cast("set")
  @scala.inline
  def text: typings.raphael.raphaelStrings.text = this.cast("text")
}

