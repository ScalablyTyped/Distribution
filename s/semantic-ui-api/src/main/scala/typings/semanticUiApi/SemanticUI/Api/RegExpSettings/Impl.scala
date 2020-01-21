package typings.semanticUiApi.SemanticUI.Api.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default /\{\/\$*[A-z0-9]+\}/g
    */
  var optional: RegExp
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var required: RegExp
}

object Impl {
  @scala.inline
  def apply(optional: RegExp, required: RegExp): Impl = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

