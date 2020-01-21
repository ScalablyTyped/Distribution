package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.searchParams.searchParamsStrings.none
  - typings.searchParams.searchParamsStrings.string
  - typings.searchParams.searchParamsStrings.unicode
  - typings.searchParams.searchParamsStrings.`empty-true`
*/
trait booleanFormat extends js.Object

object booleanFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `empty-true`: typings.searchParams.searchParamsStrings.`empty-true` = this.cast("empty-true")
  @scala.inline
  def none: typings.searchParams.searchParamsStrings.none = this.cast("none")
  @scala.inline
  def string: typings.searchParams.searchParamsStrings.string = this.cast("string")
  @scala.inline
  def unicode: typings.searchParams.searchParamsStrings.unicode = this.cast("unicode")
}

