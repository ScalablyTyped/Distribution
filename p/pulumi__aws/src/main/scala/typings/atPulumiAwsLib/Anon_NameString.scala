package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameString extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NameString {
  @scala.inline
  def apply(name: java.lang.String = null): Anon_NameString = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_NameString]
  }
}

