package typings.sift

import org.scalablytyped.runtime.StringDictionary
import typings.sift.libCoreMod.OperationCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<sift.sift/lib/core.Options> */
  trait PartialOptions extends StObject {
    
    var compare: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
    var operations: js.UndefOr[StringDictionary[OperationCreator[Any]]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setCompare(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setOperations(value: StringDictionary[OperationCreator[Any]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sift.sift/src/core.Options> */
  trait PartialOptionsCompare extends StObject {
    
    var compare: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
    var operations: js.UndefOr[StringDictionary[typings.sift.srcCoreMod.OperationCreator[Any]]] = js.undefined
  }
  object PartialOptionsCompare {
    
    inline def apply(): PartialOptionsCompare = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsCompare]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptionsCompare] (val x: Self) extends AnyVal {
      
      inline def setCompare(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setOperations(value: StringDictionary[typings.sift.srcCoreMod.OperationCreator[Any]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    }
  }
}
