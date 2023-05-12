package typings.rimraf

import typings.glob.distMjsGlobMod.GlobOptions
import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import typings.rimraf.anon.Manual
import typings.rimraf.anon.Sync
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rimraf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertRimrafOptions(o: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertRimrafOptions")(o.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isRimrafOptions(o: Any): /* is rimraf.rimraf.RimrafOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRimrafOptions")(o.asInstanceOf[js.Any]).asInstanceOf[/* is rimraf.rimraf.RimrafOptions */ Boolean]
  
  @JSImport("rimraf", "manual")
  @js.native
  val manual: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Sync = js.native
  
  inline def manualSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def manualSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def manualSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def manualSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rimraf", "moveRemove")
  @js.native
  val moveRemove: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Sync = js.native
  
  inline def moveRemoveSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moveRemoveSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def moveRemoveSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveRemoveSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def moveRemoveSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moveRemoveSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def moveRemoveSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveRemoveSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rimraf", "native")
  @js.native
  val native: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Sync = js.native
  
  inline def nativeSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def nativeSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def nativeSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def nativeSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rimraf", "posix")
  @js.native
  val posix: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Sync = js.native
  
  inline def posixSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("posixSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def posixSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("posixSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def posixSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("posixSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def posixSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("posixSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rimraf", "rimraf")
  @js.native
  val rimraf: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Manual = js.native
  
  inline def rimrafSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("rimrafSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def rimrafSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def rimrafSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("rimrafSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def rimrafSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def sync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def sync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def sync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("rimraf", "windows")
  @js.native
  val windows: (js.Function2[
    /* path */ String | js.Array[String], 
    /* opt */ js.UndefOr[RimrafAsyncOptions], 
    js.Promise[Boolean]
  ]) & Sync = js.native
  
  inline def windowsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("windowsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def windowsSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("windowsSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def windowsSync(path: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("windowsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def windowsSync(path: js.Array[String], opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("windowsSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait RimrafAsyncOptions
    extends StObject
       with RimrafOptions {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function2[/* path */ String, Dirent | Stats, Boolean | js.Promise[Boolean]]] = js.undefined
    
    var glob: js.UndefOr[Boolean | GlobOptions] = js.undefined
    
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var preserveRoot: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var tmp: js.UndefOr[String] = js.undefined
  }
  object RimrafAsyncOptions {
    
    inline def apply(): RimrafAsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafAsyncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafAsyncOptions] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setFilter(value: (/* path */ String, Dirent | Stats) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGlob(value: Boolean | GlobOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPreserveRoot(value: Boolean): Self = StObject.set(x, "preserveRoot", value.asInstanceOf[js.Any])
      
      inline def setPreserveRootUndefined: Self = StObject.set(x, "preserveRoot", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      inline def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rimraf.mod.RimrafSyncOptions
    - typings.rimraf.mod.RimrafAsyncOptions
  */
  trait RimrafOptions extends StObject
  object RimrafOptions {
    
    inline def RimrafAsyncOptions(): typings.rimraf.mod.RimrafAsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.rimraf.mod.RimrafAsyncOptions]
    }
    
    inline def RimrafSyncOptions(): typings.rimraf.mod.RimrafSyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.rimraf.mod.RimrafSyncOptions]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rimraf.mod.RimrafOptions because Already inherited */ trait RimrafSyncOptions
    extends StObject
       with RimrafAsyncOptions {
    
    @JSName("filter")
    var filter_RimrafSyncOptions: js.UndefOr[js.Function2[/* path */ String, /* ent */ Dirent | Stats, Boolean]] = js.undefined
  }
  object RimrafSyncOptions {
    
    inline def apply(): RimrafSyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RimrafSyncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RimrafSyncOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: (/* path */ String, /* ent */ Dirent | Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
}
