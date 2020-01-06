package typings.atPulumiAws.wafSqlInjectionMatchSetMod

import typings.atPulumiAws.typesInputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSetState extends js.Object {
  /**
    * The name or description of the SQL Injection Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: js.UndefOr[Input[js.Array[Input[SqlInjectionMatchSetSqlInjectionMatchTuple]]]] = js.native
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

