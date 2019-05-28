package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BannerPlugin extends js.Object {
  /**
    * Plugins
    */
  var BannerPlugin: org.scalablytyped.runtime.Instantiable1[/* options */ java.lang.String, webpackLib.webpackMod.BannerPlugin] = js.native
  val BannerPluginNs: js.Any = js.native
  var Compiler: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.Compiler] = js.native
  val CompilerNs: TypeofCompiler = js.native
  var ContextReplacementPlugin: org.scalablytyped.runtime.Instantiable1[/* resourceRegExp */ js.Any, webpackLib.webpackMod.ContextReplacementPlugin] = js.native
  var DefinePlugin: org.scalablytyped.runtime.Instantiable1[
    /* definitions */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    webpackLib.webpackMod.DefinePlugin
  ] = js.native
  var DllPlugin: org.scalablytyped.runtime.Instantiable1[
    /* options */ webpackLib.webpackMod.DllPluginNs.Options, 
    webpackLib.webpackMod.DllPlugin
  ] = js.native
  val DllPluginNs: js.Any = js.native
  var DllReferencePlugin: org.scalablytyped.runtime.Instantiable1[
    /* options */ webpackLib.webpackMod.DllReferencePluginNs.Options, 
    webpackLib.webpackMod.DllReferencePlugin
  ] = js.native
  val DllReferencePluginNs: js.Any = js.native
  var EnvironmentPlugin: org.scalablytyped.runtime.Instantiable1[/* envs */ js.Array[java.lang.String], webpackLib.webpackMod.EnvironmentPlugin] = js.native
  var EvalSourceMapDevToolPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.EvalSourceMapDevToolPlugin] = js.native
  val EvalSourceMapDevToolPluginNs: js.Any = js.native
  var ExtendedAPIPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.ExtendedAPIPlugin] = js.native
  var HashedModuleIdsPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.HashedModuleIdsPlugin] = js.native
  var HotModuleReplacementPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.HotModuleReplacementPlugin] = js.native
  val ICompilerNs: js.Any = js.native
  var IgnorePlugin: org.scalablytyped.runtime.Instantiable1[/* requestRegExp */ js.Any, webpackLib.webpackMod.IgnorePlugin] = js.native
  var LoaderOptionsPlugin: org.scalablytyped.runtime.Instantiable1[/* options */ js.Any, webpackLib.webpackMod.LoaderOptionsPlugin] = js.native
  var MultiCompiler: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.MultiCompiler] = js.native
  val MultiCompilerNs: js.Any = js.native
  var MultiWatching: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.MultiWatching] = js.native
  var NamedChunksPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.NamedChunksPlugin] = js.native
  /** @deprecated use config.optimization.namedModules */
  var NamedModulesPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.NamedModulesPlugin] = js.native
  /** @deprecated use config.optimization.noEmitOnErrors */
  var NoEmitOnErrorsPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.NoEmitOnErrorsPlugin] = js.native
  var NormalModuleReplacementPlugin: org.scalablytyped.runtime.Instantiable2[
    /* resourceRegExp */ js.Any, 
    /* newResource */ js.Any, 
    webpackLib.webpackMod.NormalModuleReplacementPlugin
  ] = js.native
  val OptionsNs: js.Any = js.native
  var Plugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.Plugin] = js.native
  var PrefetchPlugin: org.scalablytyped.runtime.Instantiable2[/* context */ js.Any, /* request */ js.Any, webpackLib.webpackMod.PrefetchPlugin] = js.native
  var ProgressPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.ProgressPlugin] = js.native
  var ProvidePlugin: org.scalablytyped.runtime.Instantiable1[
    /* definitions */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    webpackLib.webpackMod.ProvidePlugin
  ] = js.native
  var ResolvePlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.ResolvePlugin] = js.native
  var SingleEntryPlugin: org.scalablytyped.runtime.Instantiable3[
    /* context */ java.lang.String, 
    /* entry */ java.lang.String, 
    /* name */ java.lang.String, 
    webpackLib.webpackMod.SingleEntryPlugin
  ] = js.native
  var SourceMapDevToolPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.SourceMapDevToolPlugin] = js.native
  val SourceMapDevToolPluginNs: js.Any = js.native
  var SplitChunksPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.SplitChunksPlugin] = js.native
  var Stats: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.Stats] = js.native
  val StatsNs: js.Any = js.native
  var WatchIgnorePlugin: org.scalablytyped.runtime.Instantiable1[
    /* paths */ js.Array[java.lang.String | stdLib.RegExp], 
    webpackLib.webpackMod.WatchIgnorePlugin
  ] = js.native
  val compilationNs: Typeofcompilation = js.native
  /** @deprecated */
  val compilerNs: js.Any = js.native
  val debugNs: Typeofdebug = js.native
  val dependenciesNs: js.Any = js.native
  val loaderNs: js.Any = js.native
  val optimizeNs: Typeofoptimize = js.native
  /** Webpack package version. */
  val version: js.UndefOr[java.lang.String] = js.native
  def apply(): webpackLib.webpackMod.Compiler = js.native
  def apply(options: js.Array[webpackLib.webpackMod.Configuration]): webpackLib.webpackMod.MultiCompiler = js.native
  def apply(
    options: js.Array[webpackLib.webpackMod.Configuration],
    handler: webpackLib.webpackMod.MultiCompilerNs.Handler
  ): webpackLib.webpackMod.MultiWatching | webpackLib.webpackMod.MultiCompiler = js.native
  def apply(options: webpackLib.webpackMod.Configuration): webpackLib.webpackMod.Compiler = js.native
  def apply(options: webpackLib.webpackMod.Configuration, handler: webpackLib.webpackMod.CompilerNs.Handler): webpackLib.webpackMod.CompilerNs.Watching | webpackLib.webpackMod.Compiler = js.native
}

