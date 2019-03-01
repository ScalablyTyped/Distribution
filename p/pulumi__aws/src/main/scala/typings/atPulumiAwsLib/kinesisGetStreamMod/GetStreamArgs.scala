package typings
package atPulumiAwsLib.kinesisGetStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamArgs extends js.Object {
  /**
    * The name of the Kinesis Stream.
    */
  val name: java.lang.String
}

object GetStreamArgs {
  @scala.inline
  def apply(name: java.lang.String): GetStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetStreamArgs]
  }
}

