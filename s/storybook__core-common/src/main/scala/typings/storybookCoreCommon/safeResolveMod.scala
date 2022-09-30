package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeResolveMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/safeResolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safeResolve(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeResolve")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeResolveFrom(path: String, file: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeResolveFrom")(path.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[String]
}
