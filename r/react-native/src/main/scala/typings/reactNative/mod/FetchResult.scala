package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultFailed
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNewData
import typings.reactNative.reactNativeStrings.UIBackgroundFetchResultNoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchResult extends js.Object {
  
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
  implicit class FetchResultOps[Self <: FetchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewData(value: UIBackgroundFetchResultNewData): Self = this.set("NewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoData(value: UIBackgroundFetchResultNoData): Self = this.set("NoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFailed(value: UIBackgroundFetchResultFailed): Self = this.set("ResultFailed", value.asInstanceOf[js.Any])
  }
}
