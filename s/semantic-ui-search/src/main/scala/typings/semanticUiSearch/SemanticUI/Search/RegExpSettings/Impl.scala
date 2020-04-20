package typings.semanticUiSearch.SemanticUI.Search.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '(?:\s|^)'
    */
  var beginsWith: String
  /**
    * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
    */
  var escape: RegExp
}

object Impl {
  @scala.inline
  def apply(beginsWith: String, escape: RegExp): Impl = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

