package typings.rollupPluginBabel

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.InputSourceMap
import typings.babelCore.mod.MatchPattern
import typings.babelCore.mod.MatchPatternContext
import typings.babelCore.mod.PartialConfig
import typings.babelCore.mod.PluginItem
import typings.babelCore.mod.TransformCaller
import typings.babelCore.mod.TransformOptions
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelParser.mod.ParserOptions
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import typings.rollup.mod.Plugin
import typings.rollup.mod.PluginContext
import typings.rollup.mod.TransformPluginContext
import typings.rollupPluginBabel.anon.CustomOptions
import typings.rollupPluginBabel.anon.PluginOptions
import typings.rollupPluginBabel.anon.TypeofbabelCore
import typings.rollupPluginBabel.rollupPluginBabelStrings.`inline`
import typings.rollupPluginBabel.rollupPluginBabelStrings.`upward-optional`
import typings.rollupPluginBabel.rollupPluginBabelStrings.auto
import typings.rollupPluginBabel.rollupPluginBabelStrings.both
import typings.rollupPluginBabel.rollupPluginBabelStrings.bundled
import typings.rollupPluginBabel.rollupPluginBabelStrings.enter
import typings.rollupPluginBabel.rollupPluginBabelStrings.exit
import typings.rollupPluginBabel.rollupPluginBabelStrings.external
import typings.rollupPluginBabel.rollupPluginBabelStrings.module
import typings.rollupPluginBabel.rollupPluginBabelStrings.root
import typings.rollupPluginBabel.rollupPluginBabelStrings.runtime
import typings.rollupPluginBabel.rollupPluginBabelStrings.script
import typings.rollupPluginBabel.rollupPluginBabelStrings.unambiguous
import typings.rollupPluginBabel.rollupPluginBabelStrings.upward
import typings.rollupPluginutils.mod.CreateFilter_
import typings.rollupPluginutils.mod.FilterPattern
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/plugin-babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupBabelInputPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def babel(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("babel")().asInstanceOf[Plugin]
  inline def babel(options: RollupBabelInputPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("babel")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def createBabelInputPluginFactory(): js.Function1[/* options */ js.UndefOr[RollupBabelInputPluginOptions], Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBabelInputPluginFactory")().asInstanceOf[js.Function1[/* options */ js.UndefOr[RollupBabelInputPluginOptions], Plugin]]
  inline def createBabelInputPluginFactory(customCallback: RollupBabelCustomInputPluginBuilder): js.Function1[/* options */ js.UndefOr[RollupBabelInputPluginOptions], Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBabelInputPluginFactory")(customCallback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[RollupBabelInputPluginOptions], Plugin]]
  
  inline def createBabelOutputPluginFactory(): js.Function1[/* options */ js.UndefOr[RollupBabelOutputPluginOptions], Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBabelOutputPluginFactory")().asInstanceOf[js.Function1[/* options */ js.UndefOr[RollupBabelOutputPluginOptions], Plugin]]
  inline def createBabelOutputPluginFactory(customCallback: RollupBabelCustomOutputPluginBuilder): js.Function1[/* options */ js.UndefOr[RollupBabelOutputPluginOptions], Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBabelOutputPluginFactory")(customCallback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[RollupBabelOutputPluginOptions], Plugin]]
  
  inline def getBabelInputPlugin(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getBabelInputPlugin")().asInstanceOf[Plugin]
  inline def getBabelInputPlugin(options: RollupBabelInputPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getBabelInputPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def getBabelOutputPlugin(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getBabelOutputPlugin")().asInstanceOf[Plugin]
  inline def getBabelOutputPlugin(options: RollupBabelOutputPluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getBabelOutputPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait RollupBabelCustomInputPlugin extends StObject {
    
    var config: js.UndefOr[RollupBabelCustomInputPluginConfig] = js.undefined
    
    var options: js.UndefOr[RollupBabelCustomInputPluginOptions] = js.undefined
    
    var result: js.UndefOr[RollupBabelCustomInputPluginResult] = js.undefined
  }
  object RollupBabelCustomInputPlugin {
    
    inline def apply(): RollupBabelCustomInputPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupBabelCustomInputPlugin]
    }
    
    extension [Self <: RollupBabelCustomInputPlugin](x: Self) {
      
      inline def setConfig(value: RollupBabelCustomInputPluginConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setOptions(value: /* options */ RollupBabelInputPluginOptions & (Record[String, Any]) => CustomOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResult(value: RollupBabelCustomInputPluginResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  type RollupBabelCustomInputPluginBuilder = js.Function1[/* babel */ TypeofbabelCore, RollupBabelCustomInputPlugin]
  
  type RollupBabelCustomInputPluginConfig = js.ThisFunction2[
    /* this */ TransformPluginContext, 
    /* cfg */ PartialConfig, 
    /* options */ RollupBabelCustomPluginConfigOptions, 
    TransformOptions
  ]
  
  type RollupBabelCustomInputPluginOptions = js.Function1[/* options */ RollupBabelInputPluginOptions & (Record[String, Any]), CustomOptions]
  
  type RollupBabelCustomInputPluginResult = js.ThisFunction2[
    /* this */ TransformPluginContext, 
    /* result */ BabelFileResult, 
    /* options */ RollupBabelCustomPluginResultOptions, 
    BabelFileResult
  ]
  
  trait RollupBabelCustomOutputPlugin extends StObject {
    
    var config: js.UndefOr[RollupBabelCustomOutputPluginConfig] = js.undefined
    
    var options: js.UndefOr[RollupBabelCustomOutputPluginOptions] = js.undefined
    
    var result: js.UndefOr[RollupBabelCustomOutputPluginResult] = js.undefined
  }
  object RollupBabelCustomOutputPlugin {
    
    inline def apply(): RollupBabelCustomOutputPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupBabelCustomOutputPlugin]
    }
    
    extension [Self <: RollupBabelCustomOutputPlugin](x: Self) {
      
      inline def setConfig(value: RollupBabelCustomOutputPluginConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setOptions(value: /* options */ RollupBabelOutputPluginOptions & (Record[String, Any]) => PluginOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResult(value: RollupBabelCustomOutputPluginResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  type RollupBabelCustomOutputPluginBuilder = js.Function1[/* babel */ TypeofbabelCore, RollupBabelCustomOutputPlugin]
  
  type RollupBabelCustomOutputPluginConfig = js.ThisFunction2[
    /* this */ PluginContext, 
    /* cfg */ PartialConfig, 
    /* options */ RollupBabelCustomPluginConfigOptions, 
    TransformOptions
  ]
  
  type RollupBabelCustomOutputPluginOptions = js.Function1[
    /* options */ RollupBabelOutputPluginOptions & (Record[String, Any]), 
    PluginOptions
  ]
  
  type RollupBabelCustomOutputPluginResult = js.ThisFunction2[
    /* this */ PluginContext, 
    /* result */ BabelFileResult, 
    /* options */ RollupBabelCustomPluginResultOptions, 
    BabelFileResult
  ]
  
  trait RollupBabelCustomPluginConfigOptions extends StObject {
    
    var code: String
    
    var customOptions: Record[String, Any]
  }
  object RollupBabelCustomPluginConfigOptions {
    
    inline def apply(code: String, customOptions: Record[String, Any]): RollupBabelCustomPluginConfigOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], customOptions = customOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollupBabelCustomPluginConfigOptions]
    }
    
    extension [Self <: RollupBabelCustomPluginConfigOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCustomOptions(value: Record[String, Any]): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait RollupBabelCustomPluginResultOptions extends StObject {
    
    var code: String
    
    var config: PartialConfig
    
    var customOptions: Record[String, Any]
    
    var transformOptions: TransformOptions
  }
  object RollupBabelCustomPluginResultOptions {
    
    inline def apply(
      code: String,
      config: PartialConfig,
      customOptions: Record[String, Any],
      transformOptions: TransformOptions
    ): RollupBabelCustomPluginResultOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], customOptions = customOptions.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollupBabelCustomPluginResultOptions]
    }
    
    extension [Self <: RollupBabelCustomPluginResultOptions](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCustomOptions(value: Record[String, Any]): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
      
      inline def setTransformOptions(value: TransformOptions): Self = StObject.set(x, "transformOptions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@babel/core.@babel/core.TransformOptions, 'include' | 'exclude'> */
  trait RollupBabelInputPluginOptions extends StObject {
    
    var ast: js.UndefOr[Boolean | Null] = js.undefined
    
    var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
    
    var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
    
    /**
      * It is recommended to configure this option explicitly (even if with its default value) so an informed decision is taken on how those babel helpers are inserted into the code.
      * @default 'bundled'
      */
    var babelHelpers: js.UndefOr[bundled | runtime | `inline` | external] = js.undefined
    
    var babelrc: js.UndefOr[Boolean | Null] = js.undefined
    
    var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.undefined
    
    var browserslistConfigFile: js.UndefOr[Boolean | Null] = js.undefined
    
    var browserslistEnv: js.UndefOr[String | Null] = js.undefined
    
    var caller: js.UndefOr[TransformCaller] = js.undefined
    
    var cloneInputAst: js.UndefOr[Boolean | Null] = js.undefined
    
    var code: js.UndefOr[Boolean | Null] = js.undefined
    
    var comments: js.UndefOr[Boolean | Null] = js.undefined
    
    var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
    
    var configFile: js.UndefOr[String | Boolean | Null] = js.undefined
    
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
    
    var envName: js.UndefOr[String] = js.undefined
    
    /**
      * A picomatch pattern, or array of patterns, which specifies the files in the build the plugin should ignore. When relaying on Babel configuration files you can only exclude additional files with this option, you cannot override what you have configured for Babel itself.
      * @default undefined;
      */
    var exclude: js.UndefOr[FilterPattern] = js.undefined
    
    var `extends`: js.UndefOr[String | Null] = js.undefined
    
    /**
      * An array of file extensions that Babel should transpile. If you want to transpile TypeScript files with this plugin it's essential to include .ts and .tsx in this option.
      * @default ['.js', '.jsx', '.es6', '.es', '.mjs']
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var filenameRelative: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Custom filter function can be used to determine whether or not certain modules should be operated upon.
      * Example:
      *   import { createFilter } from '@rollup/pluginutils';
      *   const include = 'include/ **.js';
      *   const exclude = 'exclude/ **.js';
      *   const filter = createFilter(include, exclude, {});
      * @default undefined;
      */
    var filter: js.UndefOr[ReturnType[CreateFilter_]] = js.undefined
    
    var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
    
    var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
    
    var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
    
    var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    /**
      * A picomatch pattern, or array of patterns, which specifies the files in the build the plugin should operate on. When relying on Babel configuration files you cannot include files already excluded there.
      * @default undefined;
      */
    var include: js.UndefOr[FilterPattern] = js.undefined
    
    var inputSourceMap: js.UndefOr[InputSourceMap | Null] = js.undefined
    
    var minified: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleId: js.UndefOr[String | Null] = js.undefined
    
    var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleRoot: js.UndefOr[String | Null] = js.undefined
    
    var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
    
    var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var retainLines: js.UndefOr[Boolean | Null] = js.undefined
    
    var root: js.UndefOr[String | Null] = js.undefined
    
    var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
    
    var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
    
    /**
      * Before transpiling your input files this plugin also transpile a short piece of code for each input file. This is used to validate some misconfiguration errors, but for sufficiently big projects it can slow your build times so if you are confident about your configuration then you might disable those checks with this option.
      * @default false
      */
    var skipPreflightCheck: js.UndefOr[Boolean] = js.undefined
    
    var sourceFileName: js.UndefOr[String | Null] = js.undefined
    
    var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
    
    var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var wrapPluginVisitorMethod: js.UndefOr[
        (js.Function3[
          /* pluginAlias */ String, 
          /* visitorType */ enter | exit, 
          /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit], 
          js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
        ]) | Null
      ] = js.undefined
  }
  object RollupBabelInputPluginOptions {
    
    inline def apply(): RollupBabelInputPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupBabelInputPluginOptions]
    }
    
    extension [Self <: RollupBabelInputPluginOptions](x: Self) {
      
      inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstNull: Self = StObject.set(x, "ast", null)
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
      
      inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
      
      inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      inline def setBabelHelpers(value: bundled | runtime | `inline` | external): Self = StObject.set(x, "babelHelpers", value.asInstanceOf[js.Any])
      
      inline def setBabelHelpersUndefined: Self = StObject.set(x, "babelHelpers", js.undefined)
      
      inline def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      inline def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
      
      inline def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
      
      inline def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
      
      inline def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
      
      inline def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
      
      inline def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value*))
      
      inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      inline def setBrowserslistConfigFile(value: Boolean): Self = StObject.set(x, "browserslistConfigFile", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistConfigFileNull: Self = StObject.set(x, "browserslistConfigFile", null)
      
      inline def setBrowserslistConfigFileUndefined: Self = StObject.set(x, "browserslistConfigFile", js.undefined)
      
      inline def setBrowserslistEnv(value: String): Self = StObject.set(x, "browserslistEnv", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistEnvNull: Self = StObject.set(x, "browserslistEnv", null)
      
      inline def setBrowserslistEnvUndefined: Self = StObject.set(x, "browserslistEnv", js.undefined)
      
      inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCloneInputAst(value: Boolean): Self = StObject.set(x, "cloneInputAst", value.asInstanceOf[js.Any])
      
      inline def setCloneInputAstNull: Self = StObject.set(x, "cloneInputAst", null)
      
      inline def setCloneInputAstUndefined: Self = StObject.set(x, "cloneInputAst", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactNull: Self = StObject.set(x, "compact", null)
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdNull: Self = StObject.set(x, "cwd", null)
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
      
      inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
      
      inline def setEnvNull: Self = StObject.set(x, "env", null)
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExclude(value: FilterPattern): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      inline def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
      
      inline def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilter(value: ReturnType[CreateFilter_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
      
      inline def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
      
      inline def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
      
      inline def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
      
      inline def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
      
      inline def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
      
      inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      inline def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: FilterPattern): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeNull: Self = StObject.set(x, "include", null)
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setInputSourceMap(value: InputSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      inline def setMinifiedNull: Self = StObject.set(x, "minified", null)
      
      inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
      
      inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      inline def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
      
      inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      inline def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      inline def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
      
      inline def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      inline def setOnly(value: js.Array[MatchPattern]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyNull: Self = StObject.set(x, "only", null)
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: MatchPattern*): Self = StObject.set(x, "only", js.Array(value*))
      
      inline def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsNull: Self = StObject.set(x, "presets", null)
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
      
      inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      inline def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
      
      inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      inline def setSkipPreflightCheck(value: Boolean): Self = StObject.set(x, "skipPreflightCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipPreflightCheckUndefined: Self = StObject.set(x, "skipPreflightCheck", js.undefined)
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
      
      inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      inline def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsNull: Self = StObject.set(x, "sourceMaps", null)
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setWrapPluginVisitorMethod(
        value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
      ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
      
      inline def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
      
      inline def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@babel/core.@babel/core.TransformOptions, 'include' | 'exclude'> */
  trait RollupBabelOutputPluginOptions extends StObject {
    
    /**
      * Use with other formats than UMD/IIFE.
      * @default false
      */
    var allowAllFormats: js.UndefOr[Boolean] = js.undefined
    
    var ast: js.UndefOr[Boolean | Null] = js.undefined
    
    var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
    
    var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
    
    var babelrc: js.UndefOr[Boolean | Null] = js.undefined
    
    var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.undefined
    
    var browserslistConfigFile: js.UndefOr[Boolean | Null] = js.undefined
    
    var browserslistEnv: js.UndefOr[String | Null] = js.undefined
    
    var caller: js.UndefOr[TransformCaller] = js.undefined
    
    var cloneInputAst: js.UndefOr[Boolean | Null] = js.undefined
    
    var code: js.UndefOr[Boolean | Null] = js.undefined
    
    var comments: js.UndefOr[Boolean | Null] = js.undefined
    
    var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
    
    var configFile: js.UndefOr[String | Boolean | Null] = js.undefined
    
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
    
    var envName: js.UndefOr[String] = js.undefined
    
    var `extends`: js.UndefOr[String | Null] = js.undefined
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var filenameRelative: js.UndefOr[String | Null] = js.undefined
    
    var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
    
    var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
    
    var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
    
    var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var inputSourceMap: js.UndefOr[InputSourceMap | Null] = js.undefined
    
    var minified: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleId: js.UndefOr[String | Null] = js.undefined
    
    var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleRoot: js.UndefOr[String | Null] = js.undefined
    
    var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
    
    var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var retainLines: js.UndefOr[Boolean | Null] = js.undefined
    
    var root: js.UndefOr[String | Null] = js.undefined
    
    var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
    
    var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
    
    var sourceFileName: js.UndefOr[String | Null] = js.undefined
    
    var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
    
    var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var wrapPluginVisitorMethod: js.UndefOr[
        (js.Function3[
          /* pluginAlias */ String, 
          /* visitorType */ enter | exit, 
          /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit], 
          js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
        ]) | Null
      ] = js.undefined
  }
  object RollupBabelOutputPluginOptions {
    
    inline def apply(): RollupBabelOutputPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupBabelOutputPluginOptions]
    }
    
    extension [Self <: RollupBabelOutputPluginOptions](x: Self) {
      
      inline def setAllowAllFormats(value: Boolean): Self = StObject.set(x, "allowAllFormats", value.asInstanceOf[js.Any])
      
      inline def setAllowAllFormatsUndefined: Self = StObject.set(x, "allowAllFormats", js.undefined)
      
      inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstNull: Self = StObject.set(x, "ast", null)
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
      
      inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
      
      inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      inline def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      inline def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
      
      inline def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
      
      inline def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
      
      inline def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
      
      inline def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
      
      inline def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value*))
      
      inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      inline def setBrowserslistConfigFile(value: Boolean): Self = StObject.set(x, "browserslistConfigFile", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistConfigFileNull: Self = StObject.set(x, "browserslistConfigFile", null)
      
      inline def setBrowserslistConfigFileUndefined: Self = StObject.set(x, "browserslistConfigFile", js.undefined)
      
      inline def setBrowserslistEnv(value: String): Self = StObject.set(x, "browserslistEnv", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistEnvNull: Self = StObject.set(x, "browserslistEnv", null)
      
      inline def setBrowserslistEnvUndefined: Self = StObject.set(x, "browserslistEnv", js.undefined)
      
      inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCloneInputAst(value: Boolean): Self = StObject.set(x, "cloneInputAst", value.asInstanceOf[js.Any])
      
      inline def setCloneInputAstNull: Self = StObject.set(x, "cloneInputAst", null)
      
      inline def setCloneInputAstUndefined: Self = StObject.set(x, "cloneInputAst", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactNull: Self = StObject.set(x, "compact", null)
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdNull: Self = StObject.set(x, "cwd", null)
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
      
      inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
      
      inline def setEnvNull: Self = StObject.set(x, "env", null)
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      inline def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
      
      inline def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
      
      inline def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
      
      inline def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
      
      inline def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
      
      inline def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
      
      inline def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
      
      inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      inline def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInputSourceMap(value: InputSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      inline def setMinifiedNull: Self = StObject.set(x, "minified", null)
      
      inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
      
      inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      inline def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
      
      inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      inline def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      inline def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
      
      inline def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      inline def setOnly(value: js.Array[MatchPattern]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyNull: Self = StObject.set(x, "only", null)
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: MatchPattern*): Self = StObject.set(x, "only", js.Array(value*))
      
      inline def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsNull: Self = StObject.set(x, "presets", null)
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
      
      inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      inline def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
      
      inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
      
      inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      inline def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsNull: Self = StObject.set(x, "sourceMaps", null)
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setWrapPluginVisitorMethod(
        value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ Any, Unit]
      ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
      
      inline def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
      
      inline def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
    }
  }
}
