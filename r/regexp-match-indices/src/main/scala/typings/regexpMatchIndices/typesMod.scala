package typings.regexpMatchIndices

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.RegExpExecArray * / any */ trait RegExpExecArray extends StObject {
    
    var indices: RegExpExecIndicesArray
  }
  object RegExpExecArray {
    
    inline def apply(indices: RegExpExecIndicesArray): RegExpExecArray = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpExecArray]
    }
    
    extension [Self <: RegExpExecArray](x: Self) {
      
      inline def setIndices(value: RegExpExecIndicesArray): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegExpExecIndicesArray
    extends StObject
       with Array[js.Tuple2[Double, Double]] {
    
    var groups: js.UndefOr[StringDictionary[js.Tuple2[Double, Double]]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.RegExpMatchArray * / any */ trait RegExpMatchArray extends StObject {
    
    var indices: js.UndefOr[RegExpExecIndicesArray] = js.undefined
  }
  object RegExpMatchArray {
    
    inline def apply(): RegExpMatchArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegExpMatchArray]
    }
    
    extension [Self <: RegExpMatchArray](x: Self) {
      
      inline def setIndices(value: RegExpExecIndicesArray): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    }
  }
}
