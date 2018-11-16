package typings
package statusesLib.statusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var codes: js.Array[scala.Double] = js.native
  var empty: ScalablyTyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  var redirect: ScalablyTyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  var retry: ScalablyTyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  def apply(code: java.lang.String): scala.Double = js.native
  def apply(code: scala.Double): scala.Double = js.native
}

