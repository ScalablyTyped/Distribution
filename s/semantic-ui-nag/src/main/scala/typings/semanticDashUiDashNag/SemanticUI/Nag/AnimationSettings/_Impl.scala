package typings.semanticDashUiDashNag.SemanticUI.Nag.AnimationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'slide'
    */
  var hide: String
  /**
    * @default 'slide'
    */
  var show: String
}

object _Impl {
  @scala.inline
  def apply(hide: String, show: String): _Impl = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

