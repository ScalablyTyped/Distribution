package typings.semanticUiSearch.SemanticUI.Search.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'cache'
    */
  var cache: String
  /**
    * @default 'results'
    */
  var results: String
}

object Impl {
  @scala.inline
  def apply(cache: String, results: String): Impl = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

