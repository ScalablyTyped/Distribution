package typings.storybookCoreCommon

import typings.express.mod.Router
import typings.storybookCoreCommon.anon.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressReportingMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/progress-reporting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useProgressReporting(router: Router, startTime: js.Tuple2[Double, Double], options: Any): js.Promise[Handler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useProgressReporting")(router.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Handler]]
}
