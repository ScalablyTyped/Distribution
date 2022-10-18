package typings.storybookCoreCommon

import typings.std.Set
import typings.storybookCoreCommon.anon.Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsInterpretFilesMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/interpret-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/interpret-files", "boost")
  @js.native
  val boost: Set[String] = js.native
  
  inline def getInterpretedFile(pathToFile: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpretedFile")(pathToFile.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterpretedFileWithExt(pathToFile: String): Ext = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpretedFileWithExt")(pathToFile.asInstanceOf[js.Any]).asInstanceOf[Ext]
}
