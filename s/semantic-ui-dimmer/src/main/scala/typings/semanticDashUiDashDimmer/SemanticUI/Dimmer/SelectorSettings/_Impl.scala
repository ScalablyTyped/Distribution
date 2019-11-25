package typings.semanticDashUiDashDimmer.SemanticUI.Dimmer.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.ui.dimmer > .content, .ui.dimmer > .content > .center'
    */
  var content: String
  /**
    * @default '.dimmable'
    */
  var dimmable: String
  /**
    * @default '.ui.dimmer'
    */
  var dimmer: String
}

object _Impl {
  @scala.inline
  def apply(content: String, dimmable: String, dimmer: String): _Impl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmer = dimmer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

