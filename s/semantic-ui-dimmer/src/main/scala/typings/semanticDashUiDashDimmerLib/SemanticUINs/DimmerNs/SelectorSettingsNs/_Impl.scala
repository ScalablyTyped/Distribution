package typings
package semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.ui.dimmer > .content, .ui.dimmer > .content > .center'
    */
  var content: java.lang.String
  /**
    * @default '.dimmable'
    */
  var dimmable: java.lang.String
  /**
    * @default '.ui.dimmer'
    */
  var dimmer: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(content: java.lang.String, dimmable: java.lang.String, dimmer: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal(content = content, dimmable = dimmable, dimmer = dimmer)
  
    __obj.asInstanceOf[_Impl]
  }
}

