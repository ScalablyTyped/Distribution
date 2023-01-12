package typings.reduxLogicTest

import typings.reduxLogicTest.reduxLogicTestBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enumerable[Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */] extends StObject {
    
    var enumerable: `true`
    
    def get(): js.Array[Actions]
  }
  object Enumerable {
    
    inline def apply[Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */](get: () => js.Array[Actions]): Enumerable[Actions] = {
      val __obj = js.Dynamic.literal(enumerable = true, get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Enumerable[Actions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enumerable[?], Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */] (val x: Self & Enumerable[Actions]) extends AnyVal {
      
      inline def setEnumerable(value: `true`): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setGet(value: () => js.Array[Actions]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
}
