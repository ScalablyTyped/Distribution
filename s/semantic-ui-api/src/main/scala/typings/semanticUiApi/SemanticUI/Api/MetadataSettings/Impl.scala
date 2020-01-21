package typings.semanticUiApi.SemanticUI.Api.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'action'
    */
  var action: String
  /**
    * @default 'url'
    */
  var url: String
}

object Impl {
  @scala.inline
  def apply(action: String, url: String): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

