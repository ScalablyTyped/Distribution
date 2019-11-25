package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`2d`
  - typings.std.stdStrings.bitmaprenderer
  - typings.std.stdStrings.webgl
  - typings.std.stdStrings.webgl2
*/
trait OffscreenRenderingContextId extends js.Object

object OffscreenRenderingContextId {
  @scala.inline
  def `2d`: typings.std.stdStrings.`2d` = this.cast("2d")
  @scala.inline
  def bitmaprenderer: typings.std.stdStrings.bitmaprenderer = this.cast("bitmaprenderer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def webgl: typings.std.stdStrings.webgl = this.cast("webgl")
  @scala.inline
  def webgl2: typings.std.stdStrings.webgl2 = this.cast("webgl2")
}

