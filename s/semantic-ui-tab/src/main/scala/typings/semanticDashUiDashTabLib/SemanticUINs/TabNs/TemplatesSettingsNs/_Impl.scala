package typings
package semanticDashUiDashTabLib.SemanticUINs.TabNs.TemplatesSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * returns page title
    */
  def determineTitle(tabArray: js.Array[_]): java.lang.String
}

object _Impl {
  @scala.inline
  def apply(determineTitle: js.Function1[js.Array[_], java.lang.String]): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("determineTitle")(determineTitle)
    __obj.asInstanceOf[_Impl]
  }
}

