package typings.qlikVisualizationextensions.NavigationAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The navigation result object.
  */
@js.native
trait NavigationResult extends js.Object {
  
  /**
    * Error code. Can be: NOSUCHSHEET   |   NOCURRENTSHEET   |   NOSUCHSTORY
    */
  var error: NavigationErrorType = js.native
  
  /**
    * Error message, for example 'No current sheet'.
    */
  var errorMsg: String = js.native
  
  /**
    * The new mode.
    */
  var mode: String = js.native
  
  /**
    * The new sheet ID.
    */
  var sheetId: String = js.native
  
  /**
    * The new story ID.
    */
  var storyId: String = js.native
  
  /**
    * Returns true if successful.
    */
  var success: Boolean = js.native
}
object NavigationResult {
  
  @scala.inline
  def apply(
    error: NavigationErrorType,
    errorMsg: String,
    mode: String,
    sheetId: String,
    storyId: String,
    success: Boolean
  ): NavigationResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
  
  @scala.inline
  implicit class NavigationResultOps[Self <: NavigationResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: NavigationErrorType): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMsg(value: String): Self = this.set("errorMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetId(value: String): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
