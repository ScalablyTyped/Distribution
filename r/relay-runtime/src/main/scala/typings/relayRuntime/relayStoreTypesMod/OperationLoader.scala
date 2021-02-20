package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationLoader extends StObject {
  
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | Null] = js.native
  
  /**
    * Asynchronously load an operation.
    */
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]] = js.native
}
object OperationLoader {
  
  @scala.inline
  def apply(
    get: js.Any => js.UndefOr[NormalizationSplitOperation | Null],
    load: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[OperationLoader]
  }
  
  @scala.inline
  implicit class OperationLoaderMutableBuilder[Self <: OperationLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: js.Any => js.UndefOr[NormalizationSplitOperation | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad(value: js.Any => js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
  }
}
