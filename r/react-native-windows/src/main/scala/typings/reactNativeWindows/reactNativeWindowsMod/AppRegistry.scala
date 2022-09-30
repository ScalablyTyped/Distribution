package typings.reactNativeWindows.reactNativeWindowsMod

import typings.reactNativeWindows.rntypesMod.AppConfig
import typings.reactNativeWindows.rntypesMod.ComponentProvider
import typings.reactNativeWindows.rntypesMod.Runnable
import typings.reactNativeWindows.rntypesMod.TaskProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppRegistry {
  
  @JSImport("react-native-windows", "AppRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAppKeys(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppKeys")().asInstanceOf[js.Array[String]]
  
  inline def getRunnable(appKey: String): js.UndefOr[Runnable] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnable")(appKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Runnable]]
  
  inline def registerComponent(appKey: String, getComponentFunc: ComponentProvider): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(appKey.asInstanceOf[js.Any], getComponentFunc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def registerConfig(config: js.Array[AppConfig]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerHeadlessTask(appKey: String, task: TaskProvider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHeadlessTask")(appKey.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerRunnable(appKey: String, func: Runnable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRunnable")(appKey.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def runApplication(appKey: String, appParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runApplication")(appKey.asInstanceOf[js.Any], appParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSurfaceProps(appKey: String, appParameters: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSurfaceProps")(appKey.asInstanceOf[js.Any], appParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setSurfaceProps(appKey: String, appParameters: Any, displayMode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSurfaceProps")(appKey.asInstanceOf[js.Any], appParameters.asInstanceOf[js.Any], displayMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unmountApplicationComponentAtRootTag(rootTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountApplicationComponentAtRootTag")(rootTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
