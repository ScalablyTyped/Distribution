package typings.semanticDashUiDashSticky.SemanticUINs.StickyNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'bottom'
    */
  var bottom: String
  /**
    * @default 'bound'
    */
  var bound: String
  /**
    * @default 'fixed'
    */
  var fixed: String
  /**
    * @default 'native'
    */
  var supported: String
  /**
    * @default 'top'
    */
  var top: String
}

object _Impl {
  @scala.inline
  def apply(bottom: String, bound: String, fixed: String, supported: String, top: String): _Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom, bound = bound, fixed = fixed, supported = supported, top = top)
  
    __obj.asInstanceOf[_Impl]
  }
}

