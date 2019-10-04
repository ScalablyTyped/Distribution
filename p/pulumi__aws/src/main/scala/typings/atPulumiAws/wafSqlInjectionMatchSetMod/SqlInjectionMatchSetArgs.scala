package typings.atPulumiAws.wafSqlInjectionMatchSetMod

import typings.atPulumiAws.typesInputMod.wafNs.SqlInjectionMatchSetSqlInjectionMatchTuple
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSetArgs extends js.Object {
  /**
    * The name or description of the SQL Injection Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: js.UndefOr[Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]] = js.undefined
}

object SqlInjectionMatchSetArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    sqlInjectionMatchTuples: Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]] = null
  ): SqlInjectionMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sqlInjectionMatchTuples != null) __obj.updateDynamic("sqlInjectionMatchTuples")(sqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetArgs]
  }
}

