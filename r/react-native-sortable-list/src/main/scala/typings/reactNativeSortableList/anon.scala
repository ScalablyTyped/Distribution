package typings.reactNativeSortableList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animated extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
  }
  object Animated {
    
    @scala.inline
    def apply(): Animated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animated]
    }
    
    @scala.inline
    implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  trait Key[K] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[K] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply[K](): Key[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key[K]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[?], K] (val x: Self & Key[K]) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    @scala.inline
    def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
