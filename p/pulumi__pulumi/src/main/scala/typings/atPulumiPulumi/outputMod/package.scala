package typings.atPulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  import typings.std.Record

  type Input[T] = T | js.Promise[T] | OutputInstance[T]
  type Inputs = Record[String, Input[js.Any]]
  type Lifted[T] = (LiftedObject[String | T, NonFunctionPropertyNames[String | T]]) | LiftedArray[js.Any] | js.Object
  type LiftedObject[T, K /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K ]: @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ typings.atPulumiPulumi.atPulumiPulumiStrings.LiftedObject with T
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Output[T] = OutputInstance[T] with Lifted[T]
  type Unwrap[T] = UnwrapSimple[js.Any | T]
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ typings.atPulumiPulumi.atPulumiPulumiStrings.UnwrappedObject with T
  type primitive = js.UndefOr[js.Function | String | Double | Boolean | Null]
}
