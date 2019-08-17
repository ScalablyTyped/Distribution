package typings.spectacle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectacleMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.csstype.csstypeMod.Properties

  /**
    * All available DOM style properties and their types
    * https://www.npmjs.com/package/csstype
    */
  type CSSProperties = Properties[String | Double]
  type FitProps = FillProps
  type Theme = StringDictionary[Double | String]
}
