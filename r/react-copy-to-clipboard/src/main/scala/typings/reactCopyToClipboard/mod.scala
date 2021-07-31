package typings.reactCopyToClipboard

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactCopyToClipboard.reactCopyToClipboardStrings.textSlashhtml
import typings.reactCopyToClipboard.reactCopyToClipboardStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-copy-to-clipboard", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[Props, js.Object, js.Any]
  
  type CopyToClipboard = Component[Props, js.Object, js.Any]
  
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[textSlashhtml | textSlashplain] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFormat(value: textSlashhtml | textSlashplain): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var onCopy: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var text: String
  }
  object Props {
    
    @scala.inline
    def apply(text: String): Props = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnCopy(value: (/* text */ String, /* result */ Boolean) => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
