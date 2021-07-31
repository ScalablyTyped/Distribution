package typings.reactFileInput

import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FileInputProps, js.Object, js.Any]
  
  type FileInput = Component[FileInputProps, js.Object, js.Any]
  
  trait FileInputProps extends StObject {
    
    var accept: String
    
    var className: String
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    def onChange(event: SyntheticEvent[js.Any, Event]): Unit
    
    var placeholder: String
  }
  object FileInputProps {
    
    @scala.inline
    def apply(
      accept: String,
      className: String,
      name: String,
      onChange: SyntheticEvent[js.Any, Event] => Unit,
      placeholder: String
    ): FileInputProps = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInputProps]
    }
    
    @scala.inline
    implicit class FileInputPropsMutableBuilder[Self <: FileInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[js.Any, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
