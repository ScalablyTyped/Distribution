package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof rollup.rollup.FunctionPluginHooks ]: rollup.rollup.ObjectHook<K extends rollup.rollup.AsyncPluginHooks? rollup.rollup.MakeAsync<rollup.rollup.FunctionPluginHooks[K]> : rollup.rollup.FunctionPluginHooks[K], // eslint-disable-next-line @typescript-eslint/ban-types
K extends rollup.rollup.ParallelPluginHooks? {  sequential :boolean | undefined} : {}>} */
trait PluginHooks extends StObject {
  
  var augmentChunkHash: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var buildEnd: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var buildStart: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var closeBundle: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var closeWatcher: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var generateBundle: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var load: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.LoadHook> : rollup.rollup.LoadHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var moduleParsed: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ModuleParsedHook> : rollup.rollup.ModuleParsedHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var options: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var outputOptions: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var renderChunk: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var renderDynamicImport: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var renderError: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var renderStart: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var resolveDynamicImport: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveDynamicImportHook> : rollup.rollup.ResolveDynamicImportHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var resolveFileUrl: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var resolveId: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveIdHook> : rollup.rollup.ResolveIdHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var resolveImportMeta: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var shouldTransformCachedModule: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ShouldTransformCachedModuleHook> : rollup.rollup.ShouldTransformCachedModuleHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var transform: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.TransformHook> : rollup.rollup.TransformHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var watchChange: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.WatchChangeHook> : rollup.rollup.WatchChangeHook */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
  
  var writeBundle: ObjectHook[
    /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
  ]
}
object PluginHooks {
  
  inline def apply(
    augmentChunkHash: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    buildEnd: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    buildStart: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    closeBundle: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    closeWatcher: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    generateBundle: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    load: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.LoadHook> : rollup.rollup.LoadHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    moduleParsed: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ModuleParsedHook> : rollup.rollup.ModuleParsedHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    options: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    outputOptions: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    renderChunk: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    renderDynamicImport: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    renderError: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    renderStart: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    resolveDynamicImport: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveDynamicImportHook> : rollup.rollup.ResolveDynamicImportHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    resolveFileUrl: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    resolveId: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveIdHook> : rollup.rollup.ResolveIdHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    resolveImportMeta: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    shouldTransformCachedModule: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ShouldTransformCachedModuleHook> : rollup.rollup.ShouldTransformCachedModuleHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    transform: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.TransformHook> : rollup.rollup.TransformHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    watchChange: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.WatchChangeHook> : rollup.rollup.WatchChangeHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ],
    writeBundle: ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ): PluginHooks = {
    val __obj = js.Dynamic.literal(augmentChunkHash = augmentChunkHash.asInstanceOf[js.Any], buildEnd = buildEnd.asInstanceOf[js.Any], buildStart = buildStart.asInstanceOf[js.Any], closeBundle = closeBundle.asInstanceOf[js.Any], closeWatcher = closeWatcher.asInstanceOf[js.Any], generateBundle = generateBundle.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], moduleParsed = moduleParsed.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outputOptions = outputOptions.asInstanceOf[js.Any], renderChunk = renderChunk.asInstanceOf[js.Any], renderDynamicImport = renderDynamicImport.asInstanceOf[js.Any], renderError = renderError.asInstanceOf[js.Any], renderStart = renderStart.asInstanceOf[js.Any], resolveDynamicImport = resolveDynamicImport.asInstanceOf[js.Any], resolveFileUrl = resolveFileUrl.asInstanceOf[js.Any], resolveId = resolveId.asInstanceOf[js.Any], resolveImportMeta = resolveImportMeta.asInstanceOf[js.Any], shouldTransformCachedModule = shouldTransformCachedModule.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], watchChange = watchChange.asInstanceOf[js.Any], writeBundle = writeBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginHooks] (val x: Self) extends AnyVal {
    
    inline def setAugmentChunkHash(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    inline def setBuildEnd(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "buildEnd", value.asInstanceOf[js.Any])
    
    inline def setBuildStart(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setCloseBundle(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "closeBundle", value.asInstanceOf[js.Any])
    
    inline def setCloseWatcher(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "closeWatcher", value.asInstanceOf[js.Any])
    
    inline def setGenerateBundle(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    inline def setLoad(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.LoadHook> : rollup.rollup.LoadHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'load' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setModuleParsed(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ModuleParsedHook> : rollup.rollup.ModuleParsedHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "moduleParsed", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderChunk(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImport(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderError(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    inline def setRenderStart(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setResolveDynamicImport(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveDynamicImportHook> : rollup.rollup.ResolveDynamicImportHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrl(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveId(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveIdHook> : rollup.rollup.ResolveIdHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMeta(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setShouldTransformCachedModule(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ShouldTransformCachedModuleHook> : rollup.rollup.ShouldTransformCachedModuleHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "shouldTransformCachedModule", value.asInstanceOf[js.Any])
    
    inline def setTransform(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.TransformHook> : rollup.rollup.TransformHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'transform' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWatchChange(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.WatchChangeHook> : rollup.rollup.WatchChangeHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "watchChange", value.asInstanceOf[js.Any])
    
    inline def setWriteBundle(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
  }
}
