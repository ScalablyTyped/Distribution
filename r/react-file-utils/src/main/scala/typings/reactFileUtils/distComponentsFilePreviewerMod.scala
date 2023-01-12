package typings.reactFileUtils

import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.distComponentsFileIconFileIconMod.FileIconProps
import typings.reactFileUtils.distTypesMod.FileUpload
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFilePreviewerMod {
  
  @JSImport("react-file-utils/dist/components/FilePreviewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FilePreviewer(param0: FilePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePreviewer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FilePreviewerProps extends StObject {
    
    var fileIconProps: js.UndefOr[FileIconProps] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ FileList, Unit]] = js.undefined
    
    var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var uploads: js.UndefOr[js.Array[FileUpload]] = js.undefined
  }
  object FilePreviewerProps {
    
    inline def apply(): FilePreviewerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePreviewerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePreviewerProps] (val x: Self) extends AnyVal {
      
      inline def setFileIconProps(value: FileIconProps): Self = StObject.set(x, "fileIconProps", value.asInstanceOf[js.Any])
      
      inline def setFileIconPropsUndefined: Self = StObject.set(x, "fileIconProps", js.undefined)
      
      inline def setHandleFiles(value: /* files */ FileList => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setHandleRemove(value: /* id */ String => Unit): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      inline def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      inline def setHandleRetry(value: /* id */ String => Unit): Self = StObject.set(x, "handleRetry", js.Any.fromFunction1(value))
      
      inline def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      inline def setUploads(value: js.Array[FileUpload]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      inline def setUploadsVarargs(value: FileUpload*): Self = StObject.set(x, "uploads", js.Array(value*))
    }
  }
}
