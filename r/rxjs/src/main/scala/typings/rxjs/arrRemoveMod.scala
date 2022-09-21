package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrRemoveMod {
  
  @JSImport("rxjs/dist/types/internal/util/arrRemove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrRemove[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrRemove")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrRemove[T](arr: Null, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrRemove")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrRemove[T](arr: Unit, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrRemove")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
