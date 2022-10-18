package typings.quadstore.distCjsTypesMod

import typings.abstractLevel.mod.AbstractLevel
import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOpts extends StObject {
  
  var backend: AbstractLevel[Any, Any, Any]
  
  var dataFactory: DataFactory[Quad, Quad]
  
  var indexes: js.UndefOr[js.Array[js.Array[TermName]]] = js.undefined
  
  var prefixes: js.UndefOr[Prefixes] = js.undefined
}
object StoreOpts {
  
  inline def apply(backend: AbstractLevel[Any, Any, Any], dataFactory: DataFactory[Quad, Quad]): StoreOpts = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], dataFactory = dataFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOpts]
  }
  
  extension [Self <: StoreOpts](x: Self) {
    
    inline def setBackend(value: AbstractLevel[Any, Any, Any]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setDataFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "dataFactory", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: js.Array[js.Array[TermName]]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: js.Array[TermName]*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setPrefixes(value: Prefixes): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
