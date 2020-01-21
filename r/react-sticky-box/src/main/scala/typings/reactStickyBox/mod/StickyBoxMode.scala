package typings.reactStickyBox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactStickyBox.reactStickyBoxStrings.relative
  - typings.reactStickyBox.reactStickyBoxStrings.stickyBottom
  - typings.reactStickyBox.reactStickyBoxStrings.stickyTop
*/
trait StickyBoxMode extends js.Object

object StickyBoxMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relative: typings.reactStickyBox.reactStickyBoxStrings.relative = this.cast("relative")
  @scala.inline
  def stickyBottom: typings.reactStickyBox.reactStickyBoxStrings.stickyBottom = this.cast("stickyBottom")
  @scala.inline
  def stickyTop: typings.reactStickyBox.reactStickyBoxStrings.stickyTop = this.cast("stickyTop")
}

