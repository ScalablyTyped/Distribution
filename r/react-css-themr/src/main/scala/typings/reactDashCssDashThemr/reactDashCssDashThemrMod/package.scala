package typings.reactDashCssDashThemr

import typings.react.reactMod.Component
import typings.reactDashCssDashThemr.Anon_Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCssDashThemrMod {
  type TMapThemrProps[P] = js.Function2[/* ownProps */ P, /* theme */ TReactCSSThemrTheme, P with Anon_Theme]
  type ThemedComponent[P, S] = Component[P, S, js.Any]
}
