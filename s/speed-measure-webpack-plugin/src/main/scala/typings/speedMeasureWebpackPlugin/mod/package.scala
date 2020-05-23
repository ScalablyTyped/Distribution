package typings.speedMeasureWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.json
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.human
    - typings.speedMeasureWebpackPlugin.speedMeasureWebpackPluginStrings.humanVerbose
    - js.Function1[/ * json * / js.Any, java.lang.String]
  */
  type OutputFormat = typings.speedMeasureWebpackPlugin.mod._OutputFormat | (js.Function1[/* json */ js.Any, java.lang.String])
  type OutputTarget = java.lang.String | (js.Function2[/* output */ java.lang.String, /* repeated */ js.Any, scala.Unit])
}
