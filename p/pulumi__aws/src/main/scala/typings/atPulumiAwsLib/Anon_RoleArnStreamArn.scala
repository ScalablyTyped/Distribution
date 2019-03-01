package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArnStreamArn extends js.Object {
  var roleArn: java.lang.String
  var streamArn: java.lang.String
}

object Anon_RoleArnStreamArn {
  @scala.inline
  def apply(roleArn: java.lang.String, streamArn: java.lang.String): Anon_RoleArnStreamArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("streamArn")(streamArn)
    __obj.asInstanceOf[Anon_RoleArnStreamArn]
  }
}

