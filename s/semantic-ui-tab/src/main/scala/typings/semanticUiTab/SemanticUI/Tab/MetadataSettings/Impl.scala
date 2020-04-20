package typings.semanticUiTab.SemanticUI.Tab.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'loaded'
    */
  var loaded: String
  /**
    * @default 'promise'
    */
  var promise: String
  /**
    * @default 'tab'
    */
  var tab: String
}

object Impl {
  @scala.inline
  def apply(loaded: String, promise: String, tab: String): Impl = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

