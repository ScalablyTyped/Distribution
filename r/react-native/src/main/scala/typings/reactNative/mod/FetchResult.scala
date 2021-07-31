package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultFailed
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNewData
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNoData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResult extends StObject {
  
  var NewData: UIBackgroundFetchResultNewData
  
  var NoData: UIBackgroundFetchResultNoData
  
  var ResultFailed: UIBackgroundFetchResultFailed
}
object FetchResult {
  
  @scala.inline
  def apply(): FetchResult = {
    val __obj = js.Dynamic.literal(NewData = "UIBackgroundFetchResultNewData", NoData = "UIBackgroundFetchResultNoData", ResultFailed = "UIBackgroundFetchResultFailed")
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
