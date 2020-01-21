package typings.semanticUiApi.SemanticUI.Api.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'error'
    */
  var error: String
  /**
    * @default 'loading'
    */
  var loading: String
}

object Impl {
  @scala.inline
  def apply(error: String, loading: String): Impl = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

