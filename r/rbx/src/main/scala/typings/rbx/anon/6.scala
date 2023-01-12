package typings.rbx.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[TAsComponent /* <: ElementType[Any] */] extends StObject {
  
  var as: js.UndefOr[TAsComponent] = js.undefined
}
object `6` {
  
  inline def apply[TAsComponent /* <: ElementType[Any] */](): `6`[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[TAsComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`[?], TAsComponent /* <: ElementType[Any] */] (val x: Self & `6`[TAsComponent]) extends AnyVal {
    
    inline def setAs(value: TAsComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
