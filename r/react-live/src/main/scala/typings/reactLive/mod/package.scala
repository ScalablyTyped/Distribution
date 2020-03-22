package typings.reactLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // React Element Props
  type DivProps = typings.react.mod.HTMLProps[typings.std.HTMLDivElement]
  // Helper types
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PreProps = typings.react.mod.HTMLProps[typings.std.HTMLPreElement]
}
