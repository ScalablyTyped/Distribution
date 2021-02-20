package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultFailed
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNewData
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNoData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchResult extends StObject {
  
  var NewData: UIBackgroundFetchResultNewData = js.native
  
  var NoData: UIBackgroundFetchResultNoData = js.native
  
  var ResultFailed: UIBackgroundFetchResultFailed = js.native
}
object FetchResult {
  
  @scala.inline
  def apply(
    NewData: UIBackgroundFetchResultNewData,
    NoData: UIBackgroundFetchResultNoData,
    ResultFailed: UIBackgroundFetchResultFailed
  ): FetchResult = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], NoData = NoData.asInstanceOf[js.Any], ResultFailed = ResultFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResult]
  }
  
  @scala.inline
  implicit class FetchResultMutableBuilder[Self <: FetchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewData(value: UIBackgroundFetchResultNewData): Self = StObject.set(x, "NewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoData(value: UIBackgroundFetchResultNoData): Self = StObject.set(x, "NoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFailed(value: UIBackgroundFetchResultFailed): Self = StObject.set(x, "ResultFailed", value.asInstanceOf[js.Any])
  }
}
