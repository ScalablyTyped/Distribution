package typings.semanticUiNag.SemanticUI.Nag.AnimationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'slide'
    */
  var hide: String
  /**
    * @default 'slide'
    */
  var show: String
}

object Impl {
  @scala.inline
  def apply(hide: String, show: String): Impl = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

