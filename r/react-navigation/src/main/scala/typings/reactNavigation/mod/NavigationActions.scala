package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typings.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationActions {
  
  @JSImport("react-navigation", "NavigationActions.BACK")
  @js.native
  val BACK_ : NavigationSlashBACK = js.native
  
  @JSImport("react-navigation", "NavigationActions.INIT")
  @js.native
  val INIT_ : NavigationSlashINIT = js.native
  
  @JSImport("react-navigation", "NavigationActions.NAVIGATE")
  @js.native
  val NAVIGATE_ : NavigationSlashNAVIGATE = js.native
  
  @JSImport("react-navigation", "NavigationActions.SET_PARAMS")
  @js.native
  val SET_PARAMS: NavigationSlashSET_PARAMS = js.native
  
  @JSImport("react-navigation", "NavigationActions.back")
  @js.native
  def back(): NavigationBackAction = js.native
  @JSImport("react-navigation", "NavigationActions.back")
  @js.native
  def back(options: NavigationBackActionPayload): NavigationBackAction = js.native
  
  @JSImport("react-navigation", "NavigationActions.init")
  @js.native
  def init(): NavigationInitAction = js.native
  @JSImport("react-navigation", "NavigationActions.init")
  @js.native
  def init(options: NavigationInitActionPayload): NavigationInitAction = js.native
  
  @JSImport("react-navigation", "NavigationActions.navigate")
  @js.native
  def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  
  @JSImport("react-navigation", "NavigationActions.setParams")
  @js.native
  def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = js.native
}
