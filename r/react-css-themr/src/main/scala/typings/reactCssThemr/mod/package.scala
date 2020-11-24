package typings.reactCssThemr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TMapThemrProps[P] = js.Function2[
    /* ownProps */ P, 
    /* theme */ typings.reactCssThemr.mod.TReactCSSThemrTheme, 
    P with typings.reactCssThemr.anon.Theme
  ]
  
  type ThemedComponent[P, S] = typings.react.mod.Component[P, S, js.Any]
}
