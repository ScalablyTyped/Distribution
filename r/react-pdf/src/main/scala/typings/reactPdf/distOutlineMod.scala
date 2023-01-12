package typings.reactPdf

import typings.react.mod.Component
import typings.reactPdf.anon.PageNumber
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOutlineMod {
  
  @JSImport("react-pdf/dist/Outline", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  type Awaited[T] = T
  
  type Outline = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    /**
      * Defines custom class name(s), that will be added to rendered element.
      * @default 'react-pdf__Outline'
      */
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Function called when an outline item has been clicked.
      * Usually, you would like to use this callback to move the user wherever they requested to.
      */
    var onItemClick: js.UndefOr[js.Function1[/* param0 */ PageNumber, Unit]] = js.undefined
    
    /**
      * Function called in case of an error while retrieving the outline.
      */
    var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Function called when the outline is successfully retrieved.
      * Here infer `Outline` type by ts trick, since it is not exposed by `pdfjs-dist`.
      */
    var onLoadSuccess: js.UndefOr[
        js.Function1[
          /* outline */ Awaited[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: react-pdf.react-pdf/dist/Outline.Awaited<std.ReturnType<(src : pdfjs-dist.pdfjs-dist/types/src/display/api.GetDocumentParameters): pdfjs-dist.pdfjs-dist/types/src/display/api.PDFDocumentLoadingTask>['promise']>['getOutline'] */ js.Any
            ]
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setOnItemClick(value: /* param0 */ PageNumber => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnLoadError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadSuccess(
        value: /* outline */ Awaited[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: react-pdf.react-pdf/dist/Outline.Awaited<std.ReturnType<(src : pdfjs-dist.pdfjs-dist/types/src/display/api.GetDocumentParameters): pdfjs-dist.pdfjs-dist/types/src/display/api.PDFDocumentLoadingTask>['promise']>['getOutline'] */ js.Any
              ]
            ] => Unit
      ): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1(value))
      
      inline def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
    }
  }
}
