package typings.pulumiAws.getRegexPatternSetMod

import typings.pulumiAws.outputMod.wafv2.GetRegexPatternSetRegularExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegexPatternSetResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  val arn: String = js.native
  /**
    * The description of the set that helps with identification.
    */
  val description: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
    */
  val regularExpressions: js.Array[GetRegexPatternSetRegularExpression] = js.native
  val scope: String = js.native
}

object GetRegexPatternSetResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    name: String,
    regularExpressions: js.Array[GetRegexPatternSetRegularExpression],
    scope: String
  ): GetRegexPatternSetResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regularExpressions = regularExpressions.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegexPatternSetResult]
  }
  @scala.inline
  implicit class GetRegexPatternSetResultOps[Self <: GetRegexPatternSetResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegularExpressionsVarargs(value: GetRegexPatternSetRegularExpression*): Self = this.set("regularExpressions", js.Array(value :_*))
    @scala.inline
    def setRegularExpressions(value: js.Array[GetRegexPatternSetRegularExpression]): Self = this.set("regularExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

