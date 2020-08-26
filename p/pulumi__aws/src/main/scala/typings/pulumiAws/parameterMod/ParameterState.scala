package typings.pulumiAws.parameterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.parameterTypeMod.ParameterType
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterState extends js.Object {
  /**
    * A regular expression used to validate the parameter value.
    */
  val allowedPattern: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the parameter.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the parameter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The KMS key id or arn for encrypting a SecureString.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
    */
  val overwrite: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
    */
  val tier: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
    */
  val `type`: js.UndefOr[Input[ParameterType]] = js.native
  /**
    * The value of the parameter.
    */
  val value: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the parameter.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object ParameterState {
  @scala.inline
  def apply(): ParameterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterState]
  }
  @scala.inline
  implicit class ParameterStateOps[Self <: ParameterState] (val x: Self) extends AnyVal {
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
    def setAllowedPattern(value: Input[String]): Self = this.set("allowedPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedPattern: Self = this.set("allowedPattern", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverwrite(value: Input[Boolean]): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTier(value: Input[String]): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    @scala.inline
    def setType(value: Input[ParameterType]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVersion(value: Input[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

