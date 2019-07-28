package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KinesisStreamArn extends js.Object {
  var kinesisStreamArn: String
  var roleArn: String
}

object Anon_KinesisStreamArn {
  @scala.inline
  def apply(kinesisStreamArn: String, roleArn: String): Anon_KinesisStreamArn = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn, roleArn = roleArn)
  
    __obj.asInstanceOf[Anon_KinesisStreamArn]
  }
}

