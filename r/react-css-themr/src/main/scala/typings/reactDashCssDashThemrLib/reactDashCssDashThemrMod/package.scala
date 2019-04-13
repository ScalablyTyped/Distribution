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
  type TReactCSSThemrTheme = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-css-themr.react-css-themr.TReactCSSThemrTheme */ js.Object)
  ]
  type ThemedComponent[P, S] = reactLib.reactMod.Component[P, S, js.Any]
}
