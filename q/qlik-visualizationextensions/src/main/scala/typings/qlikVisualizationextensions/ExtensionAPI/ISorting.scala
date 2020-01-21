package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.sorting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISorting extends js.Object {
  var uses: sorting
}

object ISorting {
  @scala.inline
  def apply(uses: sorting): ISorting = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISorting]
  }
}

