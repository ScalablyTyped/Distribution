package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResult extends js.Object {
  var NewData: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultNewData
  var NoData: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultNoData
  var ResultFailed: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultFailed
}

object FetchResult {
  @scala.inline
  def apply(
    NewData: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultNewData,
    NoData: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultNoData,
    ResultFailed: reactDashNativeLib.reactDashNativeLibStrings.UIBackgroundFetchResultFailed
  ): FetchResult = {
    val __obj = js.Dynamic.literal(NewData = NewData, NoData = NoData, ResultFailed = ResultFailed)
  
    __obj.asInstanceOf[FetchResult]
  }
}

