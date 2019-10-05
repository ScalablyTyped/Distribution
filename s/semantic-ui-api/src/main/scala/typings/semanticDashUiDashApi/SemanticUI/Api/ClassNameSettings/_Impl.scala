package typings.semanticDashUiDashApi.SemanticUI.Api.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'error'
    */
  var error: String
  /**
    * @default 'loading'
    */
  var loading: String
}

object _Impl {
  @scala.inline
  def apply(error: String, loading: String): _Impl = {
    val __obj = js.Dynamic.literal(error = error, loading = loading)
  
    __obj.asInstanceOf[_Impl]
  }
}

