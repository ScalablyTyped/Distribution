package typings.snyk

import typings.snyk.distLibTypesMod.MonitorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersFormatMonitorResponseMod {
  
  @JSImport("snyk/dist/lib/formatters/format-monitor-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatErrorMonitorOutput(packageManager: Any, res: MonitorResult, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatErrorMonitorOutput(packageManager: Any, res: MonitorResult, options: Any, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatErrorMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonitorOutput(packageManager: Any, res: MonitorResult, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(packageManager: Any, res: MonitorResult, options: Any, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(
    packageManager: Any,
    res: MonitorResult,
    options: Any,
    projectName: String,
    foundProjectCount: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatMonitorOutput(
    packageManager: Any,
    res: MonitorResult,
    options: Any,
    projectName: Unit,
    foundProjectCount: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonitorOutput")(packageManager.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
}
