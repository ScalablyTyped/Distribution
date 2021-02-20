package typings.qlikVisualizationextensions

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.analysis_
import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.edit_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationAPI {
  
  /**
    * Navigation API for Qlik Sense. The Navigation API allows you to navigate
    * within a Qlik Sense app, and is meant to be used in visualization extensions
    * and will not work in Mashup scenarios.
    */
  @js.native
  trait INavigation extends StObject {
    
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
    implicit class INavigationMutableBuilder[Self <: INavigation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalysis(value: analysis_): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdit(value: edit_): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCurrentSheetId(value: () => NavigationResult): Self = StObject.set(x, "getCurrentSheetId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMode(value: () => String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGotoSheet(value: String => NavigationResult): Self = StObject.set(x, "gotoSheet", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGotoStory(value: String => NavigationResult): Self = StObject.set(x, "gotoStory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsModeAllowed(value: NavigationModeType => Boolean): Self = StObject.set(x, "isModeAllowed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextSheet(value: () => NavigationResult): Self = StObject.set(x, "nextSheet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevSheet(value: () => NavigationResult): Self = StObject.set(x, "prevSheet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetMode(value: String => NavigationResult): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitchMode(value: NavigationModeType => NavigationResult): Self = StObject.set(x, "switchMode", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY
  */
  trait NavigationErrorType extends StObject
  object NavigationErrorType {
    
    @scala.inline
    def NOCURRENTSHEET: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET = "NOCURRENTSHEET".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET]
    
    @scala.inline
    def NOSUCHSHEET: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET = "NOSUCHSHEET".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET]
    
    @scala.inline
    def NOSUCHSTORY: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY = "NOSUCHSTORY".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS
    - typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT
  */
  trait NavigationModeType extends StObject
  object NavigationModeType {
    
    @scala.inline
    def ANALYSIS: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS = "ANALYSIS".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS]
    
    @scala.inline
    def EDIT: typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT = "EDIT".asInstanceOf[typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT]
  }
  
  /**
    * The navigation result object.
    */
  @js.native
  trait NavigationResult extends StObject {
    
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
    implicit class NavigationResultMutableBuilder[Self <: NavigationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: NavigationErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetId(value: String): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
