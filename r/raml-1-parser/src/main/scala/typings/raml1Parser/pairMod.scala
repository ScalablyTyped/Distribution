package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairMod {
  
  @JSImport("raml-1-parser/dist/util/pair", "KeyValuePair")
  @js.native
  open class KeyValuePair[T] () extends StObject {
    
    var key: String = js.native
    
    var value: T = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/pair", "Map")
  @js.native
  open class Map[T] () extends StObject {
    def this(ms: js.Array[KeyValuePair[T]]) = this()
    
    def filter(callbackfn: js.Function3[/* elem */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
    
    def forEach(callbackfn: js.Function3[/* elem */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    
    def get(key: String): T = js.native
    
    def map[U](callbackfn: js.Function3[/* elem */ T, /* index */ Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
    
    /* private */ var mappings: Any = js.native
    
    def pairs(): js.Array[Any] = js.native
    
    def set(key: String, value: T): Unit = js.native
    
    def volume(): Double = js.native
  }
}
