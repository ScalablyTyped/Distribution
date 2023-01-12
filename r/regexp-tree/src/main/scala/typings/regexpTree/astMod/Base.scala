package typings.regexpTree.astMod

import typings.regexpTree.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base[T /* <: AstClass */] extends StObject {
  
  var loc: js.UndefOr[End] = js.undefined
  
  var `type`: T
}
object Base {
  
  inline def apply[T /* <: AstClass */](`type`: T): Base[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base[?], T /* <: AstClass */] (val x: Self & Base[T]) extends AnyVal {
    
    inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
