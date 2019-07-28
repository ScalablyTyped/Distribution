package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArn extends js.Object {
  var roleArn: String
  var topic: String
}

object Anon_RoleArn {
  @scala.inline
  def apply(roleArn: String, topic: String): Anon_RoleArn = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, topic = topic)
  
    __obj.asInstanceOf[Anon_RoleArn]
  }
}

