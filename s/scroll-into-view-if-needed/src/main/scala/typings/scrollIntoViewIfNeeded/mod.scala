package typings.scrollIntoViewIfNeeded

import typings.scrollIntoViewIfNeeded.typingsTypesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typingsTypesMod.CustomScrollBehaviorCallback
import typings.scrollIntoViewIfNeeded.typingsTypesMod.ScrollBehavior
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-into-view-if-needed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(target: Element, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(target: Element, options: Options[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T](target: Element, options: CustomBehaviorOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait CustomBehaviorOptions[T]
    extends StObject
       with typings.scrollIntoViewIfNeeded.typingsTypesMod.Options {
    
    def behavior(actions: js.Array[CustomScrollAction]): T
    @JSName("behavior")
    var behavior_Original: CustomScrollBehaviorCallback[T]
  }
  object CustomBehaviorOptions {
    
    inline def apply[T](behavior: /* actions */ js.Array[CustomScrollAction] => T): CustomBehaviorOptions[T] = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction1(behavior))
      __obj.asInstanceOf[CustomBehaviorOptions[T]]
    }
    
    extension [Self <: CustomBehaviorOptions[?], T](x: Self & CustomBehaviorOptions[T]) {
      
      inline def setBehavior(value: /* actions */ js.Array[CustomScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
    }
  }
  
  trait Options[T]
    extends StObject
       with typings.scrollIntoViewIfNeeded.typingsTypesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setBehavior(value: ScrollBehavior | CustomScrollBehaviorCallback[T]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorFunction1(value: /* actions */ js.Array[CustomScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
  
  trait StandardBehaviorOptions
    extends StObject
       with typings.scrollIntoViewIfNeeded.typingsTypesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior] = js.undefined
  }
  object StandardBehaviorOptions {
    
    inline def apply(): StandardBehaviorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardBehaviorOptions]
    }
    
    extension [Self <: StandardBehaviorOptions](x: Self) {
      
      inline def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
}
