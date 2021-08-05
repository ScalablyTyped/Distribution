package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterableMod {
  
  @JSImport("@pulumi/pulumi/iterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output_[StringDictionary[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Output_[StringDictionary[js.Array[V]]]]
  
  inline def toObject[T, V](
    iter: Input[js.Array[Input[T]]],
    selector: js.Function1[/* t */ T, Input[js.Tuple2[Input[String], Input[V]]]]
  ): Output_[StringDictionary[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(iter.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Output_[StringDictionary[V]]]
}
