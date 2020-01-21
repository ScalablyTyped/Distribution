package typings.simonwepSelectionJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch
  - typings.simonwepSelectionJs.simonwepSelectionJsStrings.center
  - typings.simonwepSelectionJs.simonwepSelectionJsStrings.cover
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.simonwepSelectionJs.simonwepSelectionJsStrings.center = this.cast("center")
  @scala.inline
  def cover: typings.simonwepSelectionJs.simonwepSelectionJsStrings.cover = this.cast("cover")
  @scala.inline
  def touch: typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch = this.cast("touch")
}

