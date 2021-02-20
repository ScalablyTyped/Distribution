package typings.rcVirtualList

import typings.rcVirtualList.anon.Style
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  type GetKey[T] = js.Function1[/* item */ T, Key]
  
  type RenderFunc[T] = js.Function3[/* item */ T, /* index */ Double, /* props */ Style, ReactNode]
  
  @js.native
  trait SharedConfig[T] extends StObject {
    
    def getKey(item: T): Key = js.native
  }
  object SharedConfig {
    
    @scala.inline
    def apply[T](getKey: T => Key): SharedConfig[T] = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
      __obj.asInstanceOf[SharedConfig[T]]
    }
    
    @scala.inline
    implicit class SharedConfigMutableBuilder[Self <: SharedConfig[_], T] (val x: Self with SharedConfig[T]) extends AnyVal {
      
      @scala.inline
      def setGetKey(value: T => Key): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    }
  }
}
