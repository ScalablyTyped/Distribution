package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  - typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
*/
trait FilterType extends js.Object

object FilterType {
  @scala.inline
  def ArrayFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter = this.cast("ArrayFilter")
  @scala.inline
  def CustomFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter = this.cast("CustomFilter")
  @scala.inline
  def DateFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter = this.cast("DateFilter")
  @scala.inline
  def NumberFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter = this.cast("NumberFilter")
  @scala.inline
  def RegexFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter = this.cast("RegexFilter")
  @scala.inline
  def SelectFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter = this.cast("SelectFilter")
  @scala.inline
  def TextFilter: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter = this.cast("TextFilter")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

