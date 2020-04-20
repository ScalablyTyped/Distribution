package typings.semanticUiRating.SemanticUI.Rating.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'hover'
    */
  var hover: String
  /**
    * @default 'loading'
    */
  var loading: String
}

object Impl {
  @scala.inline
  def apply(active: String, hover: String, loading: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

