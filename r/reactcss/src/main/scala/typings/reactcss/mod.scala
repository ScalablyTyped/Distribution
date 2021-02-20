package typings.reactcss

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Props
import typings.react.mod.StatelessComponent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactcss", JSImport.Default)
  @js.native
  def default[T](classes: Classes[T], activations: js.Any*): T = js.native
  
  @JSImport("reactcss", "hover")
  @js.native
  def hover[A](component: ComponentClass[A, ComponentState]): ComponentClass[A, ComponentState] = js.native
  @JSImport("reactcss", "hover")
  @js.native
  def hover[A](component: StatelessComponent[A]): ComponentClass[A, ComponentState] = js.native
  
  @JSImport("reactcss", "loop")
  @js.native
  def loop(index: Double, length: Double): LoopableProps = js.native
  
  type CSS = CSSProperties
  
  @js.native
  trait Classes[T] extends /* scope */ StringDictionary[Partial[T]] {
    
    var default: Partial[T] = js.native
  }
  object Classes {
    
    @scala.inline
    def apply[T](default: Partial[T]): Classes[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes[T]]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes[_], T] (val x: Self with Classes[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Partial[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HoverProps[T] extends Props[T] {
    
    var hover: js.UndefOr[Boolean] = js.native
  }
  object HoverProps {
    
    @scala.inline
    def apply[T](): HoverProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverProps[T]]
    }
    
    @scala.inline
    implicit class HoverPropsMutableBuilder[Self <: HoverProps[_], T] (val x: Self with HoverProps[T]) extends AnyVal {
      
      @scala.inline
      def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
  
  @js.native
  trait LoopableProps
    extends Props[js.Any] {
    
    var even: js.UndefOr[Boolean] = js.native
    
    var `first-child`: js.UndefOr[Boolean] = js.native
    
    var `last-child`: js.UndefOr[Boolean] = js.native
    
    var `nth-child`: Double = js.native
    
    var odd: js.UndefOr[Boolean] = js.native
  }
  object LoopableProps {
    
    @scala.inline
    def apply(`nth-child`: Double): LoopableProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("nth-child")(`nth-child`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoopableProps]
    }
    
    @scala.inline
    implicit class LoopablePropsMutableBuilder[Self <: LoopableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEven(value: Boolean): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      @scala.inline
      def `setFirst-child`(value: Boolean): Self = StObject.set(x, "first-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFirst-childUndefined`: Self = StObject.set(x, "first-child", js.undefined)
      
      @scala.inline
      def `setLast-child`(value: Boolean): Self = StObject.set(x, "last-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLast-childUndefined`: Self = StObject.set(x, "last-child", js.undefined)
      
      @scala.inline
      def `setNth-child`(value: Double): Self = StObject.set(x, "nth-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOdd(value: Boolean): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
    }
  }
}
