package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.searchParams.searchParamsStrings.none
  - typings.searchParams.searchParamsStrings.brackets
  - typings.searchParams.searchParamsStrings.index
*/
trait arrayFormat extends js.Object

object arrayFormat {
  @scala.inline
  def brackets: typings.searchParams.searchParamsStrings.brackets = this.cast("brackets")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def index: typings.searchParams.searchParamsStrings.index = this.cast("index")
  @scala.inline
  def none: typings.searchParams.searchParamsStrings.none = this.cast("none")
}

