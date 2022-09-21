package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.anon.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsutilMod {
  
  @JSImport("raml-1-parser/dist/util/fsutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyDirSyncRecursive(to: String, from: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(to: String, from: String, opt: Unit, pathFilter: js.Function1[/* x */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(
    to: String,
    from: String,
    opt: Unit,
    pathFilter: js.Function1[/* x */ String, Boolean],
    contentFilter: js.Function1[/* x */ String, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any], contentFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(
    to: String,
    from: String,
    opt: Unit,
    pathFilter: Unit,
    contentFilter: js.Function1[/* x */ String, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any], contentFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(to: String, from: String, opt: CopyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(to: String, from: String, opt: CopyOptions, pathFilter: js.Function1[/* x */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(
    to: String,
    from: String,
    opt: CopyOptions,
    pathFilter: js.Function1[/* x */ String, Boolean],
    contentFilter: js.Function1[/* x */ String, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any], contentFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(
    to: String,
    from: String,
    opt: CopyOptions,
    pathFilter: Unit,
    contentFilter: js.Function1[/* x */ String, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], pathFilter.asInstanceOf[js.Any], contentFilter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyFileSync(sourcePath: String, targetPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(sourcePath.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeDirSyncRecursive(dirPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDirSyncRecursive")(dirPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CopyOptions extends StObject {
    
    var contentPatternReplacements: js.UndefOr[PatternReplacementSet] = js.undefined
    
    var contentReplacements: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var forceDelete: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[String] = js.undefined
    
    var pathPatternReplacements: js.UndefOr[PatternReplacementSet] = js.undefined
    
    var pathReplacements: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object CopyOptions {
    
    inline def apply(): CopyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyOptions]
    }
    
    extension [Self <: CopyOptions](x: Self) {
      
      inline def setContentPatternReplacements(value: PatternReplacementSet): Self = StObject.set(x, "contentPatternReplacements", value.asInstanceOf[js.Any])
      
      inline def setContentPatternReplacementsUndefined: Self = StObject.set(x, "contentPatternReplacements", js.undefined)
      
      inline def setContentReplacements(value: StringDictionary[String]): Self = StObject.set(x, "contentReplacements", value.asInstanceOf[js.Any])
      
      inline def setContentReplacementsUndefined: Self = StObject.set(x, "contentReplacements", js.undefined)
      
      inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setPathPatternReplacements(value: PatternReplacementSet): Self = StObject.set(x, "pathPatternReplacements", value.asInstanceOf[js.Any])
      
      inline def setPathPatternReplacementsUndefined: Self = StObject.set(x, "pathPatternReplacements", js.undefined)
      
      inline def setPathReplacements(value: StringDictionary[String]): Self = StObject.set(x, "pathReplacements", value.asInstanceOf[js.Any])
      
      inline def setPathReplacementsUndefined: Self = StObject.set(x, "pathReplacements", js.undefined)
    }
  }
  
  type PatternReplacementSet = StringDictionary[Map]
}
