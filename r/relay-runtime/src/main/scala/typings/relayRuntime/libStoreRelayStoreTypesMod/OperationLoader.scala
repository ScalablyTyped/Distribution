package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libUtilNormalizationNodeMod.NormalizationSplitOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationLoader extends StObject {
  
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: Any): js.UndefOr[NormalizationSplitOperation | Null]
  
  /**
    * Asynchronously load an operation.
    */
  def load(reference: Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
}
object OperationLoader {
  
  inline def apply(
    get: Any => js.UndefOr[NormalizationSplitOperation | Null],
    load: Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[OperationLoader]
  }
  
  extension [Self <: OperationLoader](x: Self) {
    
    inline def setGet(value: Any => js.UndefOr[NormalizationSplitOperation | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setLoad(value: Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
  }
}
