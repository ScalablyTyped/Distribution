package typings.reactRouterNavigation

import typings.reactRouterNavigation.reactRouterNavigationBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    @scala.inline
    def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lazy extends StObject {
    
    var `lazy`: `true`
  }
  object Lazy {
    
    @scala.inline
    def apply(): Lazy = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("lazy")(true)
      __obj.asInstanceOf[Lazy]
    }
    
    @scala.inline
    implicit class LazyMutableBuilder[Self <: Lazy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLazy(value: `true`): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    }
  }
}
