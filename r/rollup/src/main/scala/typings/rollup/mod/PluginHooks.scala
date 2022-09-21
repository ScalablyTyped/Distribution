package typings.rollup.mod

import typings.rollup.anon.CustomResolution
import typings.rollup.anon.Left
import typings.rollup.anon.Sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof rollup.rollup.FunctionPluginHooks ]: rollup.rollup.ObjectHook<K extends rollup.rollup.AsyncPluginHooks? rollup.rollup.MakeAsync<rollup.rollup.FunctionPluginHooks[K]> : rollup.rollup.FunctionPluginHooks[K], // eslint-disable-next-line @typescript-eslint/ban-types
K extends rollup.rollup.ParallelPluginHooks? {  sequential :boolean | undefined} : {}>} */
trait PluginHooks extends StObject {
  
  var augmentChunkHash: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
      js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
    ]), 
    js.Object | Sequential
  ]
  
  var buildEnd: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
    js.Object | Sequential
  ]
  
  var buildStart: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]) | (MakeAsync[
      js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]
    ]), 
    js.Object | Sequential
  ]
  
  var closeBundle: ObjectHook[
    (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
    js.Object | Sequential
  ]
  
  var closeWatcher: ObjectHook[
    (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
    js.Object | Sequential
  ]
  
  var generateBundle: ObjectHook[
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
  
  var load: ObjectHook[LoadHook | MakeAsync[LoadHook], js.Object | Sequential]
  
  var moduleParsed: ObjectHook[ModuleParsedHook | MakeAsync[ModuleParsedHook], js.Object | Sequential]
  
  var options: ObjectHook[
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
  
  var outputOptions: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]) | (MakeAsync[
      js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]
    ]), 
    js.Object | Sequential
  ]
  
  var renderChunk: ObjectHook[RenderChunkHook | MakeAsync[RenderChunkHook], js.Object | Sequential]
  
  var renderDynamicImport: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]) | (MakeAsync[
      js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]
    ]), 
    js.Object | Sequential
  ]
  
  var renderError: ObjectHook[
    (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
    js.Object | Sequential
  ]
  
  var renderStart: ObjectHook[
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
  
  var resolveAssetUrl: ObjectHook[ResolveAssetUrlHook | MakeAsync[ResolveAssetUrlHook], js.Object | Sequential]
  
  var resolveDynamicImport: ObjectHook[
    ResolveDynamicImportHook | MakeAsync[ResolveDynamicImportHook], 
    js.Object | Sequential
  ]
  
  var resolveFileUrl: ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]
  
  var resolveId: ObjectHook[ResolveIdHook | MakeAsync[ResolveIdHook], js.Object | Sequential]
  
  var resolveImportMeta: ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
  
  var shouldTransformCachedModule: ObjectHook[
    ShouldTransformCachedModuleHook | MakeAsync[ShouldTransformCachedModuleHook], 
    js.Object | Sequential
  ]
  
  var transform: ObjectHook[TransformHook | MakeAsync[TransformHook], js.Object | Sequential]
  
  var watchChange: ObjectHook[WatchChangeHook | MakeAsync[WatchChangeHook], js.Object | Sequential]
  
  var writeBundle: ObjectHook[
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
}
object PluginHooks {
  
  inline def apply(
    augmentChunkHash: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
      ]), 
      js.Object | Sequential
    ],
    buildEnd: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
      js.Object | Sequential
    ],
    buildStart: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]
      ]), 
      js.Object | Sequential
    ],
    closeBundle: ObjectHook[
      (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
      js.Object | Sequential
    ],
    closeWatcher: ObjectHook[
      (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
      js.Object | Sequential
    ],
    generateBundle: ObjectHook[
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
    ],
    load: ObjectHook[LoadHook | MakeAsync[LoadHook], js.Object | Sequential],
    moduleParsed: ObjectHook[ModuleParsedHook | MakeAsync[ModuleParsedHook], js.Object | Sequential],
    options: ObjectHook[
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
    ],
    outputOptions: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]
      ]), 
      js.Object | Sequential
    ],
    renderChunk: ObjectHook[RenderChunkHook | MakeAsync[RenderChunkHook], js.Object | Sequential],
    renderDynamicImport: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]) | (MakeAsync[
        js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]
      ]), 
      js.Object | Sequential
    ],
    renderError: ObjectHook[
      (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
      js.Object | Sequential
    ],
    renderStart: ObjectHook[
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
    ],
    resolveAssetUrl: ObjectHook[ResolveAssetUrlHook | MakeAsync[ResolveAssetUrlHook], js.Object | Sequential],
    resolveDynamicImport: ObjectHook[
      ResolveDynamicImportHook | MakeAsync[ResolveDynamicImportHook], 
      js.Object | Sequential
    ],
    resolveFileUrl: ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential],
    resolveId: ObjectHook[ResolveIdHook | MakeAsync[ResolveIdHook], js.Object | Sequential],
    resolveImportMeta: ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential],
    shouldTransformCachedModule: ObjectHook[
      ShouldTransformCachedModuleHook | MakeAsync[ShouldTransformCachedModuleHook], 
      js.Object | Sequential
    ],
    transform: ObjectHook[TransformHook | MakeAsync[TransformHook], js.Object | Sequential],
    watchChange: ObjectHook[WatchChangeHook | MakeAsync[WatchChangeHook], js.Object | Sequential],
    writeBundle: ObjectHook[
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
  ): PluginHooks = {
    val __obj = js.Dynamic.literal(augmentChunkHash = augmentChunkHash.asInstanceOf[js.Any], buildEnd = buildEnd.asInstanceOf[js.Any], buildStart = buildStart.asInstanceOf[js.Any], closeBundle = closeBundle.asInstanceOf[js.Any], closeWatcher = closeWatcher.asInstanceOf[js.Any], generateBundle = generateBundle.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], moduleParsed = moduleParsed.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outputOptions = outputOptions.asInstanceOf[js.Any], renderChunk = renderChunk.asInstanceOf[js.Any], renderDynamicImport = renderDynamicImport.asInstanceOf[js.Any], renderError = renderError.asInstanceOf[js.Any], renderStart = renderStart.asInstanceOf[js.Any], resolveAssetUrl = resolveAssetUrl.asInstanceOf[js.Any], resolveDynamicImport = resolveDynamicImport.asInstanceOf[js.Any], resolveFileUrl = resolveFileUrl.asInstanceOf[js.Any], resolveId = resolveId.asInstanceOf[js.Any], resolveImportMeta = resolveImportMeta.asInstanceOf[js.Any], shouldTransformCachedModule = shouldTransformCachedModule.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], watchChange = watchChange.asInstanceOf[js.Any], writeBundle = writeBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginHooks]
  }
  
  extension [Self <: PluginHooks](x: Self) {
    
    inline def setAugmentChunkHash(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "augmentChunkHash", value.asInstanceOf[js.Any])
    
    inline def setBuildEnd(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "buildEnd", value.asInstanceOf[js.Any])
    
    inline def setBuildStart(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ NormalizedInputOptions, Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
    
    inline def setCloseBundle(
      value: ObjectHook[
          (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "closeBundle", value.asInstanceOf[js.Any])
    
    inline def setCloseWatcher(
      value: ObjectHook[
          (js.ThisFunction0[/* this */ PluginContext, Unit]) | (MakeAsync[js.ThisFunction0[/* this */ PluginContext, Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "closeWatcher", value.asInstanceOf[js.Any])
    
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
    
    inline def setLoad(value: ObjectHook[LoadHook | MakeAsync[LoadHook], js.Object | Sequential]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setModuleParsed(value: ObjectHook[ModuleParsedHook | MakeAsync[ModuleParsedHook], js.Object | Sequential]): Self = StObject.set(x, "moduleParsed", value.asInstanceOf[js.Any])
    
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
    
    inline def setOutputOptions(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ OutputOptions, OutputOptions | Null | Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderChunk(value: ObjectHook[RenderChunkHook | MakeAsync[RenderChunkHook], js.Object | Sequential]): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderDynamicImport(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]) | (MakeAsync[
            js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, Left | Null | Unit]
          ]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "renderDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setRenderError(
      value: ObjectHook[
          (js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]) | (MakeAsync[js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], Unit]]), 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "renderError", value.asInstanceOf[js.Any])
    
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
    
    inline def setResolveAssetUrl(value: ObjectHook[ResolveAssetUrlHook | MakeAsync[ResolveAssetUrlHook], js.Object | Sequential]): Self = StObject.set(x, "resolveAssetUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveDynamicImport(
      value: ObjectHook[
          ResolveDynamicImportHook | MakeAsync[ResolveDynamicImportHook], 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "resolveDynamicImport", value.asInstanceOf[js.Any])
    
    inline def setResolveFileUrl(value: ObjectHook[ResolveFileUrlHook | MakeAsync[ResolveFileUrlHook], js.Object | Sequential]): Self = StObject.set(x, "resolveFileUrl", value.asInstanceOf[js.Any])
    
    inline def setResolveId(value: ObjectHook[ResolveIdHook | MakeAsync[ResolveIdHook], js.Object | Sequential]): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    inline def setResolveImportMeta(
      value: ObjectHook[ResolveImportMetaHook | MakeAsync[ResolveImportMetaHook], js.Object | Sequential]
    ): Self = StObject.set(x, "resolveImportMeta", value.asInstanceOf[js.Any])
    
    inline def setShouldTransformCachedModule(
      value: ObjectHook[
          ShouldTransformCachedModuleHook | MakeAsync[ShouldTransformCachedModuleHook], 
          js.Object | Sequential
        ]
    ): Self = StObject.set(x, "shouldTransformCachedModule", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: ObjectHook[TransformHook | MakeAsync[TransformHook], js.Object | Sequential]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWatchChange(value: ObjectHook[WatchChangeHook | MakeAsync[WatchChangeHook], js.Object | Sequential]): Self = StObject.set(x, "watchChange", value.asInstanceOf[js.Any])
    
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
  }
}
