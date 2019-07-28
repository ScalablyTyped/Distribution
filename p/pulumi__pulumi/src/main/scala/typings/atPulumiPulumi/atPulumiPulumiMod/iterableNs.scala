package typings.atPulumiPulumi.atPulumiPulumiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "iterable")
@js.native
object iterableNs extends js.Object {
  def groupBy[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output[StringDictionary[js.Array[V]]] = js.native
  def toObject[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output[StringDictionary[V]] = js.native
}

