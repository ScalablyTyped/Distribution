package typings.segmentAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Dictintegration
    extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
    
    var All: js.UndefOr[Boolean] = js.native
  }
  object Dictintegration {
    
    @scala.inline
    def apply(): Dictintegration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictintegration]
    }
    
    @scala.inline
    implicit class DictintegrationMutableBuilder[Self <: Dictintegration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    def id(): String = js.native
    
    def traits(): Unit = js.native
    def traits(newTraits: js.Object): Unit = js.native
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var oldKey: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, oldKey: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldKey = oldKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldKey(value: String): Self = StObject.set(x, "oldKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyString extends StObject {
    
    var key: String = js.native
  }
  object KeyString {
    
    @scala.inline
    def apply(key: String): KeyString = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyString]
    }
    
    @scala.inline
    implicit class KeyStringMutableBuilder[Self <: KeyString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
