package typings
package reactDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRouterMod {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type WithRouterProps[C /* <: reactLib.reactMod.ComponentType[_] */] = js.Object | reactDashRouterLib.Anon_WrappedComponentRef[C]
}
