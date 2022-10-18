package typings.quadstore.distCjsTypesMod

import typings.asynciterator.mod.AsyncIterator
import typings.quadstore.distCjsTypesMod.ResultType.QUADS
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuadStreamResultWithInternals
  extends StObject
     with QuadStreamResult {
  
  var index: js.Array[TermName]
  
  var resorted: Boolean
}
object QuadStreamResultWithInternals {
  
  inline def apply(
    index: js.Array[TermName],
    iterator: AsyncIterator[Quad],
    order: js.Array[TermName],
    resorted: Boolean,
    `type`: QUADS
  ): QuadStreamResultWithInternals = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], iterator = iterator.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], resorted = resorted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadStreamResultWithInternals]
  }
  
  extension [Self <: QuadStreamResultWithInternals](x: Self) {
    
    inline def setIndex(value: js.Array[TermName]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: TermName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setResorted(value: Boolean): Self = StObject.set(x, "resorted", value.asInstanceOf[js.Any])
  }
}
