package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  def append(key: String, value: String): Unit
  
  def get(key: String): js.UndefOr[String | Null]
}
object Dictkey {
  
  inline def apply(append: (String, String) => Unit, get: String => js.UndefOr[String | Null]): Dictkey = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: (String, String) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => js.UndefOr[String | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
