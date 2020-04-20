package typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'overlay'
    */
  var bottom: String
  /**
    * @default 'uncover'
    */
  var left: String
  /**
    * @default 'uncover'
    */
  var right: String
  /**
    * @default 'overlay'
    */
  var top: String
}

object Impl {
  @scala.inline
  def apply(bottom: String, left: String, right: String, top: String): Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

