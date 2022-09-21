package typings.quadstore.typesMod

import typings.abstractLevel.mod.AbstractChainedBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchOpts extends StObject {
  
  var preWrite: js.UndefOr[
    js.Function1[/* batch */ AbstractChainedBatch[Any, Any, Any], js.Promise[Any] | Any]
  ] = js.undefined
}
object BatchOpts {
  
  inline def apply(): BatchOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchOpts]
  }
  
  extension [Self <: BatchOpts](x: Self) {
    
    inline def setPreWrite(value: /* batch */ AbstractChainedBatch[Any, Any, Any] => js.Promise[Any] | Any): Self = StObject.set(x, "preWrite", js.Any.fromFunction1(value))
    
    inline def setPreWriteUndefined: Self = StObject.set(x, "preWrite", js.undefined)
  }
}
