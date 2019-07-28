package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceArn extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object Anon_ResourceArn {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): Anon_ResourceArn = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_ResourceArn]
  }
}

