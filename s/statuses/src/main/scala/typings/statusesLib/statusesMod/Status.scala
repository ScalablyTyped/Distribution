package typings
package statusesLib.statusesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var STATUS_CODES: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = js.native
  var codes: js.Array[scala.Double] = js.native
  var empty: org.scalablytyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  var redirect: org.scalablytyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  var retry: org.scalablytyped.runtime.NumberDictionary[js.UndefOr[scala.Boolean]] = js.native
  def apply(code: java.lang.String): scala.Double = js.native
  def apply(code: scala.Double): scala.Double = js.native
}

