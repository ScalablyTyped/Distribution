package typings.regexpMatchIndices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimTypesMod {
  
  object global {
    
    trait RegExpExecArray extends StObject {
      
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
    
    type RegExpExecIndicesArray = typings.regexpMatchIndices.typesMod.RegExpExecIndicesArray
    
    trait RegExpMatchArray extends StObject {
      
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
}
