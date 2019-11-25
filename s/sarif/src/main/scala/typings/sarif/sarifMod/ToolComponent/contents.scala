package typings.sarif.sarifMod.ToolComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.localizedData
  - typings.sarif.sarifStrings.nonLocalizedData
*/
trait contents extends js.Object

object contents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localizedData: typings.sarif.sarifStrings.localizedData = this.cast("localizedData")
  @scala.inline
  def nonLocalizedData: typings.sarif.sarifStrings.nonLocalizedData = this.cast("nonLocalizedData")
}

