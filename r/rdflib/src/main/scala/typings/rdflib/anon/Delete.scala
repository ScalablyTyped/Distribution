package typings.rdflib.anon

import typings.rdflib.libStatementMod.default
import typings.rdflib.libTypesMod.GraphType
import typings.rdflib.libTypesMod.ObjectType
import typings.rdflib.libTypesMod.PredicateType
import typings.rdflib.libTypesMod.SubjectType
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
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
