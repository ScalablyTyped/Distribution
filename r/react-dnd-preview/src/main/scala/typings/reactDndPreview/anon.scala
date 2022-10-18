package typings.reactDndPreview

import typings.react.mod.ReactNode
import typings.reactDndPreview.distEsmContextMod.PreviewState
import typings.reactDndPreview.distEsmPreviewMod.PreviewGenerator
import typings.reactDndPreview.distEsmPreviewMod.PreviewProps
import typings.reactDndPreview.distEsmUsePreviewMod.usePreviewState
import typings.reactDndPreview.reactDndPreviewBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T, El /* <: Element */]
    extends StObject
       with PreviewProps[T, El] {
    
    var children: (PreviewGenerator[T, El]) | ReactNode
  }
  object `0` {
    
    inline def apply[T, El /* <: Element */](): `0`[T, El] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[T, El]]
    }
    
    extension [Self <: `0`[?, ?], T, El /* <: Element */](x: Self & (`0`[T, El])) {
      
      inline def setChildren(value: (PreviewGenerator[T, El]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* state */ PreviewState[T, El] => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Children[T, El /* <: Element */]
    extends StObject
       with typings.reactDndPreview.distCjsPreviewMod.PreviewProps[T, El] {
    
    var children: (typings.reactDndPreview.distCjsPreviewMod.PreviewGenerator[T, El]) | ReactNode
  }
  object Children {
    
    inline def apply[T, El /* <: Element */](): Children[T, El] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[T, El]]
    }
    
    extension [Self <: Children[?, ?], T, El /* <: Element */](x: Self & (Children[T, El])) {
      
      inline def setChildren(value: (typings.reactDndPreview.distCjsPreviewMod.PreviewGenerator[T, El]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(
        value: /* state */ typings.reactDndPreview.distCjsContextMod.PreviewState[T, El] => typings.react.mod.global.JSX.Element
      ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Display
    extends StObject
       with usePreviewState[Any, Any]
       with typings.reactDndPreview.distCjsUsePreviewMod.usePreviewState[Any, Any] {
    
    var display: `false`
  }
  object Display {
    
    inline def apply(): Display = {
      val __obj = js.Dynamic.literal(display = false)
      __obj.asInstanceOf[Display]
    }
    
    extension [Self <: Display](x: Self) {
      
      inline def setDisplay(value: `false`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
  
  trait Generator[T, El /* <: Element */]
    extends StObject
       with typings.reactDndPreview.distCjsPreviewMod.PreviewProps[T, El] {
    
    var generator: typings.reactDndPreview.distCjsPreviewMod.PreviewGenerator[T, El]
  }
  object Generator {
    
    inline def apply[T, El /* <: Element */](
      generator: /* state */ typings.reactDndPreview.distCjsContextMod.PreviewState[T, El] => typings.react.mod.global.JSX.Element
    ): Generator[T, El] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[Generator[T, El]]
    }
    
    extension [Self <: Generator[?, ?], T, El /* <: Element */](x: Self & (Generator[T, El])) {
      
      inline def setGenerator(
        value: /* state */ typings.reactDndPreview.distCjsContextMod.PreviewState[T, El] => typings.react.mod.global.JSX.Element
      ): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
    }
  }
  
  trait GeneratorPreviewGenerator[T, El /* <: Element */]
    extends StObject
       with PreviewProps[T, El] {
    
    var generator: PreviewGenerator[T, El]
  }
  object GeneratorPreviewGenerator {
    
    inline def apply[T, El /* <: Element */](generator: /* state */ PreviewState[T, El] => typings.react.mod.global.JSX.Element): GeneratorPreviewGenerator[T, El] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[GeneratorPreviewGenerator[T, El]]
    }
    
    extension [Self <: GeneratorPreviewGenerator[?, ?], T, El /* <: Element */](x: Self & (GeneratorPreviewGenerator[T, El])) {
      
      inline def setGenerator(value: /* state */ PreviewState[T, El] => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
    }
  }
}
