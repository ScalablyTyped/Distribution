package typings.atPulumiAws.wafSizeConstraintSetMod

import typings.atPulumiAws.Anon_ComparisonOperatorFieldToMatchSize
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSetArgs extends js.Object {
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: js.UndefOr[Input[js.Array[Input[Anon_ComparisonOperatorFieldToMatchSize]]]] = js.undefined
}

object SizeConstraintSetArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    sizeConstraints: Input[js.Array[Input[Anon_ComparisonOperatorFieldToMatchSize]]] = null
  ): SizeConstraintSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sizeConstraints != null) __obj.updateDynamic("sizeConstraints")(sizeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetArgs]
  }
}

