package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setstatic
@JSImport("recompose/setStatic", JSImport.Namespace)
@js.native
object setStaticMod extends js.Object {
  def default(key: java.lang.String, value: js.Any): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
}

