package typings
package selectizeLib.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchToken extends js.Object {
  var regex: stdLib.RegExp
  var string: java.lang.String
}

object ISearchToken {
  @scala.inline
  def apply(regex: stdLib.RegExp, string: java.lang.String): ISearchToken = {
    val __obj = js.Dynamic.literal(regex = regex, string = string)
  
    __obj.asInstanceOf[ISearchToken]
  }
}

