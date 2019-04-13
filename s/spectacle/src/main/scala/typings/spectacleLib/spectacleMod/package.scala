package typings
package spectacleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectacleMod {
  /**
    * All available DOM style properties and their types
    * https://www.npmjs.com/package/csstype
    */
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type FitProps = FillProps
  type Theme = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
}
