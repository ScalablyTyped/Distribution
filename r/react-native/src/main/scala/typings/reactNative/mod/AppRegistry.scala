package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppRegistry {
  
  @JSImport("react-native", "AppRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAppKeys(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppKeys")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getRunnable(appKey: String): js.UndefOr[Runnable] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnable")(appKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Runnable]]
  
  @scala.inline
  def registerComponent(appKey: String, getComponentFunc: ComponentProvider): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(appKey.asInstanceOf[js.Any], getComponentFunc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def registerConfig(config: js.Array[AppConfig]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerHeadlessTask(appKey: String, task: TaskProvider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHeadlessTask")(appKey.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerRunnable(appKey: String, func: Runnable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRunnable")(appKey.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def runApplication(appKey: String, appParameters: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runApplication")(appKey.asInstanceOf[js.Any], appParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unmountApplicationComponentAtRootTag(rootTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountApplicationComponentAtRootTag")(rootTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
