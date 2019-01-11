package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "iterable")
@js.native
object iterableNs extends js.Object {
  def groupBy[T, V](
    iter: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[T]]],
    selector: js.Function1[
      /* t */ T, 
      atPulumiPulumiLib.resourceMod.Input[
        js.Tuple2[
          atPulumiPulumiLib.resourceMod.Input[java.lang.String], 
          atPulumiPulumiLib.resourceMod.Input[V]
        ]
      ]
    ]
  ): atPulumiPulumiLib.resourceMod.Output[org.scalablytyped.runtime.StringDictionary[js.Array[V]]] = js.native
  def toObject[T, V](
    iter: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[T]]],
    selector: js.Function1[
      /* t */ T, 
      atPulumiPulumiLib.resourceMod.Input[
        js.Tuple2[
          atPulumiPulumiLib.resourceMod.Input[java.lang.String], 
          atPulumiPulumiLib.resourceMod.Input[V]
        ]
      ]
    ]
  ): atPulumiPulumiLib.resourceMod.Output[org.scalablytyped.runtime.StringDictionary[V]] = js.native
}

