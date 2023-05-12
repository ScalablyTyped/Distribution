package typings.streamTransform

import typings.streamTransform.distEsmSyncMod.Handler
import typings.streamTransform.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmSyncMod {
  
  @JSImport("stream-transform/browser/esm/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def transform[T, U](records: js.Array[T], options: Options, handler: Handler[T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
}
