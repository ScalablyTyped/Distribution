package typings.redboxReact

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redbox-react", JSImport.Default)
  @js.native
  class default ()
    extends Component[RedBoxProps, js.Object, js.Any]
  
  @JSImport("redbox-react", "RedBoxError")
  @js.native
  class RedBoxError protected ()
    extends Component[RedBoxProps, js.Object, js.Any] {
    def this(props: RedBoxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RedBoxProps, context: js.Any) = this()
  }
  
  type RedBox = Component[RedBoxProps, js.Object, js.Any]
  
  trait RedBoxProps
    extends StObject
       with Props[RedBoxError] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var editorScheme: js.UndefOr[String] = js.undefined
    
    var error: Error
    
    var filename: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var useColumns: js.UndefOr[Boolean] = js.undefined
    
    var useLines: js.UndefOr[Boolean] = js.undefined
  }
  object RedBoxProps {
    
    inline def apply(error: Error): RedBoxProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedBoxProps]
    }
    
    extension [Self <: RedBoxProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEditorScheme(value: String): Self = StObject.set(x, "editorScheme", value.asInstanceOf[js.Any])
      
      inline def setEditorSchemeUndefined: Self = StObject.set(x, "editorScheme", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseColumns(value: Boolean): Self = StObject.set(x, "useColumns", value.asInstanceOf[js.Any])
      
      inline def setUseColumnsUndefined: Self = StObject.set(x, "useColumns", js.undefined)
      
      inline def setUseLines(value: Boolean): Self = StObject.set(x, "useLines", value.asInstanceOf[js.Any])
      
      inline def setUseLinesUndefined: Self = StObject.set(x, "useLines", js.undefined)
    }
  }
}
