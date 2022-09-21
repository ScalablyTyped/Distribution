package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileWatcherEventKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind & Double] = js.native
  
  @js.native
  sealed trait Changed
    extends StObject
       with FileWatcherEventKind
  /* 1 */ val Changed: typings.schematicsAngular.typescriptMod.FileWatcherEventKind.Changed & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with FileWatcherEventKind
  /* 0 */ val Created: typings.schematicsAngular.typescriptMod.FileWatcherEventKind.Created & Double = js.native
  
  @js.native
  sealed trait Deleted
    extends StObject
       with FileWatcherEventKind
  /* 2 */ val Deleted: typings.schematicsAngular.typescriptMod.FileWatcherEventKind.Deleted & Double = js.native
}
