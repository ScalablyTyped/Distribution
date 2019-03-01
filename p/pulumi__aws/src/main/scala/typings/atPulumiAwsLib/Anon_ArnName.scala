package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnName extends js.Object {
  var arn: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ArnName {
  @scala.inline
  def apply(arn: java.lang.String = null, name: java.lang.String = null): Anon_ArnName = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_ArnName]
  }
}

