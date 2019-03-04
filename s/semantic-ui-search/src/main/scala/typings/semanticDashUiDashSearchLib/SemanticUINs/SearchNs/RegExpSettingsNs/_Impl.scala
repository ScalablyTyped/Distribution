package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchNs.RegExpSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '(?:\s|^)'
    */
  var beginsWith: java.lang.String
  /**
    * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
    */
  var escape: stdLib.RegExp
}

object _Impl {
  @scala.inline
  def apply(beginsWith: java.lang.String, escape: stdLib.RegExp): _Impl = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith, escape = escape)
  
    __obj.asInstanceOf[_Impl]
  }
}

