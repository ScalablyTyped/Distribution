package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EvaluateFn[T] = java.lang.String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  type EvaluateFnReturnType[T /* <: typings.puppeteer.mod.EvaluateFn[_] */] = js.Any
  type Headers = typings.std.Record[java.lang.String, java.lang.String]
  type LayoutDimension = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typings.puppeteer.mod.JSONArray
    - typings.puppeteer.mod.JSONObject
  */
  type Serializable = typings.puppeteer.mod._Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  type SerializableOrJSHandle = typings.puppeteer.mod.Serializable | typings.puppeteer.mod.JSHandle[js.Any]
  type UnwrapElementHandle[X] = X
  type WrapElementHandle[X] = X | typings.puppeteer.mod.ElementHandle[X]
}
