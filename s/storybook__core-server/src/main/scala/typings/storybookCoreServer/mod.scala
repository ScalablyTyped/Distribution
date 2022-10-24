package typings.storybookCoreServer

import typings.std.Record
import typings.storybookCoreCommon.distTs3Dot9TypesMod.BuilderOptions
import typings.storybookCoreCommon.distTs3Dot9TypesMod.CLIOptions
import typings.storybookCoreCommon.distTs3Dot9TypesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildDev(loadOptions: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDev")(loadOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def buildDevStandalone(options: CLIOptions & LoadOptions & BuilderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDevStandalone")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def buildStatic(param0: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStatic")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def buildStaticStandalone(options: CLIOptions & LoadOptions & BuilderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStaticStandalone")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getManagerHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getManagerHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getManagerMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getManagerMainTemplate")().asInstanceOf[String]
  
  inline def getPreviewBodyTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewBodyTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewHeadTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewMainTemplate")().asInstanceOf[String]
}
