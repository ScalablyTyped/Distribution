package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsInterpretRequireMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/interpret-require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serverRequire(filePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serverRequire")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def serverRequire(filePath: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serverRequire")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def serverResolve(filePath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("serverResolve")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def serverResolve(filePath: js.Array[String]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("serverResolve")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
