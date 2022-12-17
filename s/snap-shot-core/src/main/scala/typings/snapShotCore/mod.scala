package typings.snapShotCore

import typings.snapShotCore.anon.Comment
import typings.snapShotCore.anon.ExactSpecName
import typings.snapShotCore.anon.Expected
import typings.snapShotCore.anon.Ext
import typings.snapShotCore.anon.File
import typings.snapShotCore.anon.Index
import typings.snapShotCore.anon.Key
import typings.snapShotCore.anon.SortSnapshots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snap-shot-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def core[T /* <: js.Object | Null */, U](options: Comment[T, U]): Key[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("core")(options.asInstanceOf[js.Any]).asInstanceOf[Key[U]]
  
  inline def prune(options: Ext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prune")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def prune(options: Ext, opts: SortSnapshots): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prune")(options.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  inline def restore(options: File): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def savedSnapshotName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("savedSnapshotName")().asInstanceOf[String]
  inline def savedSnapshotName(options: Index): String = ^.asInstanceOf[js.Dynamic].applyDynamic("savedSnapshotName")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def storeValue(options: typings.snapShotCore.anon.Opts): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storeValue")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def throwCannotSaveOnCI(options: ExactSpecName): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwCannotSaveOnCI")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  type CompareFunction[T /* <: js.Object | Null */] = js.Function1[/* options */ Expected[T], Result]
  
  trait Opts extends StObject {
    
    var ci: js.UndefOr[Boolean] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var sortSnapshots: js.UndefOr[Boolean] = js.undefined
    
    var update: js.UndefOr[Boolean] = js.undefined
    
    var useRelativePath: js.UndefOr[Boolean] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSortSnapshots(value: Boolean): Self = StObject.set(x, "sortSnapshots", value.asInstanceOf[js.Any])
      
      inline def setSortSnapshotsUndefined: Self = StObject.set(x, "sortSnapshots", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setUseRelativePath(value: Boolean): Self = StObject.set(x, "useRelativePath", value.asInstanceOf[js.Any])
      
      inline def setUseRelativePathUndefined: Self = StObject.set(x, "useRelativePath", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    def orElse(callback: js.Function1[/* message */ String, Unit]): Unit
  }
  object Result {
    
    inline def apply(orElse: js.Function1[/* message */ String, Unit] => Unit): Result = {
      val __obj = js.Dynamic.literal(orElse = js.Any.fromFunction1(orElse))
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setOrElse(value: js.Function1[/* message */ String, Unit] => Unit): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
    }
  }
}
