package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object puppeteerMod {
  import typings.std.Record

  type EvaluateFn = String | (js.Function1[/* repeated */ js.Any, js.Any])
  type EvaluateFnReturnType[T /* <: EvaluateFn */] = js.Any
  type Headers = Record[String, String]
  type LayoutDimension = String | Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typings.puppeteer.puppeteerMod.JSONArray
    - typings.puppeteer.puppeteerMod.JSONObject
  */
  type Serializable = _Serializable | Double | String | Boolean | Null
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteer.puppeteerMod.Serializable
    - typings.puppeteer.puppeteerMod.JSHandle
  */
  type SerializableOrJSHandle = _SerializableOrJSHandle | Double | String | Boolean | Null
  type UnwrapElementHandle[X] = X
  type WrapElementHandle[X] = X | ElementHandle[X]
}
