package typings.semanticDashUiDashApi.SemanticUI.Api.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'action'
    */
  var action: String
  /**
    * @default 'url'
    */
  var url: String
}

object _Impl {
  @scala.inline
  def apply(action: String, url: String): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

