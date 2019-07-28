package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLogStreamArn extends js.Object {
  var id: String
  var logStreamArn: String
  var roleArn: String
}

object Anon_IdLogStreamArn {
  @scala.inline
  def apply(id: String, logStreamArn: String, roleArn: String): Anon_IdLogStreamArn = {
    val __obj = js.Dynamic.literal(id = id, logStreamArn = logStreamArn, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_IdLogStreamArn]
  }
}

