package typings.rdflib.anon

import typings.rdflib.statementMod.default
import typings.rdflib.typesMod.GraphType
import typings.rdflib.typesMod.ObjectType
import typings.rdflib.typesMod.PredicateType
import typings.rdflib.typesMod.SubjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var delete: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.undefined
  
  var patch: js.UndefOr[js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]] = js.undefined
  
  var where: js.UndefOr[Any] = js.undefined
}
object Delete {
  
  inline def apply(): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setDelete(value: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDeleteVarargs(value: (default[SubjectType, PredicateType, ObjectType, GraphType])*): Self = StObject.set(x, "delete", js.Array(value*))
    
    inline def setPatch(value: js.Array[default[SubjectType, PredicateType, ObjectType, GraphType]]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPatchVarargs(value: (default[SubjectType, PredicateType, ObjectType, GraphType])*): Self = StObject.set(x, "patch", js.Array(value*))
    
    inline def setWhere(value: Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
