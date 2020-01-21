package typings.qlik.mod.LanguageCodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlik.qlikStrings.en
  - typings.qlik.qlikStrings.`en-US`
*/
trait English extends _ALL

object English {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typings.qlik.qlikStrings.en = this.cast("en")
  @scala.inline
  def `en-US`: typings.qlik.qlikStrings.`en-US` = this.cast("en-US")
}

