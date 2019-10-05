package typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod

import typings.atPulumiAws.typesInputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSetState extends js.Object {
  /**
    * The name or description of the SizeConstraintSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: js.UndefOr[Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]] = js.undefined
}

object SqlInjectionMatchSetState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    sqlInjectionMatchTuples: Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]] = null
  ): SqlInjectionMatchSetState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sqlInjectionMatchTuples != null) __obj.updateDynamic("sqlInjectionMatchTuples")(sqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetState]
  }
}

