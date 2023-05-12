package typings.storybookTheming.distCreateC2b2ce6dMod

import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheet extends StObject {
  
  var container: HTMLElement
  
  def flush(): Unit
  
  def insert(rule: String): Unit
  
  var key: String
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var tags: js.Array[HTMLStyleElement]
}
object StyleSheet {
  
  inline def apply(
    container: HTMLElement,
    flush: () => Unit,
    insert: String => Unit,
    key: String,
    tags: js.Array[HTMLStyleElement]
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setInsert(value: String => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
