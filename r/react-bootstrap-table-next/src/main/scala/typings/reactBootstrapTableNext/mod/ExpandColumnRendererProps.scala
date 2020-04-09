package typings.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandColumnRendererProps extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var rowKey: String
}

object ExpandColumnRendererProps {
  @scala.inline
  def apply(expandable: Boolean, expanded: Boolean, rowKey: String): ExpandColumnRendererProps = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandColumnRendererProps]
  }
}

