package typings.pulumiAws.wafByteMatchSetMod

import typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetArgs extends js.Object {
  /**
    * Specifies the bytes (typically a string that corresponds
    * with ASCII characters) that you want to search for in web requests,
    * the location in requests that you want to search, and other settings.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]] = js.native
  /**
    * The name or description of the Byte Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ByteMatchSetArgs {
  @scala.inline
  def apply(
    byteMatchTuples: Input[js.Array[Input[ByteMatchSetByteMatchTuple]]] = null,
    name: Input[String] = null
  ): ByteMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (byteMatchTuples != null) __obj.updateDynamic("byteMatchTuples")(byteMatchTuples.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetArgs]
  }
}

