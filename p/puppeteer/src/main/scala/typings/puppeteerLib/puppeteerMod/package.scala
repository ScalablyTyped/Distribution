package typings
package puppeteerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object puppeteerMod {
  type EvaluateFn = java.lang.String | (js.Function1[/* repeated */ js.Any, js.Any])
  type EvaluateFnReturnType[T /* <: EvaluateFn */] = js.Any
  type Headers = stdLib.Record[java.lang.String, java.lang.String]
  type LayoutDimension = java.lang.String | scala.Double
  type Serializable = _Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  type SerializableOrJSHandle = _SerializableOrJSHandle | scala.Double | java.lang.String | scala.Boolean | scala.Null
  type UnwrapElementHandle[X] = X
  type WrapElementHandle[X] = X | ElementHandle[X]
}
