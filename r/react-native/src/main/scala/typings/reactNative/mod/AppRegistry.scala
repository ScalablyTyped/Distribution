package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppRegistry {
  
  @JSImport("react-native", "AppRegistry.getAppKeys")
  @js.native
  def getAppKeys(): js.Array[String] = js.native
  
  @JSImport("react-native", "AppRegistry.getRunnable")
  @js.native
  def getRunnable(appKey: String): js.UndefOr[Runnable] = js.native
  
  @JSImport("react-native", "AppRegistry.registerComponent")
  @js.native
  def registerComponent(appKey: String, getComponentFunc: ComponentProvider): String = js.native
  
  @JSImport("react-native", "AppRegistry.registerConfig")
  @js.native
  def registerConfig(config: js.Array[AppConfig]): Unit = js.native
  
  @JSImport("react-native", "AppRegistry.registerHeadlessTask")
  @js.native
  def registerHeadlessTask(appKey: String, task: TaskProvider): Unit = js.native
  
  @JSImport("react-native", "AppRegistry.registerRunnable")
  @js.native
  def registerRunnable(appKey: String, func: Runnable): String = js.native
  
  @JSImport("react-native", "AppRegistry.runApplication")
  @js.native
  def runApplication(appKey: String, appParameters: js.Any): Unit = js.native
  
  @JSImport("react-native", "AppRegistry.unmountApplicationComponentAtRootTag")
  @js.native
  def unmountApplicationComponentAtRootTag(rootTag: Double): Unit = js.native
}
