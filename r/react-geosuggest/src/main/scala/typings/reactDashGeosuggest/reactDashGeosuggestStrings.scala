package typings.reactDashGeosuggest

import typings.reactDashGeosuggest.reactDashGeosuggestMod.QueryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashGeosuggestStrings {
  @js.native
  sealed trait `(cities)` extends QueryType
  
  @js.native
  sealed trait `(regions)` extends QueryType
  
  @js.native
  sealed trait address extends QueryType
  
  @js.native
  sealed trait establishment extends QueryType
  
  @js.native
  sealed trait geocode extends QueryType
  
  @scala.inline
  def `(cities)`: `(cities)` = "(cities)".asInstanceOf[`(cities)`]
  @scala.inline
  def `(regions)`: `(regions)` = "(regions)".asInstanceOf[`(regions)`]
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  @scala.inline
  def establishment: establishment = "establishment".asInstanceOf[establishment]
  @scala.inline
  def geocode: geocode = "geocode".asInstanceOf[geocode]
}

