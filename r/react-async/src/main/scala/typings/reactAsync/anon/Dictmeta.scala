package typings.reactAsync.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictmeta
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  var counter: Double
}
object Dictmeta {
  
  inline def apply(counter: Double): Dictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictmeta]
  }
  
  extension [Self <: Dictmeta](x: Self) {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
  }
}
