package typings.scrollIntoViewIfNeeded

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-into-view-if-needed", JSImport.Default)
  @js.native
  def default(target: Element): Unit = js.native
  @JSImport("scroll-into-view-if-needed", JSImport.Default)
  @js.native
  def default(target: Element, options: Boolean): Unit = js.native
  @JSImport("scroll-into-view-if-needed", JSImport.Default)
  @js.native
  def default(target: Element, options: Options[_]): Unit = js.native
  @JSImport("scroll-into-view-if-needed", JSImport.Default)
  @js.native
  def default[T](target: Element, options: CustomBehaviorOptions[T]): T = js.native
  
  @js.native
  trait CustomBehaviorOptions[T]
    extends typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    def behavior(actions: js.Array[CustomScrollAction]): T = js.native
    @JSName("behavior")
    var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  }
  
  @js.native
  trait Options[T]
    extends typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: ScrollBehavior | CustomScrollBehaviorCallback[T]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorFunction1(value: /* actions */ js.Array[CustomScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
  
  @js.native
  trait StandardBehaviorOptions
    extends typings.scrollIntoViewIfNeeded.typesMod.Options {
    
    var behavior: js.UndefOr[ScrollBehavior] = js.native
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
