package typings.quadstore.distCjsTypesMod

import typings.quadstore.distCjsTypesMod.ResultType.QUADS
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadArrayResultWithInternals
  extends StObject
     with QuadArrayResult {
  
  var index: js.Array[TermName]
  
  var resorted: Boolean
}
object QuadArrayResultWithInternals {
  
  inline def apply(
    index: js.Array[TermName],
    items: js.Array[Quad],
    order: js.Array[TermName],
    resorted: Boolean,
    `type`: QUADS
  ): QuadArrayResultWithInternals = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], resorted = resorted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadArrayResultWithInternals]
  }
  
  extension [Self <: QuadArrayResultWithInternals](x: Self) {
    
    inline def setIndex(value: js.Array[TermName]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: TermName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setResorted(value: Boolean): Self = StObject.set(x, "resorted", value.asInstanceOf[js.Any])
  }
}
