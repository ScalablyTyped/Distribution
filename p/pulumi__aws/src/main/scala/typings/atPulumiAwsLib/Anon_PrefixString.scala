package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixString extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrefixString {
  @scala.inline
  def apply(prefix: java.lang.String = null): Anon_PrefixString = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_PrefixString]
  }
}

