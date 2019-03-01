package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KinesisStreamArn extends js.Object {
  var kinesisStreamArn: java.lang.String
  var roleArn: java.lang.String
}

object Anon_KinesisStreamArn {
  @scala.inline
  def apply(kinesisStreamArn: java.lang.String, roleArn: java.lang.String): Anon_KinesisStreamArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kinesisStreamArn")(kinesisStreamArn)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_KinesisStreamArn]
  }
}

