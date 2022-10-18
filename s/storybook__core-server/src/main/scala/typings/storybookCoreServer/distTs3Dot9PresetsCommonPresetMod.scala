package typings.storybookCoreServer

import typings.std.Record
import typings.storybookCoreCommon.anon.ArgTypeTargetsV7
import typings.storybookCoreCommon.distTs3Dot9TypesMod.CoreConfig
import typings.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typings.storybookCoreServer.anon.Check
import typings.storybookCoreServer.anon.Modern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PresetsCommonPresetMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/presets/common-preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def babel(_underscore: Any, options: Options): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("babel")(_underscore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def config(base: Any, options: Options): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("config")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def core(existing: CoreConfig, options: Options): js.Promise[CoreConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("core")(existing.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CoreConfig]]
  
  inline def env(): js.Promise[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("env")().asInstanceOf[js.Promise[Record[String, String]]]
  
  inline def features(): js.Promise[js.UndefOr[ArgTypeTargetsV7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[js.Promise[js.UndefOr[ArgTypeTargetsV7]]]
  inline def features(existing: ArgTypeTargetsV7): js.Promise[js.UndefOr[ArgTypeTargetsV7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("features")(existing.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ArgTypeTargetsV7]]]
  
  inline def logLevel(previous: Any, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("logLevel")(previous.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def managerMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("managerMainTemplate")().asInstanceOf[String]
  
  inline def previewBody(base: Any, hasConfigDirPresets: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("previewBody")(base.asInstanceOf[js.Any], hasConfigDirPresets.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def previewEntries(entries: js.Array[Any], options: Modern): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("previewEntries")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def previewHead(base: Any, hasConfigDirPresets: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("previewHead")(base.asInstanceOf[js.Any], hasConfigDirPresets.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def previewMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("previewMainTemplate")().asInstanceOf[String]
  
  inline def typescript(): Check = ^.asInstanceOf[js.Dynamic].applyDynamic("typescript")().asInstanceOf[Check]
}
