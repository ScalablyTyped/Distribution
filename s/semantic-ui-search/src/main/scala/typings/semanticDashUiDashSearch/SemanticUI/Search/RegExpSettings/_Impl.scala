package typings.semanticDashUiDashSearch.SemanticUI.Search.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '(?:\s|^)'
    */
  var beginsWith: String
  /**
    * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
    */
  var escape: RegExp
}

object _Impl {
  @scala.inline
  def apply(beginsWith: String, escape: RegExp): _Impl = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith, escape = escape)
  
    __obj.asInstanceOf[_Impl]
  }
}

