package typings.pulumiAws.outputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSetSqlInjectionMatchTuple extends js.Object {
  /**
    * Specifies where in a web request to look for snippets of malicious SQL code.
    */
  var fieldToMatch: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch = js.native
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SqlInjectionMatchTuple.html#WAF-Type-SqlInjectionMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String = js.native
}

object SqlInjectionMatchSetSqlInjectionMatchTuple {
  @scala.inline
  def apply(fieldToMatch: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch, textTransformation: String): SqlInjectionMatchSetSqlInjectionMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetSqlInjectionMatchTuple]
  }
  @scala.inline
  implicit class SqlInjectionMatchSetSqlInjectionMatchTupleOps[Self <: SqlInjectionMatchSetSqlInjectionMatchTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldToMatch(value: SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextTransformation(value: String): Self = this.set("textTransformation", value.asInstanceOf[js.Any])
  }
  
}

