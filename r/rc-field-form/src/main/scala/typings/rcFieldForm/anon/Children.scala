package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.FormInstance
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[Values] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var ref: js.UndefOr[Ref[FormInstance[Values]]] = js.undefined
}
object Children {
  
  @scala.inline
  def apply[Values](): Children[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[Values]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[?], Values] (val x: Self & Children[Values]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
