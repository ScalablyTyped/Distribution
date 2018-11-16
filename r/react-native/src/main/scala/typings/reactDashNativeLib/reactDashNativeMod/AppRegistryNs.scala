package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "AppRegistry")
@js.native
object AppRegistryNs extends js.Object {
  def getAppKeys(): js.Array[java.lang.String] = js.native
  def getRunnable(appKey: java.lang.String): js.UndefOr[reactDashNativeLib.reactDashNativeMod.Runnable] = js.native
  def registerComponent(
    appKey: java.lang.String,
    getComponentFunc: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): java.lang.String = js.native
  def registerConfig(config: js.Array[reactDashNativeLib.reactDashNativeMod.AppConfig]): scala.Unit = js.native
  def registerHeadlessTask(appKey: java.lang.String, task: reactDashNativeLib.TaskProvider): scala.Unit = js.native
  def registerRunnable(appKey: java.lang.String, func: reactDashNativeLib.reactDashNativeMod.Runnable): java.lang.String = js.native
  def runApplication(appKey: java.lang.String, appParameters: js.Any): scala.Unit = js.native
  def unmountApplicationComponentAtRootTag(rootTag: scala.Double): scala.Unit = js.native
}

