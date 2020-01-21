package typings.reactCssThemr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TMapThemrProps[P] = js.Function2[
    /* ownProps */ P, 
    /* theme */ typings.reactCssThemr.mod.TReactCSSThemrTheme, 
    P with typings.reactCssThemr.AnonTheme
  ]
  type ThemedComponent[P, S] = typings.react.mod.Component[P, S, js.Any]
}
