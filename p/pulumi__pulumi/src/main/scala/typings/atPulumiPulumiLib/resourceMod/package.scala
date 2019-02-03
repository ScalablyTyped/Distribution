package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourceMod {
  type ID = java.lang.String
  type Input[T] = T | js.Promise[T] | Output[T]
  type Inputs = stdLib.Record[java.lang.String, Input[js.Any]]
  type URN = java.lang.String
  type Unwrap[T] = UnwrapSimple[T] | UnwrapSimple[js.Any]
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/resource.Unwrap<T[P]>}
    */ atPulumiPulumiLib.atPulumiPulumiLibStrings.UnwrappedObject with T
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
