package typings
package atPulumiAwsLib.wafSizeConstraintSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSetState extends js.Object {
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ComparisonOperatorFieldToMatch]
      ]
    ]
  ] = js.undefined
}

