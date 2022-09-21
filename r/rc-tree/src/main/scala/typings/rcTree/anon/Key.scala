package typings.rcTree.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String | Double
  
  var title: js.UndefOr[ReactNode | (js.Function1[/* data */ this.type, ReactNode])] = js.undefined
}
object Key {
  
  inline def apply(key: String | Double): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ReactNode | (js.Function1[Key, ReactNode])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction1(value: Key => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
