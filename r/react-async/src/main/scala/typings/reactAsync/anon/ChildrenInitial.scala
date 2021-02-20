package typings.reactAsync.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenInitial extends StObject {
  
  var children: js.Any = js.native
  
  var initial: js.Any = js.native
  
  var state: js.Any = js.native
}
object ChildrenInitial {
  
  @scala.inline
  def apply(children: js.Any, initial: js.Any, state: js.Any): ChildrenInitial = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenInitial]
  }
  
  @scala.inline
  implicit class ChildrenInitialMutableBuilder[Self <: ChildrenInitial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
