package typings.reactDashCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsLinkMod {
  import typings.react.reactMod.Component
  import typings.std.Exclude
  import typings.std.Pick

  type Link = Component[LinkProps, js.Object, js.Any]
  // tslint:disable-next-line strict-export-declare-modifiers
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
