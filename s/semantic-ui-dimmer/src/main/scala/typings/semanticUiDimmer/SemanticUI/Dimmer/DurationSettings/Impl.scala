package typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 500
    */
  var hide: Double
  /**
    * @default 500
    */
  var show: Double
}

object Impl {
  @scala.inline
  def apply(hide: Double, show: Double): Impl = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

