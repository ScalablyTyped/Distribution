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
    val __obj = js.Dynamic.literal(IsSelected = IsSelected.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CSRFilter]
  }
}

