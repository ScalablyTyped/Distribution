package typings.scrollIntoViewIfNeeded

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-into-view-if-needed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(target: Element, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default(target: Element, options: Options[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default[T](target: Element, options: CustomBehaviorOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait CustomBehaviorOptions[T]
    extends StObject
       with typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    def behavior(actions: js.Array[CustomScrollAction]): T
    @JSName("behavior")
    var behavior_Original: CustomScrollBehaviorCallback[T]
  }
  object CustomBehaviorOptions {
    
    @scala.inline
    def apply[T](behavior: /* actions */ js.Array[CustomScrollAction] => T): CustomBehaviorOptions[T] = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction1(behavior))
      __obj.asInstanceOf[CustomBehaviorOptions[T]]
    }
    
    @scala.inline
    implicit class CustomBehaviorOptionsMutableBuilder[Self <: CustomBehaviorOptions[?], T] (val x: Self & CustomBehaviorOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: /* actions */ js.Array[CustomScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
    }
  }
  
  trait Options[T]
    extends StObject
       with typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: ScrollBehavior | CustomScrollBehaviorCallback[T]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorFunction1(value: /* actions */ js.Array[CustomScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
  
  trait StandardBehaviorOptions
    extends StObject
       with typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior] = js.undefined
  }
  object StandardBehaviorOptions {
    
    @scala.inline
    def apply(): StandardBehaviorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardBehaviorOptions]
    }
    
    @scala.inline
    implicit class StandardBehaviorOptionsMutableBuilder[Self <: StandardBehaviorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
}
