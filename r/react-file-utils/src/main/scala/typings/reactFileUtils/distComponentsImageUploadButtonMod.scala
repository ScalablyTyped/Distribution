package typings.reactFileUtils

import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsImageUploadButtonMod {
  
  @JSImport("react-file-utils/dist/components/ImageUploadButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImageUploadButton(param0: PropsWithChildren[ImageUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageUploadButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ImageUploadButtonProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def handleFiles(files: js.Array[File]): Unit
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var resetOnChange: js.UndefOr[Boolean] = js.undefined
  }
  object ImageUploadButtonProps {
    
    inline def apply(handleFiles: js.Array[File] => Unit): ImageUploadButtonProps = {
      val __obj = js.Dynamic.literal(handleFiles = js.Any.fromFunction1(handleFiles))
      __obj.asInstanceOf[ImageUploadButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageUploadButtonProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setResetOnChange(value: Boolean): Self = StObject.set(x, "resetOnChange", value.asInstanceOf[js.Any])
      
      inline def setResetOnChangeUndefined: Self = StObject.set(x, "resetOnChange", js.undefined)
    }
  }
}
