package typings.atPulumiAws.wafregionalByteMatchSetMod

import typings.atPulumiAws.Anon_FieldToMatchPositionalConstraint
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetArgs extends js.Object {
  /**
    * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[Anon_FieldToMatchPositionalConstraint]]]] = js.undefined
  /**
    * The name or description of the ByteMatchSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ByteMatchSetArgs {
  @scala.inline
  def apply(
    byteMatchTuples: Input[js.Array[Input[Anon_FieldToMatchPositionalConstraint]]] = null,
    name: Input[String] = null
  ): ByteMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (byteMatchTuples != null) __obj.updateDynamic("byteMatchTuples")(byteMatchTuples.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetArgs]
  }
}

