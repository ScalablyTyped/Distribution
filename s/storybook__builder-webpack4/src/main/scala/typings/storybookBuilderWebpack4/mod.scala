package typings.storybookBuilderWebpack4

import typings.std.Partial
import typings.storybookBuilderWebpack4.anon.FnCall
import typings.storybookCoreCommon.distTs3Dot9TypesMod.Builder
import typings.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typings.webpack.mod.Configuration
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/builder-webpack4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bail(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bail")().asInstanceOf[js.Promise[Unit]]
  inline def bail(e: js.Error): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bail")(e.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def build(options: BuilderStartOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  @JSImport("@storybook/builder-webpack4", "corePresets")
  @js.native
  val corePresets: js.Array[String] = js.native
  
  object executor {
    
    @JSImport("@storybook/builder-webpack4", "executor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(options: Options): js.Promise[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FnCall]]
  }
  
  @JSImport("@storybook/builder-webpack4", "getConfig")
  @js.native
  val getConfig: js.Function1[
    /* options */ typings.storybookCoreCommon.distTs3Dot9TypesMod.Options, 
    js.Promise[Configuration]
  ] = js.native
  
  inline def makeStatsFromError(err: String): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStatsFromError")(err.asInstanceOf[js.Any]).asInstanceOf[Stats]
  
  @JSImport("@storybook/builder-webpack4", "overridePresets")
  @js.native
  val overridePresets: js.Array[String] = js.native
  
  inline def start(options: BuilderStartOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  type BuilderStartOptions = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(args : @storybook/core-common.anon.Router): std.Promise<void | @storybook/core-common.anon.Bail<webpack.webpack.Stats>>>['0'] */ js.Any
  ]
  
  type WebpackBuilder = Builder[Configuration, Stats]
}
