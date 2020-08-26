package typings.pulumiAws.redshiftParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.redshift.ParameterGroupParameter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupArgs extends js.Object {
  /**
    * The description of the Redshift parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The family of the Redshift parameter group.
    */
  val family: Input[String] = js.native
  /**
    * The name of the Redshift parameter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Redshift parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ParameterGroupParameter]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ParameterGroupArgs {
  @scala.inline
  def apply(family: Input[String]): ParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupArgs]
  }
  @scala.inline
  implicit class ParameterGroupArgsOps[Self <: ParameterGroupArgs] (val x: Self) extends AnyVal {
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
    def setFamily(value: Input[String]): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParametersVarargs(value: Input[ParameterGroupParameter]*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: Input[js.Array[Input[ParameterGroupParameter]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

