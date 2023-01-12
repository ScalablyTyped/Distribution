package typings.reactTypesShared

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRemovableMod {
  
  trait Removable[T, R] extends StObject {
    
    var isRemovable: js.UndefOr[Boolean] = js.undefined
    
    var onRemove: js.UndefOr[
        js.Function2[/* value */ T, /* event */ js.UndefOr[SyntheticEvent[Element, Event]], R]
      ] = js.undefined
  }
  object Removable {
    
    inline def apply[T, R](): Removable[T, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Removable[T, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Removable[?, ?], T, R] (val x: Self & (Removable[T, R])) extends AnyVal {
      
      inline def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
      
      inline def setIsRemovableUndefined: Self = StObject.set(x, "isRemovable", js.undefined)
      
      inline def setOnRemove(value: (/* value */ T, /* event */ js.UndefOr[SyntheticEvent[Element, Event]]) => R): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    }
  }
}
