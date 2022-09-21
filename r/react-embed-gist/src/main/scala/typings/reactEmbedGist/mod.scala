package typings.reactEmbedGist

import typings.react.mod.Component
import typings.reactEmbedGist.reactEmbedGistStrings.DollarLeftcurlybracketstringRightcurlybracketSlashDollarLeftcurlybracketstringRightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-embed-gist", JSImport.Default)
  @js.native
  open class default () extends ReactEmbedGist
  
  trait Props extends StObject {
    
    var contentClass: js.UndefOr[String] = js.undefined
    
    var errorClass: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var gist: DollarLeftcurlybracketstringRightcurlybracketSlashDollarLeftcurlybracketstringRightcurlybracket
    
    var loadingClass: js.UndefOr[String] = js.undefined
    
    var titleClass: js.UndefOr[String] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(gist = "${string}/${string}")
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setContentClass(value: String): Self = StObject.set(x, "contentClass", value.asInstanceOf[js.Any])
      
      inline def setContentClassUndefined: Self = StObject.set(x, "contentClass", js.undefined)
      
      inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
      
      inline def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setGist(
        value: DollarLeftcurlybracketstringRightcurlybracketSlashDollarLeftcurlybracketstringRightcurlybracket
      ): Self = StObject.set(x, "gist", value.asInstanceOf[js.Any])
      
      inline def setLoadingClass(value: String): Self = StObject.set(x, "loadingClass", value.asInstanceOf[js.Any])
      
      inline def setLoadingClassUndefined: Self = StObject.set(x, "loadingClass", js.undefined)
      
      inline def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
      
      inline def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
    }
  }
  
  @js.native
  trait ReactEmbedGist
    extends Component[Props, js.Object, Any]
}
