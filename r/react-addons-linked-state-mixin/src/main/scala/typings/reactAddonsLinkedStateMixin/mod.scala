package typings.reactAddonsLinkedStateMixin

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-linked-state-mixin", JSImport.Namespace)
  @js.native
  val ^ : LinkedStateMixin = js.native
  
  trait LinkedStateMixin
    extends StObject
       with Mixin[js.Any, js.Any] {
    
    def linkState[T](key: String): ReactLink[T]
  }
  object LinkedStateMixin {
    
    @scala.inline
    def apply(linkState: String => ReactLink[js.Any]): LinkedStateMixin = {
      val __obj = js.Dynamic.literal(linkState = js.Any.fromFunction1(linkState))
      __obj.asInstanceOf[LinkedStateMixin]
    }
    
    @scala.inline
    implicit class LinkedStateMixinMutableBuilder[Self <: LinkedStateMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkState(value: String => ReactLink[js.Any]): Self = StObject.set(x, "linkState", js.Any.fromFunction1(value))
    }
  }
  
  trait ReactLink[T] extends StObject {
    
    def requestChange(newValue: T): Unit
    
    var value: T
  }
  object ReactLink {
    
    @scala.inline
    def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
      val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactLink[T]]
    }
    
    @scala.inline
    implicit class ReactLinkMutableBuilder[Self <: ReactLink[?], T] (val x: Self & ReactLink[T]) extends AnyVal {
      
      @scala.inline
      def setRequestChange(value: T => Unit): Self = StObject.set(x, "requestChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = LinkedStateMixin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LinkedStateMixin = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLAttributes[T] extends StObject {
      
      var checkedLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
      
      var valueLink: js.UndefOr[ReactLink[Boolean | String | Double]] = js.undefined
    }
    object HTMLAttributes {
      
      @scala.inline
      def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      @scala.inline
      implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setCheckedLink(value: ReactLink[Boolean]): Self = StObject.set(x, "checkedLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckedLinkUndefined: Self = StObject.set(x, "checkedLink", js.undefined)
        
        @scala.inline
        def setValueLink(value: ReactLink[Boolean | String | Double]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
      }
    }
  }
}
