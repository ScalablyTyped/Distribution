package typings.storybookAddons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: String = js.native
    
    var brandTitle: js.UndefOr[String] = js.native
  }
  object Base {
    
    @scala.inline
    def apply(base: String): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandTitle(value: String): Self = StObject.set(x, "brandTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandTitleUndefined: Self = StObject.set(x, "brandTitle", js.undefined)
    }
  }
  
  @js.native
  trait Current[T] extends StObject {
    
    var current: T = js.native
  }
  object Current {
    
    @scala.inline
    def apply[T](current: T): Current[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current[T]]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current[_], T] (val x: Self with Current[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
