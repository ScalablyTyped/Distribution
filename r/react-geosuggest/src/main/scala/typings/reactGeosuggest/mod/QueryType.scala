package typings.reactGeosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactGeosuggest.reactGeosuggestStrings.address
  - typings.reactGeosuggest.reactGeosuggestStrings.establishment
  - typings.reactGeosuggest.reactGeosuggestStrings.geocode
  - typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis
  - typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis
*/
trait QueryType extends js.Object

object QueryType {
  @scala.inline
  def LeftparenthesiscitiesRightparenthesis: typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis = this.cast("(cities)")
  @scala.inline
  def LeftparenthesisregionsRightparenthesis: typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis = this.cast("(regions)")
  @scala.inline
  def address: typings.reactGeosuggest.reactGeosuggestStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typings.reactGeosuggest.reactGeosuggestStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typings.reactGeosuggest.reactGeosuggestStrings.geocode = this.cast("geocode")
}

