package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-analytics-bridge/dist/models/Custom", JSImport.Namespace)
@js.native
object customMod extends js.Object {
  type CustomDimensionsByField = StringDictionary[Double | String | Boolean]
  type CustomDimensionsByIndex = NumberDictionary[Double | String | Boolean]
  type CustomDimensionsFieldIndexMap = StringDictionary[Double]
  type CustomMetrics = NumberDictionary[Double]
}

