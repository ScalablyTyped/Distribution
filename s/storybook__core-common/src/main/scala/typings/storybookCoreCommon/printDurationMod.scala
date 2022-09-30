package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printDurationMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/print-duration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printDuration(startTime: js.Tuple2[Double, Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printDuration")(startTime.asInstanceOf[js.Any]).asInstanceOf[String]
}
