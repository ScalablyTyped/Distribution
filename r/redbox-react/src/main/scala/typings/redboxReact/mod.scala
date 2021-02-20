package typings.redboxReact

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait RedBoxProps extends Props[RedBoxError] {
    
    var className: js.UndefOr[String] = js.native
    
    var editorScheme: js.UndefOr[String] = js.native
    
    var error: Error = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var useColumns: js.UndefOr[Boolean] = js.native
    
    var useLines: js.UndefOr[Boolean] = js.native
  }
  object RedBoxProps {
    
    @scala.inline
    def apply(error: Error): RedBoxProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedBoxProps]
    }
    
    @scala.inline
    implicit class RedBoxPropsMutableBuilder[Self <: RedBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEditorScheme(value: String): Self = StObject.set(x, "editorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorSchemeUndefined: Self = StObject.set(x, "editorScheme", js.undefined)
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseColumns(value: Boolean): Self = StObject.set(x, "useColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseColumnsUndefined: Self = StObject.set(x, "useColumns", js.undefined)
      
      @scala.inline
      def setUseLines(value: Boolean): Self = StObject.set(x, "useLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLinesUndefined: Self = StObject.set(x, "useLines", js.undefined)
    }
  }
}
