package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.rollup.anon.Sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<{[ K in rollup.rollup.OutputPluginHooks ]: rollup.rollup.PluginHooks[K]}> */
/* Inlined parent std.Partial<{[ K in rollup.rollup.AddonHooks ]: rollup.rollup.ObjectHook<rollup.rollup.AddonHook, {}>}> */
trait OutputPlugin extends StObject {
  
  var augmentChunkHash: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var banner: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var generateBundle: js.UndefOr[
    ObjectHook[
      (js.ThisFunction3[
        /* this */ PluginContext, 
        /* options */ NormalizedOutputOptions, 
        /* bundle */ OutputBundle, 
        /* isWrite */ Boolean, 
        Unit
      ]) | (MakeAsync[
        js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit
        ]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var intro: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var name: String
  
  var outputOptions: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var outro: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var renderChunk: js.UndefOr[ObjectHook[RenderChunkHook | MakeAsync[RenderChunkHook], js.Object | Sequential]] = js.undefined
  
  var renderDynamicImport: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var renderError: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var renderStart: js.UndefOr[
    ObjectHook[
      (js.ThisFunction2[
        /* this */ PluginContext, 
        /* outputOptions */ NormalizedOutputOptions, 
        /* inputOptions */ NormalizedInputOptions, 
        Unit
      ]) | (MakeAsync[
        js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ NormalizedOutputOptions, 
          /* inputOptions */ NormalizedInputOptions, 
          Unit
        ]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var resolveAssetUrl: js.UndefOr[
    ObjectHook[ResolveAssetUrlHook | MakeAsync[ResolveAssetUrlHook], js.Object | Sequential]
  ] = js.undefined
  
  var resolveFileUrl: js.UndefOr[
    ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]
  ] = js.undefined
  
  var resolveImportMeta: js.UndefOr[
    ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
  ] = js.undefined
  
  var writeBundle: js.UndefOr[
    ObjectHook[
      (js.ThisFunction2[
        /* this */ PluginContext, 
        /* options */ NormalizedOutputOptions, 
        /* bundle */ OutputBundle, 
        Unit
      ]) | (MakeAsync[
        js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          Unit
        ]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
}
object OutputPlugin {
  
  inline def apply(name: String): OutputPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPlugin]
  }
  
  extension [Self <: OutputPlugin](x: Self) {
    
    inline def setAugmentChunkHash(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
          ]), 
          js.Object | Sequential
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
          (js.ThisFunction3[
            /* this */ PluginContext, 
            /* options */ NormalizedOutputOptions, 
            /* bundle */ OutputBundle, 
            /* isWrite */ Boolean, 
            Unit
          ]) | (MakeAsync[
            js.ThisFunction3[
              /* this */ PluginContext, 
              /* options */ NormalizedOutputOptions, 
              /* bundle */ OutputBundle, 
              /* isWrite */ Boolean, 
              Unit
            ]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "generateBundle", value.asInstanceOf[js.Any])
    
    inline def setGenerateBundleUndefined: Self = StObject.set(x, "generateBundle", js.undefined)
    
    inline def setIntro(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    
    inline def setOutro(value: ObjectHook[AddonHook, js.Object]): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    inline def setRenderChunk(value: ObjectHook[RenderChunkHook | MakeAsync[RenderChunkHook], js.Object | Sequential]): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderChunkUndefined: Self = StObject.set(x, "renderChunk", js.undefined)
    
    inline def setRenderDynamicImport(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImportUndefined: Self = StObject.set(x, "renderDynamicImport", js.undefined)
    
    inline def setRenderError(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    inline def setRenderStart(
      value: ObjectHook[
          (js.ThisFunction2[
            /* this */ PluginContext, 
            /* outputOptions */ NormalizedOutputOptions, 
            /* inputOptions */ NormalizedInputOptions, 
            Unit
          ]) | (MakeAsync[
            js.ThisFunction2[
              /* this */ PluginContext, 
              /* outputOptions */ NormalizedOutputOptions, 
              /* inputOptions */ NormalizedInputOptions, 
              Unit
            ]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "renderStart", value.asInstanceOf[js.Any])
    
    inline def setRenderStartUndefined: Self = StObject.set(x, "renderStart", js.undefined)
    
    inline def setResolveAssetUrl(value: ObjectHook[ResolveAssetUrlHook | MakeAsync[ResolveAssetUrlHook], js.Object | Sequential]): Self = StObject.set(x, "resolveAssetUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveAssetUrlUndefined: Self = StObject.set(x, "resolveAssetUrl", js.undefined)
    
    inline def setResolveFileUrl(value: ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    inline def setResolveImportMeta(
      value: ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
    ): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    inline def setWriteBundle(
      value: ObjectHook[
          (js.ThisFunction2[
            /* this */ PluginContext, 
            /* options */ NormalizedOutputOptions, 
            /* bundle */ OutputBundle, 
            Unit
          ]) | (MakeAsync[
            js.ThisFunction2[
              /* this */ PluginContext, 
              /* options */ NormalizedOutputOptions, 
              /* bundle */ OutputBundle, 
              Unit
            ]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "writeBundle", value.asInstanceOf[js.Any])
    
    inline def setWriteBundleUndefined: Self = StObject.set(x, "writeBundle", js.undefined)
  }
}
