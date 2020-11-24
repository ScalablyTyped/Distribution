package typings.reactJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetProps[C] = js.Any
  
  type Managers = org.scalablytyped.runtime.NumberDictionary[typings.std.StyleSheet]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: typings.jss.mod.Styles[java.lang.String] | (js.Function1[/* theme */ js.Any, typings.jss.mod.Styles[java.lang.String]]) */] = typings.reactJss.mod.WithStylesProps[S]
}
