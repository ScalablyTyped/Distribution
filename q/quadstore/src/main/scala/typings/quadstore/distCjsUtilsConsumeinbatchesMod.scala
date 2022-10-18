package typings.quadstore

import typings.quadstore.distCjsTypesMod.TSReadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilsConsumeinbatchesMod {
  
  @JSImport("quadstore/dist/cjs/utils/consumeinbatches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeInBatches[T](
    readable: TSReadable[T],
    batchSize: Double,
    onEachBatch: js.Function1[/* items */ js.Array[T], Any]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeInBatches")(readable.asInstanceOf[js.Any], batchSize.asInstanceOf[js.Any], onEachBatch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
