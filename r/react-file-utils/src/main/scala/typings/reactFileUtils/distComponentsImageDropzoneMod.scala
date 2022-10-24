package typings.reactFileUtils

import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.File
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsImageDropzoneMod {
  
  @JSImport("react-file-utils/dist/components/ImageDropzone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImageDropzone(param0: PropsWithChildren[ImageDropzoneProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageDropzone")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ImageDropzoneProps extends StObject {
    
    /**
      * Set accepted file types. See https://github.com/okonet/attr-accept for more information. Keep in mind that mime type determination is not reliable across platforms. CSV files, for example, are reported as text/plain under macOS but as application/vnd.ms-excel under Windows. In some cases there might not be a mime type set at all.
      *
      * One of type: `string, string[]`
      */
    var accept: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Enable/disable the dropzone */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ FileList | js.Array[File], Unit]] = js.undefined
    
    var maxNumberOfFiles: js.UndefOr[Double] = js.undefined
    
    /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object ImageDropzoneProps {
    
    inline def apply(): ImageDropzoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDropzoneProps]
    }
    
    extension [Self <: ImageDropzoneProps](x: Self) {
      
      inline def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ FileList | js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setMaxNumberOfFiles(value: Double): Self = StObject.set(x, "maxNumberOfFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxNumberOfFilesUndefined: Self = StObject.set(x, "maxNumberOfFiles", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}
