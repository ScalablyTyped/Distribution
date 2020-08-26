package typings.pulumiAws.wafv2RegexPatternSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly description of the regular expression pattern set.
    */
  val description: js.UndefOr[Input[String]] = js.native
  val lockToken: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name of the regular expression pattern set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
    */
  val regularExpressions: js.UndefOr[Input[js.Array[Input[RegexPatternSetRegularExpression]]]] = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
    */
  val scope: js.UndefOr[Input[String]] = js.native
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object RegexPatternSetState {
  @scala.inline
  def apply(): RegexPatternSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSetState]
  }
  @scala.inline
  implicit class RegexPatternSetStateOps[Self <: RegexPatternSetState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLockToken(value: Input[String]): Self = this.set("lockToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockToken: Self = this.set("lockToken", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRegularExpressionsVarargs(value: Input[RegexPatternSetRegularExpression]*): Self = this.set("regularExpressions", js.Array(value :_*))
    @scala.inline
    def setRegularExpressions(value: Input[js.Array[Input[RegexPatternSetRegularExpression]]]): Self = this.set("regularExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegularExpressions: Self = this.set("regularExpressions", js.undefined)
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

