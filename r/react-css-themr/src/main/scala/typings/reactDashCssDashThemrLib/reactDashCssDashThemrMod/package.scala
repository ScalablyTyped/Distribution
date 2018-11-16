package typings
package reactDashCssDashThemrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCssDashThemrMod {
  type TMapThemrProps[P] = js.Function2[
    /* ownProps */ P, 
    /* theme */ TReactCSSThemrTheme, 
    P with reactDashCssDashThemrLib.Anon_Theme
  ]
  type ThemedComponent[P, S] = reactLib.reactMod.Component[P, S, js.Any]
}
