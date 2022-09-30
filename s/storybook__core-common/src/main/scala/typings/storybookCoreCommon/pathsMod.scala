package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectRoot")().asInstanceOf[String]
  
  inline def nodePathsToArray(nodePath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodePathsToArray")(nodePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def normalizeStoryPath(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStoryPath")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
}
