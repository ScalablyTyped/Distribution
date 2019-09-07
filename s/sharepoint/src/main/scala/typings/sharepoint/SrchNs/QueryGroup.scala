package typings.sharepoint.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryGroup extends js.Object {
  var dataProvider: DataProvider
  var displays: js.Array[DisplayControl]
  var name: String
  var searchBoxes: js.Array[Refinement]
}

object QueryGroup {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    displays: js.Array[DisplayControl],
    name: String,
    searchBoxes: js.Array[Refinement]
  ): QueryGroup = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider, displays = displays, name = name, searchBoxes = searchBoxes)
  
    __obj.asInstanceOf[QueryGroup]
  }
}

