package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readTemplateMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/readTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readTemplate(filename: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTemplate")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
