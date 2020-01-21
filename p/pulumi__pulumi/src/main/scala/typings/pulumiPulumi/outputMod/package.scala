package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  type Input[T] = T | js.Promise[T] | typings.pulumiPulumi.outputMod.OutputInstance[T]
  type Inputs = typings.std.Record[java.lang.String, typings.pulumiPulumi.outputMod.Input[js.Any]]
  type Lifted[T] = js.Object | (typings.pulumiPulumi.outputMod.LiftedObject[
    java.lang.String | T, 
    typings.pulumiPulumi.outputMod.NonFunctionPropertyNames[java.lang.String | T]
  ]) | typings.pulumiPulumi.outputMod.LiftedArray[js.Any]
  type LiftedObject[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P] extends @pulumi/pulumi.@pulumi/pulumi/output.OutputInstance<infer T1>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : T[P] extends std.Promise<infer T2>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ typings.pulumiPulumi.pulumiPulumiStrings.LiftedObject with js.Any
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Output_[T] = typings.pulumiPulumi.outputMod.OutputInstance[T] with typings.pulumiPulumi.outputMod.Lifted[T]
  type Unwrap[T] = typings.pulumiPulumi.outputMod.UnwrapSimple[js.Any | T]
  type UnwrapSimple[T] = typings.pulumiPulumi.outputMod.UnwrappedObject[T] | typings.pulumiPulumi.outputMod.UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ typings.pulumiPulumi.pulumiPulumiStrings.UnwrappedObject with T
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
