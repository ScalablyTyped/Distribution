package typings.reactSplitPane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSplitPane.reactSplitPaneStrings.vertical
  - typings.reactSplitPane.reactSplitPaneStrings.horizontal
*/
trait Split extends js.Object

object Split {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.reactSplitPane.reactSplitPaneStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.reactSplitPane.reactSplitPaneStrings.vertical = this.cast("vertical")
}

