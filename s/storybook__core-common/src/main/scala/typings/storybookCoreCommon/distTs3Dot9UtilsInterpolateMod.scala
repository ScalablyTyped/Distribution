package typings.storybookCoreCommon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsInterpolateMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/interpolate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolate(template: String, bindings: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(template.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[String]
}
