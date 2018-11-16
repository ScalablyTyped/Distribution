package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FetchProps[T] extends FetchRequestProps {
  var children: js.UndefOr[
    js.Function1[/* renderProps */ RenderProps[T], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
}

