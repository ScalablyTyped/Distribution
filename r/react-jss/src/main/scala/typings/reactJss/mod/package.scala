package typings.reactJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Managers = org.scalablytyped.runtime.NumberDictionary[typings.std.StyleSheet]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: typings.jss.mod.Styles[java.lang.String] | (js.Function1[/* theme */ js.Any, typings.jss.mod.Styles[java.lang.String]]) */] = typings.reactJss.mod.WithStylesProps[S]
}
