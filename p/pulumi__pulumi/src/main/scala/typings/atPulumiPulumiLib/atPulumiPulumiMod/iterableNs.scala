package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "iterable")
@js.native
object iterableNs extends js.Object {
  def groupBy[T, V](
    iter: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[T]]],
    selector: js.Function1[
      /* t */ T, 
      atPulumiPulumiLib.outputMod.Input[
        js.Tuple2[
          atPulumiPulumiLib.outputMod.Input[java.lang.String], 
          atPulumiPulumiLib.outputMod.Input[V]
        ]
      ]
    ]
  ): atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[js.Array[V]]] = js.native
  def toObject[T, V](
    iter: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[T]]],
    selector: js.Function1[
      /* t */ T, 
      atPulumiPulumiLib.outputMod.Input[
        js.Tuple2[
          atPulumiPulumiLib.outputMod.Input[java.lang.String], 
          atPulumiPulumiLib.outputMod.Input[V]
        ]
      ]
    ]
  ): atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[V]] = js.native
}

