package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStorybookConfigurationMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/get-storybook-configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStorybookConfiguration(storybookScript: String, shortName: String, longName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookConfiguration")(storybookScript.asInstanceOf[js.Any], shortName.asInstanceOf[js.Any], longName.asInstanceOf[js.Any])).asInstanceOf[String]
}
