package typings
package atPulumiAwsLib.wafregionalByteMatchSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetState extends js.Object {
  /**
    * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
    */
  val byteMatchTuples: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchPositionalConstraint]
      ]
    ]
  ] = js.undefined
  /**
    * **Deprecated**, use `byte_match_tuples` instead.
    */
  val byte_match_tuple: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchPositionalConstraint]
      ]
    ]
  ] = js.undefined
  /**
    * The name or description of the ByteMatchSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

