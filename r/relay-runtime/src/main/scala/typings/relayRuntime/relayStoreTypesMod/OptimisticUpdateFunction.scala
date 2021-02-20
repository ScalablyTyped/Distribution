package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticUpdateFunction extends OptimisticUpdate {
  
  def storeUpdater(store: RecordSourceProxy): Unit = js.native
}
object OptimisticUpdateFunction {
  
  @scala.inline
  def apply(storeUpdater: RecordSourceProxy => Unit): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
  
  @scala.inline
  implicit class OptimisticUpdateFunctionMutableBuilder[Self <: OptimisticUpdateFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoreUpdater(value: RecordSourceProxy => Unit): Self = StObject.set(x, "storeUpdater", js.Any.fromFunction1(value))
  }
}
