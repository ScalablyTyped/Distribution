package typings.reactDashJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJssMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.jss.jssMod.Styles
  import typings.std.Exclude
  import typings.std.Pick
  import typings.std.StyleSheet

  type Managers = NumberDictionary[StyleSheet]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type ThemedStyles[Theme] = js.Function1[/* theme */ Theme, Styles[String]]
}
