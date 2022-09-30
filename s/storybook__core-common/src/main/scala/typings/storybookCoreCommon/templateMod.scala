package typings.storybookCoreCommon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getManagerHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getManagerHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getManagerMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getManagerMainTemplate")().asInstanceOf[String]
  
  inline def getPreviewBodyTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewBodyTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewHeadTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewMainTemplate")().asInstanceOf[String]
}
