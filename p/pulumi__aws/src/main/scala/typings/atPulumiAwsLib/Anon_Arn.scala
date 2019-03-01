package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arn extends js.Object {
  var arn: java.lang.String
  var name: java.lang.String
}

object Anon_Arn {
  @scala.inline
  def apply(arn: java.lang.String, name: java.lang.String): Anon_Arn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Arn]
  }
}

