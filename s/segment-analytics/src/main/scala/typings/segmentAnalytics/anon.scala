package typings.segmentAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnonymousId extends StObject {
    
    def anonymousId(): String = js.native
    def anonymousId(newId: String): String = js.native
    
    def id(): js.UndefOr[String | Null] = js.native
    def id(newId: String): js.UndefOr[String | Null] = js.native
    
    def logout(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def traits(): Unit = js.native
    def traits(newTraits: js.Object): Unit = js.native
  }
  
  trait Dictintegration
    extends StObject
       with /* integration */ StringDictionary[js.UndefOr[Boolean]] {
    
    var All: js.UndefOr[Boolean] = js.undefined
  }
  object Dictintegration {
    
    inline def apply(): Dictintegration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictintegration]
    }
    
    extension [Self <: Dictintegration](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    def id(): String = js.native
    
    def traits(): Unit = js.native
    def traits(newTraits: js.Object): Unit = js.native
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var oldKey: String
  }
  object Key {
    
    inline def apply(key: String, oldKey: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldKey = oldKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOldKey(value: String): Self = StObject.set(x, "oldKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyString extends StObject {
    
    var key: String
  }
  object KeyString {
    
    inline def apply(key: String): KeyString = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyString]
    }
    
    extension [Self <: KeyString](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
