package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<{[ K in rollup.rollup.OutputPluginHooks ]: rollup.rollup.PluginHooks[K]}> */
/* Inlined parent std.Partial<{[ K in rollup.rollup.AddonHooks ]: rollup.rollup.ObjectHook<rollup.rollup.AddonHook, {}>}> */
trait OutputPlugin extends StObject {
  
  var augmentChunkHash: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var banner: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var generateBundle: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var intro: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var name: String
  
  var outputOptions: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var outro: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var renderChunk: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var renderDynamicImport: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var renderError: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var renderStart: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var resolveFileUrl: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var resolveImportMeta: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var writeBundle: js.UndefOr[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ] = js.undefined
}
object OutputPlugin {
  
  inline def apply(name: String): OutputPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputPlugin] (val x: Self) extends AnyVal {
    
    inline def setAugmentChunkHash(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    inline def setAugmentChunkHashUndefined: Self = StObject.set(x, "augmentChunkHash", js.undefined)
    
    inline def setBanner(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setFooter(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setGenerateBundle(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    inline def setGenerateBundleUndefined: Self = StObject.set(x, "generateBundle", js.undefined)
    
    inline def setIntro(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    
    inline def setOutro(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    inline def setRenderChunk(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderChunkUndefined: Self = StObject.set(x, "renderChunk", js.undefined)
    
    inline def setRenderDynamicImport(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImportUndefined: Self = StObject.set(x, "renderDynamicImport", js.undefined)
    
    inline def setRenderError(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    inline def setRenderStart(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setRenderStartUndefined: Self = StObject.set(x, "renderStart", js.undefined)
    
    inline def setResolveFileUrl(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    inline def setResolveImportMeta(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWriteBundle(
      value: ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
    
    inline def setWriteBundleUndefined: Self = StObject.set(x, "writeBundle", js.undefined)
  }
}
