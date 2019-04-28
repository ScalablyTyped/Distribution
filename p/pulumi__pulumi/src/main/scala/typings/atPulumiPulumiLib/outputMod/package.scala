package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outputMod {
  type Input[T] = T | js.Promise[T] | OutputInstance[T]
  type Inputs = stdLib.Record[java.lang.String, Input[js.Any]]
  type Lifted[T] = (LiftedObject[T, NonFunctionPropertyNames[T]]) | LiftedArray[js.Any] | (LiftedObject[java.lang.String, NonFunctionPropertyNames[java.lang.String]]) | js.Object
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type Output[T] = OutputInstance[T] with Lifted[T]
  type Unwrap[T] = UnwrapSimple[T] | UnwrapSimple[js.Any]
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  type primitive = js.UndefOr[js.Function | java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
