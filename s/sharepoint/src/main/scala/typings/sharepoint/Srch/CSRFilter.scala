package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSRFilter extends js.Object {
  var IsSelected: Boolean
  var RefinementCount: Double
  var RefinementName: String
  var RefinementToken: String
}

object CSRFilter {
  @scala.inline
  def apply(IsSelected: Boolean, RefinementCount: Double, RefinementName: String, RefinementToken: String): CSRFilter = {
    val __obj = js.Dynamic.literal(IsSelected = IsSelected, RefinementCount = RefinementCount, RefinementName = RefinementName, RefinementToken = RefinementToken)
  
    __obj.asInstanceOf[CSRFilter]
  }
}

