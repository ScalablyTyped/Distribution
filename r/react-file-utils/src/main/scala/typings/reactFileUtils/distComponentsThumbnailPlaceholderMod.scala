package typings.reactFileUtils

import typings.react.mod.global.JSX.Element
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsThumbnailPlaceholderMod {
  
  @JSImport("react-file-utils/dist/components/ThumbnailPlaceholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThumbnailPlaceholder(param0: ThumbnailPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThumbnailPlaceholder")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ThumbnailPlaceholderProps extends StObject {
    
    def handleFiles(files: js.Array[File]): Unit
    
    var multiple: Boolean
  }
  object ThumbnailPlaceholderProps {
    
    inline def apply(handleFiles: js.Array[File] => Unit, multiple: Boolean): ThumbnailPlaceholderProps = {
      val __obj = js.Dynamic.literal(handleFiles = js.Any.fromFunction1(handleFiles), multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbnailPlaceholderProps]
    }
    
    extension [Self <: ThumbnailPlaceholderProps](x: Self) {
      
      inline def setHandleFiles(value: js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
}
