package typings.atPulumiAws.wafregionalSizeConstraintSetMod

import typings.atPulumiAws.typesInputMod.wafregional.SizeConstraintSetSizeConstraint
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintSetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: js.UndefOr[Input[js.Array[Input[SizeConstraintSetSizeConstraint]]]] = js.native
}

object SizeConstraintSetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    sizeConstraints: Input[js.Array[Input[SizeConstraintSetSizeConstraint]]] = null
  ): SizeConstraintSetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sizeConstraints != null) __obj.updateDynamic("sizeConstraints")(sizeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetState]
  }
}

