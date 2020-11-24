package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "AppRegistry")
@js.native
object AppRegistry extends js.Object {
  
  def getAppKeys(): js.Array[String] = js.native
  
  def getRunnable(appKey: String): js.UndefOr[Runnable] = js.native
  
  def registerComponent(appKey: String, getComponentFunc: ComponentProvider): String = js.native
  
  def registerConfig(config: js.Array[AppConfig]): Unit = js.native
  
  def registerHeadlessTask(appKey: String, task: TaskProvider): Unit = js.native
  
  def registerRunnable(appKey: String, func: Runnable): String = js.native
  
  def runApplication(appKey: String, appParameters: js.Any): Unit = js.native
  
  def unmountApplicationComponentAtRootTag(rootTag: Double): Unit = js.native
}
