package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  type Input[T] = T | js.Promise[T] | OutputInstance[T]
  type Inputs = stdLib.Record[java.lang.String, Input[js.Any]]
  type Lifted[T] = (LiftedObject[T, NonFunctionPropertyNames[T]]) | LiftedArray[js.Any] | (LiftedObject[java.lang.String, NonFunctionPropertyNames[java.lang.String]]) | js.Object
  type LiftedObject[T, K /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K ]: @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ atPulumiPulumiLib.atPulumiPulumiLibStrings.LiftedObject with T
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Output[T] = OutputInstance[T] with Lifted[T]
  type Unwrap[T] = UnwrapSimple[T] | UnwrapSimple[js.Any]
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ atPulumiPulumiLib.atPulumiPulumiLibStrings.UnwrappedObject with T
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
