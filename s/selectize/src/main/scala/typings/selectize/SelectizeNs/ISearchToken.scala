package typings.selectize.SelectizeNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchToken extends js.Object {
  var regex: RegExp
  var string: String
}

object ISearchToken {
  @scala.inline
  def apply(regex: RegExp, string: String): ISearchToken = {
    val __obj = js.Dynamic.literal(regex = regex, string = string)
  
    __obj.asInstanceOf[ISearchToken]
  }
}

