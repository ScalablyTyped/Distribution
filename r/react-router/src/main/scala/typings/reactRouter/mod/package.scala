package typings.reactRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type WithRouterProps[C /* <: typings.react.mod.ComponentType[_] */] = js.Object | typings.reactRouter.AnonWrappedComponentRef[C]
}
