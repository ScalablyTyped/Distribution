package typings.reactDocgenTypescript

import typings.reactDocgenTypescript.reactDocgenTypescriptStrings.posix
import typings.reactDocgenTypescript.reactDocgenTypescriptStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTrimFileNameMod {
  
  @JSImport("react-docgen-typescript/lib/trimFileName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trimFileName(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trimFileName(fileName: String, cwd: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimFileName")(fileName.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def trimFileName(fileName: String, cwd: String, platform: posix | win32): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimFileName")(fileName.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def trimFileName(fileName: String, cwd: Unit, platform: posix | win32): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimFileName")(fileName.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[String]
}
