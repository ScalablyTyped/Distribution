package typings.reactAsync.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenInitial extends StObject {
  
  var children: js.Any
  
  var initial: js.Any
  
  var state: js.Any
}
object ChildrenInitial {
  
  inline def apply(children: js.Any, initial: js.Any, state: js.Any): ChildrenInitial = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenInitial]
  }
  
  extension [Self <: ChildrenInitial](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
