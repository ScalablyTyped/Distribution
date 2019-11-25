package typings.reactDashGeosuggest.reactDashGeosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashGeosuggest.reactDashGeosuggestStrings.address
  - typings.reactDashGeosuggest.reactDashGeosuggestStrings.establishment
  - typings.reactDashGeosuggest.reactDashGeosuggestStrings.geocode
  - typings.reactDashGeosuggest.reactDashGeosuggestStrings.`(cities)`
  - typings.reactDashGeosuggest.reactDashGeosuggestStrings.`(regions)`
*/
trait QueryType extends js.Object

object QueryType {
  @scala.inline
  def `(cities)`: typings.reactDashGeosuggest.reactDashGeosuggestStrings.`(cities)` = this.cast("(cities)")
  @scala.inline
  def `(regions)`: typings.reactDashGeosuggest.reactDashGeosuggestStrings.`(regions)` = this.cast("(regions)")
  @scala.inline
  def address: typings.reactDashGeosuggest.reactDashGeosuggestStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typings.reactDashGeosuggest.reactDashGeosuggestStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typings.reactDashGeosuggest.reactDashGeosuggestStrings.geocode = this.cast("geocode")
}

