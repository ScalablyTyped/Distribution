package typings.reactRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type WithRouterProps[C /* <: typings.react.mod.ComponentType[_] */] = js.Object | typings.reactRouter.AnonWrappedComponentRef[C]
}
