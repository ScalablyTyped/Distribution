package typings.reactMathquill

import typings.reactMathquill.mod.Direction
import typings.reactMathquill.mod.MathField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeleteOutOf extends StObject {
    
    var deleteOutOf: js.UndefOr[js.Function2[/* direction */ Direction, /* mathField */ MathField, Unit]] = js.undefined
    
    var downOutOf: js.UndefOr[js.Function1[/* mathField */ MathField, Unit]] = js.undefined
    
    var edit: js.UndefOr[js.Function1[/* mathField */ MathField, Unit]] = js.undefined
    
    var enter: js.UndefOr[js.Function1[/* mathField */ MathField, Unit]] = js.undefined
    
    var moveOutOf: js.UndefOr[js.Function2[/* direction */ Direction, /* mathField */ MathField, Unit]] = js.undefined
    
    var selectOutOf: js.UndefOr[js.Function2[/* direction */ Direction, /* mathField */ MathField, Unit]] = js.undefined
    
    var upOutOf: js.UndefOr[js.Function1[/* mathField */ MathField, Unit]] = js.undefined
  }
  object DeleteOutOf {
    
    inline def apply(): DeleteOutOf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOutOf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteOutOf] (val x: Self) extends AnyVal {
      
      inline def setDeleteOutOf(value: (/* direction */ Direction, /* mathField */ MathField) => Unit): Self = StObject.set(x, "deleteOutOf", js.Any.fromFunction2(value))
      
      inline def setDeleteOutOfUndefined: Self = StObject.set(x, "deleteOutOf", js.undefined)
      
      inline def setDownOutOf(value: /* mathField */ MathField => Unit): Self = StObject.set(x, "downOutOf", js.Any.fromFunction1(value))
      
      inline def setDownOutOfUndefined: Self = StObject.set(x, "downOutOf", js.undefined)
      
      inline def setEdit(value: /* mathField */ MathField => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setEnter(value: /* mathField */ MathField => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setMoveOutOf(value: (/* direction */ Direction, /* mathField */ MathField) => Unit): Self = StObject.set(x, "moveOutOf", js.Any.fromFunction2(value))
      
      inline def setMoveOutOfUndefined: Self = StObject.set(x, "moveOutOf", js.undefined)
      
      inline def setSelectOutOf(value: (/* direction */ Direction, /* mathField */ MathField) => Unit): Self = StObject.set(x, "selectOutOf", js.Any.fromFunction2(value))
      
      inline def setSelectOutOfUndefined: Self = StObject.set(x, "selectOutOf", js.undefined)
      
      inline def setUpOutOf(value: /* mathField */ MathField => Unit): Self = StObject.set(x, "upOutOf", js.Any.fromFunction1(value))
      
      inline def setUpOutOfUndefined: Self = StObject.set(x, "upOutOf", js.undefined)
    }
  }
}
