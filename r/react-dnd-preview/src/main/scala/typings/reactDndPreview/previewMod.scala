package typings.reactDndPreview

import typings.reactDndPreview.contextMod.PreviewState
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("react-dnd-preview/dist/cjs/Preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
  
  type PreviewGenerator[T, El /* <: Element */] = js.Function1[/* state */ PreviewState[T, El], typings.react.mod.global.JSX.Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDndPreview.anon.Children[T, El]
    - typings.reactDndPreview.anon.Generator[T, El]
  */
  trait PreviewProps[T, El /* <: Element */] extends StObject
  object PreviewProps {
    
    inline def Children[T, El /* <: Element */](): typings.reactDndPreview.anon.Children[T, El] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDndPreview.anon.Children[T, El]]
    }
    
    inline def Generator[T, El /* <: Element */](generator: /* state */ PreviewState[T, El] => typings.react.mod.global.JSX.Element): typings.reactDndPreview.anon.Generator[T, El] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[typings.reactDndPreview.anon.Generator[T, El]]
    }
  }
}
