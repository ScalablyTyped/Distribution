package typings.atPulumiAws.rdsClusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ApplyMethodName
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupState extends js.Object {
  /**
    * The ARN of the db cluster parameter group.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The family of the DB cluster parameter group.
    */
  val family: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the DB parameter.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[Anon_ApplyMethodName]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterParameterGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    family: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    parameters: Input[js.Array[Input[Anon_ApplyMethodName]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterParameterGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupState]
  }
}

