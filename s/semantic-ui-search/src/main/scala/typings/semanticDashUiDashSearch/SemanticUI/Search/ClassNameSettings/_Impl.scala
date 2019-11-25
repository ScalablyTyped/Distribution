package typings.semanticDashUiDashSearch.SemanticUI.Search.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'empty'
    */
  var empty: String
  /**
    * @default 'focus'
    */
  var focus: String
  /**
    * @default 'loading'
    */
  var loading: String
  /**
    * @default 'down'
    */
  var pressed: String
}

object _Impl {
  @scala.inline
  def apply(active: String, empty: String, focus: String, loading: String, pressed: String): _Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

