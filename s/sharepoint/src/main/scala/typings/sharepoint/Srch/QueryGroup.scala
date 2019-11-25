package typings.sharepoint.Srch

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
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchBoxes = searchBoxes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryGroup]
  }
}

