package typings.quadstore.distCjsTypesMod

import typings.rdfjsTypes.dataModelMod.QuadGraph
import typings.rdfjsTypes.dataModelMod.QuadObject
import typings.rdfjsTypes.dataModelMod.QuadPredicate
import typings.rdfjsTypes.dataModelMod.QuadSubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  var graph: js.UndefOr[QuadGraph] = js.undefined
  
  var `object`: js.UndefOr[QuadObject | Range] = js.undefined
  
  var predicate: js.UndefOr[QuadPredicate] = js.undefined
  
  var subject: js.UndefOr[QuadSubject] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setGraph(value: QuadGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
    
    inline def setObject(value: QuadObject | Range): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setPredicate(value: QuadPredicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setSubject(value: QuadSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
