package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.LabelSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 200
    */
  var duration: scala.Double
  /**
    * @default 'horizontal flip'
    */
  var transition: java.lang.String
  /**
    * @default false
    */
  var variation: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    duration: scala.Double,
    transition: java.lang.String,
    variation: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(duration = duration, transition = transition, variation = variation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

