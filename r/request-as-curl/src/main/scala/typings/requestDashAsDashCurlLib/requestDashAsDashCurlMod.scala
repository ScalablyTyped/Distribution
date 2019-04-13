package typings
package requestDashAsDashCurlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-as-curl", JSImport.Namespace)
@js.native
object requestDashAsDashCurlMod extends js.Object {
  def apply(
    request: requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      requestLib.requestMod.CoreOptions, 
      requestLib.requestMod.RequiredUriUrl
    ]
  ): java.lang.String = js.native
  def apply(
    request: requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      requestLib.requestMod.CoreOptions, 
      requestLib.requestMod.RequiredUriUrl
    ],
    body: js.Any
  ): java.lang.String = js.native
  def serialize(
    request: requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      requestLib.requestMod.CoreOptions, 
      requestLib.requestMod.RequiredUriUrl
    ]
  ): java.lang.String = js.native
}

