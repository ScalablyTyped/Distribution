package typings
package semanticDashUiDashTabLib.SemanticUINs.TabNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.ui:not(.menu)'
    */
  var parent: java.lang.String
  /**
    * @default '.ui.tab'
    */
  var tabs: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(parent: java.lang.String, tabs: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal(parent = parent, tabs = tabs)
  
    __obj.asInstanceOf[_Impl]
  }
}

