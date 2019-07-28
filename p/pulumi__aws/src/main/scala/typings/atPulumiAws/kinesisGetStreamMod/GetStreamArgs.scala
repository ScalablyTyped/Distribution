package typings.atPulumiAws.kinesisGetStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamArgs extends js.Object {
  /**
    * The name of the Kinesis Stream.
    */
  val name: String
}

object GetStreamArgs {
  @scala.inline
  def apply(name: String): GetStreamArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetStreamArgs]
  }
}

