package typings
package reactDashGeosuggestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashGeosuggestMod {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: react-geosuggest.Anon_X<T, K>[keyof T] */ js.Any
  ]
  type QueryType = reactDashGeosuggestLib.reactDashGeosuggestLibStrings.address | reactDashGeosuggestLib.reactDashGeosuggestLibStrings.establishment | reactDashGeosuggestLib.reactDashGeosuggestLibStrings.geocode | reactDashGeosuggestLib.reactDashGeosuggestLibStrings.`(cities)` | reactDashGeosuggestLib.reactDashGeosuggestLibStrings.`(regions)`
}
