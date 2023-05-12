package typings.scrollIntoViewIfNeeded

import typings.computeScrollIntoView.mod.ScrollAction
import typings.std.Element
import typings.std.ScrollBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scroll-into-view-if-needed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Scrolls the given element into view, with options for when, and how.
    * Supports the same `options` as [`Element.prototype.scrollIntoView`](https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView) with additions such as `scrollMode`, `behavior: Function` and `skipOverflowHiddenElements`.
    * @public
    */
  inline def default(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(target: Element, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(target: Element, options: StandardBehaviorOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Scrolls the given element into view, with options for when, and how.
    * Supports the same `options` as [`Element.prototype.scrollIntoView`](https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView) with additions such as `scrollMode`, `behavior: Function` and `skipOverflowHiddenElements`.
    *
    * You can set the expected return type for `behavior: Function`:
    * ```ts
    * await scrollIntoView<Promise<boolean[]>>(node, {
    *   behavior: async actions => {
    *     return Promise.all(actions.map(
    *       // animate() resolves to `true` if anything was animated, `false` if the element already were in the end state
    *       ({ el, left, top }) => animate(el, {scroll: {left, top}})
    *     ))
    *   }
    * })
    * ```
    * @public
    */
  inline def default[T](target: Element, options: CustomBehaviorOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait CustomBehaviorOptions[T]
    extends StObject
       with typings.computeScrollIntoView.mod.Options
       with Options[T] {
    
    def behavior(actions: js.Array[ScrollAction]): T
    @JSName("behavior")
    var behavior_Original: CustomScrollBehaviorCallback[T]
  }
  object CustomBehaviorOptions {
    
    inline def apply[T](behavior: /* actions */ js.Array[ScrollAction] => T): CustomBehaviorOptions[T] = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction1(behavior))
      __obj.asInstanceOf[CustomBehaviorOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomBehaviorOptions[?], T] (val x: Self & CustomBehaviorOptions[T]) extends AnyVal {
      
      inline def setBehavior(value: /* actions */ js.Array[ScrollAction] => T): Self = StObject.set(x, "behavior", js.Any.fromFunction1(value))
    }
  }
  
  type CustomScrollBehaviorCallback[T] = js.Function1[/* actions */ js.Array[ScrollAction], T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.scrollIntoViewIfNeeded.mod.StandardBehaviorOptions
    - typings.scrollIntoViewIfNeeded.mod.CustomBehaviorOptions[T]
  */
  trait Options[T] extends StObject
  object Options {
    
    inline def CustomBehaviorOptions[T](behavior: /* actions */ js.Array[ScrollAction] => T): typings.scrollIntoViewIfNeeded.mod.CustomBehaviorOptions[T] = {
      val __obj = js.Dynamic.literal(behavior = js.Any.fromFunction1(behavior))
      __obj.asInstanceOf[typings.scrollIntoViewIfNeeded.mod.CustomBehaviorOptions[T]]
    }
    
    inline def StandardBehaviorOptions(): typings.scrollIntoViewIfNeeded.mod.StandardBehaviorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.scrollIntoViewIfNeeded.mod.StandardBehaviorOptions]
    }
  }
  
  trait StandardBehaviorOptions
    extends StObject
       with typings.computeScrollIntoView.mod.Options
       with Options[Any] {
    
    /**
      * @defaultValue 'auto
      */
    var behavior: js.UndefOr[ScrollBehavior] = js.undefined
  }
  object StandardBehaviorOptions {
    
    inline def apply(): StandardBehaviorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardBehaviorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StandardBehaviorOptions] (val x: Self) extends AnyVal {
      
      inline def setBehavior(value: ScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
}
