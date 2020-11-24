package typings.qlikVisualizationextensions.NavigationAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.analysis_
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.edit_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navigation API for Qlik Sense. The Navigation API allows you to navigate
  * within a Qlik Sense app, and is meant to be used in visualization extensions
  * and will not work in Mashup scenarios.
  */
@js.native
trait INavigation extends js.Object {
  
  /**
    * Used for edit mode.
    */
  var analysis: analysis_ = js.native
  
  /**
    * Used for analysis mode.
    */
  var edit: edit_ = js.native
  
  /**
    * Gets the current sheet ID.
    * @return - A navigation result object.
    */
  def getCurrentSheetId(): NavigationResult = js.native
  
  /**
    * Gets the current mode.
    * @return - The current mode as a string.
    */
  def getMode(): String = js.native
  
  /**
    * Navigate to a given sheet in the current app.
    * The method will return before the actual navigation takes place.
    * @param sheetId - Set the sheet ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoSheet(sheetId: String): NavigationResult = js.native
  
  /**
    * Navigate to a given story in the current app.
    * The method will return before the actual navigation takes place.
    * @param storyId - Set the story ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoStory(storyId: String): NavigationResult = js.native
  
  /**
    * Checks if a given mode is allowed.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A Boolean value (true or false).
    */
  def isModeAllowed(mode: NavigationModeType): Boolean = js.native
  
  /**
    * Go to the next sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place.
    * @return - A navigation result object.
    */
  def nextSheet(): NavigationResult = js.native
  
  /**
    * Jumps to the previous sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place
    * @return - A navigation result object.
    */
  def prevSheet(): NavigationResult = js.native
  
  /**
    * Sets the current working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def setMode(mode: String): NavigationResult = js.native
  
  /**
    * Switches the working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def switchMode(mode: NavigationModeType): NavigationResult = js.native
}
object INavigation {
  
  @scala.inline
  def apply(
    analysis: analysis_,
    edit: edit_,
    getCurrentSheetId: () => NavigationResult,
    getMode: () => String,
    gotoSheet: String => NavigationResult,
    gotoStory: String => NavigationResult,
    isModeAllowed: NavigationModeType => Boolean,
    nextSheet: () => NavigationResult,
    prevSheet: () => NavigationResult,
    setMode: String => NavigationResult,
    switchMode: NavigationModeType => NavigationResult
  ): INavigation = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], getCurrentSheetId = js.Any.fromFunction0(getCurrentSheetId), getMode = js.Any.fromFunction0(getMode), gotoSheet = js.Any.fromFunction1(gotoSheet), gotoStory = js.Any.fromFunction1(gotoStory), isModeAllowed = js.Any.fromFunction1(isModeAllowed), nextSheet = js.Any.fromFunction0(nextSheet), prevSheet = js.Any.fromFunction0(prevSheet), setMode = js.Any.fromFunction1(setMode), switchMode = js.Any.fromFunction1(switchMode))
    __obj.asInstanceOf[INavigation]
  }
  
  @scala.inline
  implicit class INavigationOps[Self <: INavigation] (val x: Self) extends AnyVal {
    
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
    def setAnalysis(value: analysis_): Self = this.set("analysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: edit_): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentSheetId(value: () => NavigationResult): Self = this.set("getCurrentSheetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMode(value: () => String): Self = this.set("getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGotoSheet(value: String => NavigationResult): Self = this.set("gotoSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGotoStory(value: String => NavigationResult): Self = this.set("gotoStory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsModeAllowed(value: NavigationModeType => Boolean): Self = this.set("isModeAllowed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextSheet(value: () => NavigationResult): Self = this.set("nextSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevSheet(value: () => NavigationResult): Self = this.set("prevSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMode(value: String => NavigationResult): Self = this.set("setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchMode(value: NavigationModeType => NavigationResult): Self = this.set("switchMode", js.Any.fromFunction1(value))
  }
}
