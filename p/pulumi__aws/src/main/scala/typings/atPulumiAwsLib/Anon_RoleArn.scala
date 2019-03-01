package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArn extends js.Object {
  var roleArn: java.lang.String
  var topic: java.lang.String
}

object Anon_RoleArn {
  @scala.inline
  def apply(roleArn: java.lang.String, topic: java.lang.String): Anon_RoleArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_RoleArn]
  }
}

