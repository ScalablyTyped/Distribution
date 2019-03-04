package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLogStreamArn extends js.Object {
  var id: java.lang.String
  var logStreamArn: java.lang.String
  var roleArn: java.lang.String
}

object Anon_IdLogStreamArn {
  @scala.inline
  def apply(id: java.lang.String, logStreamArn: java.lang.String, roleArn: java.lang.String): Anon_IdLogStreamArn = {
    val __obj = js.Dynamic.literal(id = id, logStreamArn = logStreamArn, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_IdLogStreamArn]
  }
}

