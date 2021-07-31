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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](classes: Classes[T], activations: js.Any*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(classes.asInstanceOf[js.Any], activations.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def hover[A](component: ComponentClass[A, ComponentState]): ComponentClass[A, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A, ComponentState]]
  @scala.inline
  def hover[A](component: StatelessComponent[A]): ComponentClass[A, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[A, ComponentState]]
  
  @scala.inline
  def loop(index: Double, length: Double): LoopableProps = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LoopableProps]
  
  type CSS = CSSProperties
  
  trait Classes[T]
    extends StObject
       with /* scope */ StringDictionary[Partial[T]] {
    
    var default: Partial[T]
  }
  object Classes {
    
    @scala.inline
    def apply[T](default: Partial[T]): Classes[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes[T]]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes[?], T] (val x: Self & Classes[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Partial[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait HoverProps[T]
    extends StObject
       with Props[T] {
    
    var hover: js.UndefOr[Boolean] = js.undefined
  }
  object HoverProps {
    
    @scala.inline
    def apply[T](): HoverProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverProps[T]]
    }
    
    @scala.inline
    implicit class HoverPropsMutableBuilder[Self <: HoverProps[?], T] (val x: Self & HoverProps[T]) extends AnyVal {
      
      @scala.inline
      def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
  
  trait LoopableProps
    extends StObject
       with Props[js.Any] {
    
    var even: js.UndefOr[Boolean] = js.undefined
    
    var `first-child`: js.UndefOr[Boolean] = js.undefined
    
    var `last-child`: js.UndefOr[Boolean] = js.undefined
    
    var `nth-child`: Double
    
    var odd: js.UndefOr[Boolean] = js.undefined
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
