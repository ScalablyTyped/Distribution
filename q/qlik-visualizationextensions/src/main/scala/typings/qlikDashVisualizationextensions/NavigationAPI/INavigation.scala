package typings.qlikDashVisualizationextensions.NavigationAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.analysis
import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation API for Qlik Sense. The Navigation API allows you to navigate
  * within a Qlik Sense app, and is meant to be used in visualization extensions
  * and will not work in Mashup scenarios.
  */
trait INavigation extends js.Object {
  /**
    * Used for edit mode.
    */
  var analysis: typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.analysis
  /**
    * Used for analysis mode.
    */
  var edit: typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.edit
  /**
    * Gets the current sheet ID.
    * @return - A navigation result object.
    */
  def getCurrentSheetId(): NavigationResult
  /**
    * Gets the current mode.
    * @return - The current mode as a string.
    */
  def getMode(): String
  /**
    * Navigate to a given sheet in the current app.
    * The method will return before the actual navigation takes place.
    * @param sheetId - Set the sheet ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoSheet(sheetId: String): NavigationResult
  /**
    * Navigate to a given story in the current app.
    * The method will return before the actual navigation takes place.
    * @param storyId - Set the story ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoStory(storyId: String): NavigationResult
  /**
    * Checks if a given mode is allowed.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A Boolean value (true or false).
    */
  def isModeAllowed(mode: NavigationModeType): Boolean
  /**
    * Go to the next sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place.
    * @return - A navigation result object.
    */
  def nextSheet(): NavigationResult
  /**
    * Jumps to the previous sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place
    * @return - A navigation result object.
    */
  def prevSheet(): NavigationResult
  /**
    * Sets the current working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def setMode(mode: String): NavigationResult
  /**
    * Switches the working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def switchMode(mode: NavigationModeType): NavigationResult
}

object INavigation {
  @scala.inline
  def apply(
    analysis: analysis,
    edit: edit,
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
    val __obj = js.Dynamic.literal(analysis = analysis, edit = edit, getCurrentSheetId = js.Any.fromFunction0(getCurrentSheetId), getMode = js.Any.fromFunction0(getMode), gotoSheet = js.Any.fromFunction1(gotoSheet), gotoStory = js.Any.fromFunction1(gotoStory), isModeAllowed = js.Any.fromFunction1(isModeAllowed), nextSheet = js.Any.fromFunction0(nextSheet), prevSheet = js.Any.fromFunction0(prevSheet), setMode = js.Any.fromFunction1(setMode), switchMode = js.Any.fromFunction1(switchMode))
  
    __obj.asInstanceOf[INavigation]
  }
}

