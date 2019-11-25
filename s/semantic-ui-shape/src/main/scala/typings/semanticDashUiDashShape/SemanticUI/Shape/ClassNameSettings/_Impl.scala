package typings.semanticDashUiDashShape.SemanticUI.Shape.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'animating'
    */
  var animating: String
  /**
    * @default 'hidden'
    */
  var hidden: String
  /**
    * @default 'loading'
    */
  var loading: String
}

object _Impl {
  @scala.inline
  def apply(active: String, animating: String, hidden: String, loading: String): _Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

