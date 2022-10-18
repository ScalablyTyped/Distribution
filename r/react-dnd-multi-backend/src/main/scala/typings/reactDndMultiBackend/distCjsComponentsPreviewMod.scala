package typings.reactDndMultiBackend

import typings.react.mod.Context
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsComponentsPreviewMod {
  
  object Preview {
    
    inline def apply[T, El /* <: Element */](
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> */ Any
    ): typings.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element | Null]
    
    @JSImport("react-dnd-multi-backend/dist/cjs/components/Preview", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend/dist/cjs/components/Preview", "Preview.Context")
    @js.native
    def Context: typings.react.mod.Context[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
        ]
      ] = js.native
    inline def Context_=(
      x: Context[
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  }
}
