package typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
  @scala.inline
  def apply(active: String, empty: String, focus: String, loading: String, pressed: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

