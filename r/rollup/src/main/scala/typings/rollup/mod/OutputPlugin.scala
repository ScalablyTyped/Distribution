package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.OutputPluginHooks> */
/* Inlined parent std.Partial<rollup.rollup.OutputPluginValueHooks> */
trait OutputPlugin extends StObject {
  
  var augmentChunkHash: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
  ] = js.undefined
  
  var banner: js.UndefOr[AddonHook] = js.undefined
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[AddonHook] = js.undefined
  
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  
  var intro: js.UndefOr[AddonHook] = js.undefined
  
  var name: String
  
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ]
  ] = js.undefined
  
  var outro: js.UndefOr[AddonHook] = js.undefined
  
  var renderChunk: js.UndefOr[RenderChunkHook] = js.undefined
  
  var renderDynamicImport: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
  ] = js.undefined
  
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
  ] = js.undefined
  
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ NormalizedOutputOptions, 
      /* inputOptions */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.undefined
  
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.undefined
  
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.undefined
  
  var writeBundle: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
}
object OutputPlugin {
  
  inline def apply(name: String): OutputPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPlugin]
  }
  
  extension [Self <: OutputPlugin](x: Self) {
    
    inline def setAugmentChunkHash(value: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    inline def setAugmentChunkHashUndefined: Self = StObject.set(x, "augmentChunkHash", js.undefined)
    
    inline def setBanner(value: AddonHook): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setFooter(value: AddonHook): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setGenerateBundle(
      value: js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    inline def setGenerateBundleUndefined: Self = StObject.set(x, "generateBundle", js.undefined)
    
    inline def setIntro(value: AddonHook): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          js.UndefOr[OutputOptions | Null]
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    
    inline def setOutro(value: AddonHook): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    inline def setRenderChunk(value: RenderChunkHook): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderChunkUndefined: Self = StObject.set(x, "renderChunk", js.undefined)
    
    inline def setRenderDynamicImport(
      value: js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImportUndefined: Self = StObject.set(x, "renderDynamicImport", js.undefined)
    
    inline def setRenderError(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[Error], js.Promise[Unit] | Unit]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    inline def setRenderStart(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ NormalizedOutputOptions, 
          /* inputOptions */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setRenderStartUndefined: Self = StObject.set(x, "renderStart", js.undefined)
    
    inline def setResolveAssetUrl(value: ResolveAssetUrlHook): Self = StObject.set(x, "resolveAssetUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveAssetUrlUndefined: Self = StObject.set(x, "resolveAssetUrl", js.undefined)
    
    inline def setResolveFileUrl(value: ResolveFileUrlHook): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    inline def setResolveImportMeta(value: ResolveImportMetaHook): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    inline def setWriteBundle(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          Unit | js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
    
    inline def setWriteBundleUndefined: Self = StObject.set(x, "writeBundle", js.undefined)
  }
}
