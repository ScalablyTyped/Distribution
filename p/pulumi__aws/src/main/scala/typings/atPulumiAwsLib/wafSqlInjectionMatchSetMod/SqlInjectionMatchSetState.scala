package typings
package atPulumiAwsLib.wafSqlInjectionMatchSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSetState extends js.Object {
  /**
    * The name or description of the SQL Injection Match Set.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchTextTransformationAnonDataTypeInput]
      ]
    ]
  ] = js.undefined
}

object SqlInjectionMatchSetState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sqlInjectionMatchTuples: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldToMatchTextTransformationAnonDataTypeInput]
      ]
    ] = null
  ): SqlInjectionMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sqlInjectionMatchTuples != null) __obj.updateDynamic("sqlInjectionMatchTuples")(sqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetState]
  }
}

