package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.rollup.anon.Sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent rollup.rollup.OutputPlugin */
/* Inlined parent std.Partial<rollup.rollup.PluginHooks> */
trait Plugin extends StObject {
  
  // for inter-plugin communication
  var api: js.UndefOr[Any] = js.undefined
  
  var augmentChunkHash: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var banner: js.UndefOr[ObjectHook[AddonHook, js.Object]] = js.undefined
  
  var buildEnd: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var buildStart: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var closeBundle: js.UndefOr[
    ObjectHook[
      (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var closeWatcher: js.UndefOr[
    ObjectHook[
      (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
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
  
  var load: js.UndefOr[ObjectHook[LoadHook | MakeAsync[LoadHook], js.Object | Sequential]] = js.undefined
  
  var moduleParsed: js.UndefOr[
    ObjectHook[ModuleParsedHook | MakeAsync[ModuleParsedHook], js.Object | Sequential]
  ] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[
    ObjectHook[
      (js.ThisFunction1[
        /* this */ MinimalPluginContext, 
        /* options */ InputOptions, 
        InputOptions | Null | Unit
      ]) | (MakeAsync[
        js.ThisFunction1[
          /* this */ MinimalPluginContext, 
          /* options */ InputOptions, 
          InputOptions | Null | Unit
        ]
      ]), 
      js.Object | Sequential
    ]
  ] = js.undefined
  
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
  
  var resolveDynamicImport: js.UndefOr[
    ObjectHook[
      ResolveDynamicImportHook | MakeAsync[ResolveDynamicImportHook], 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var resolveFileUrl: js.UndefOr[
    ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]
  ] = js.undefined
  
  var resolveId: js.UndefOr[ObjectHook[ResolveIdHook | MakeAsync[ResolveIdHook], js.Object | Sequential]] = js.undefined
  
  var resolveImportMeta: js.UndefOr[
    ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
  ] = js.undefined
  
  var shouldTransformCachedModule: js.UndefOr[
    ObjectHook[
      ShouldTransformCachedModuleHook | MakeAsync[ShouldTransformCachedModuleHook], 
      js.Object | Sequential
    ]
  ] = js.undefined
  
  var transform: js.UndefOr[ObjectHook[TransformHook | MakeAsync[TransformHook], js.Object | Sequential]] = js.undefined
  
  var watchChange: js.UndefOr[ObjectHook[WatchChangeHook | MakeAsync[WatchChangeHook], js.Object | Sequential]] = js.undefined
  
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
object Plugin {
  
  inline def apply(name: String): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
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
    
    inline def setBuildEnd(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "buildEnd", value.asInstanceOf[js.Any])
    
    inline def setBuildEndUndefined: Self = StObject.set(x, "buildEnd", js.undefined)
    
    inline def setBuildStart(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setCloseBundle(
      value: ObjectHook[
          (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "closeBundle", value.asInstanceOf[js.Any])
    
    inline def setCloseBundleUndefined: Self = StObject.set(x, "closeBundle", js.undefined)
    
    inline def setCloseWatcher(
      value: ObjectHook[
          (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "closeWatcher", value.asInstanceOf[js.Any])
    
    inline def setCloseWatcherUndefined: Self = StObject.set(x, "closeWatcher", js.undefined)
    
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
    
    inline def setLoad(value: ObjectHook[LoadHook | MakeAsync[LoadHook], js.Object | Sequential]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setModuleParsed(value: ObjectHook[ModuleParsedHook | MakeAsync[ModuleParsedHook], js.Object | Sequential]): Self = StObject.set(x, "moduleParsed", value.asInstanceOf[js.Any])
    
    inline def setModuleParsedUndefined: Self = StObject.set(x, "moduleParsed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: ObjectHook[
          (js.ThisFunction1[
            /* this */ MinimalPluginContext, 
            /* options */ InputOptions, 
            InputOptions | Null | Unit
          ]) | (MakeAsync[
            js.ThisFunction1[
              /* this */ MinimalPluginContext, 
              /* options */ InputOptions, 
              InputOptions | Null | Unit
            ]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
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
    
    inline def setResolveDynamicImport(
      value: ObjectHook[
          ResolveDynamicImportHook | MakeAsync[ResolveDynamicImportHook], 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "resolveDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setResolveDynamicImportUndefined: Self = StObject.set(x, "resolveDynamicImport", js.undefined)
    
    inline def setResolveFileUrl(value: ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrlUndefined: Self = StObject.set(x, "resolveFileUrl", js.undefined)
    
    inline def setResolveId(value: ObjectHook[ResolveIdHook | MakeAsync[ResolveIdHook], js.Object | Sequential]): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    inline def setResolveIdUndefined: Self = StObject.set(x, "resolveId", js.undefined)
    
    inline def setResolveImportMeta(
      value: ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
    ): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMetaUndefined: Self = StObject.set(x, "resolveImportMeta", js.undefined)
    
    inline def setShouldTransformCachedModule(
      value: ObjectHook[
          ShouldTransformCachedModuleHook | MakeAsync[ShouldTransformCachedModuleHook], 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "shouldTransformCachedModule", value.asInstanceOf[js.Any])
    
    inline def setShouldTransformCachedModuleUndefined: Self = StObject.set(x, "shouldTransformCachedModule", js.undefined)
    
    inline def setTransform(value: ObjectHook[TransformHook | MakeAsync[TransformHook], js.Object | Sequential]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWatchChange(value: ObjectHook[WatchChangeHook | MakeAsync[WatchChangeHook], js.Object | Sequential]): Self = StObject.set(x, "watchChange", value.asInstanceOf[js.Any])
    
    inline def setWatchChangeUndefined: Self = StObject.set(x, "watchChange", js.undefined)
    
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
