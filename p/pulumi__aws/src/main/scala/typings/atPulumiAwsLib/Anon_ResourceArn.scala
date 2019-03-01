package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceArn extends js.Object {
  var resourceArn: java.lang.String
  var roleArn: java.lang.String
}

object Anon_ResourceArn {
  @scala.inline
  def apply(resourceArn: java.lang.String, roleArn: java.lang.String): Anon_ResourceArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceArn")(resourceArn)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_ResourceArn]
  }
}

