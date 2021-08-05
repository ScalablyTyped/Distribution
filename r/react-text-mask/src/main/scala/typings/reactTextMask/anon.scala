package typings.reactTextMask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IndexesOfPipedChars extends StObject {
    
    var indexesOfPipedChars: js.Array[Double]
    
    var value: String
  }
  object IndexesOfPipedChars {
    
    inline def apply(indexesOfPipedChars: js.Array[Double], value: String): IndexesOfPipedChars = {
      val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexesOfPipedChars]
    }
    
    extension [Self <: IndexesOfPipedChars](x: Self) {
      
      inline def setIndexesOfPipedChars(value: js.Array[Double]): Self = StObject.set(x, "indexesOfPipedChars", value.asInstanceOf[js.Any])
      
      inline def setIndexesOfPipedCharsVarargs(value: Double*): Self = StObject.set(x, "indexesOfPipedChars", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SomeCharsRejected extends StObject {
    
    var someCharsRejected: Boolean
  }
  object SomeCharsRejected {
    
    inline def apply(someCharsRejected: Boolean): SomeCharsRejected = {
      val __obj = js.Dynamic.literal(someCharsRejected = someCharsRejected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SomeCharsRejected]
    }
    
    extension [Self <: SomeCharsRejected](x: Self) {
      
      inline def setSomeCharsRejected(value: Boolean): Self = StObject.set(x, "someCharsRejected", value.asInstanceOf[js.Any])
    }
  }
}
