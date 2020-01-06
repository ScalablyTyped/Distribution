package typings.atPulumiAws.kinesisGetStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamArgs extends js.Object {
  /**
    * The name of the Kinesis Stream.
    */
  val name: String = js.native
}

object GetStreamArgs {
  @scala.inline
  def apply(name: String): GetStreamArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStreamArgs]
  }
}

