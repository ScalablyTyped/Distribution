package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.searchParams.searchParamsStrings.default
  - typings.searchParams.searchParamsStrings.string
  - typings.searchParams.searchParamsStrings.hidden
*/
trait nullFormat extends js.Object

object nullFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.searchParams.searchParamsStrings.default = this.cast("default")
  @scala.inline
  def hidden: typings.searchParams.searchParamsStrings.hidden = this.cast("hidden")
  @scala.inline
  def string: typings.searchParams.searchParamsStrings.string = this.cast("string")
}

