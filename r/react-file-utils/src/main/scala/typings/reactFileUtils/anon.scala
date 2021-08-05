package typings.reactFileUtils

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactFileUtils.mod.FileLike
import typings.reactFileUtils.mod.FileUpload
import typings.reactFileUtils.mod.ImageUpload
import typings.std.Blob
import typings.std.Element
import typings.std.Event
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accept extends StObject {
    
    /**
      * Set accepted file types. See https://github.com/okonet/attr-accept for more information.
      * Keep in mind that mime type determination is not reliable across platforms.
      * CSV files; for example; are reported as text/plain under macOS but as application/vnd.ms-excel under Windows.
      * In some cases there might not be a mime type set at all.
      *
      * One of type: `string; string[]`
      */
    var accept: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Enable/disable the dropzone */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[FileLike], Unit]] = js.undefined
    
    /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Accept {
    
    inline def apply(): Accept = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accept]
    }
    
    extension [Self <: Accept](x: Self) {
      
      inline def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ js.Array[FileLike] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait Accepts extends StObject {
    
    var accepts: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[Blob], Unit]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Accepts {
    
    inline def apply(): Accepts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accepts]
    }
    
    extension [Self <: Accepts](x: Self) {
      
      inline def setAccepts(value: String | js.Array[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setAcceptsVarargs(value: String*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ js.Array[Blob] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Big extends StObject {
    
    var big: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    // Size used for big icon
    var size: js.UndefOr[Double] = js.undefined
  }
  object Big {
    
    inline def apply(): Big = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Big]
    }
    
    extension [Self <: Big](x: Self) {
      
      inline def setBig(value: Boolean): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      inline def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback to call with newly selected files
      * If this is not provided no 'ThumbnailPlaceholder' will be displayed
      */
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    /** A callback to call when the remove icon is clicked */
    var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    /** A callback to call when the retry icon is clicked */
    var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    /** The list of image uploads that should be displayed */
    var imageUploads: js.UndefOr[js.Array[ImageUpload]] = js.undefined
    
    /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Disabled {
    
    inline def apply(): Disabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setHandleRemove(value: /* id */ String => Unit): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      inline def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      inline def setHandleRetry(value: /* id */ String => Unit): Self = StObject.set(x, "handleRetry", js.Any.fromFunction1(value))
      
      inline def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      inline def setImageUploads(value: js.Array[ImageUpload]): Self = StObject.set(x, "imageUploads", value.asInstanceOf[js.Any])
      
      inline def setImageUploadsUndefined: Self = StObject.set(x, "imageUploads", js.undefined)
      
      inline def setImageUploadsVarargs(value: ImageUpload*): Self = StObject.set(x, "imageUploads", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait HandleClose extends StObject {
    
    var handleClose: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var imgSrc: js.UndefOr[js.Any] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object HandleClose {
    
    inline def apply(): HandleClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClose]
    }
    
    extension [Self <: HandleClose](x: Self) {
      
      inline def setHandleClose(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "handleClose", js.Any.fromFunction1(value))
      
      inline def setHandleCloseUndefined: Self = StObject.set(x, "handleClose", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImgSrc(value: js.Any): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      inline def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HandleFiles extends StObject {
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var uploads: js.UndefOr[js.Array[FileUpload]] = js.undefined
  }
  object HandleFiles {
    
    inline def apply(): HandleFiles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleFiles]
    }
    
    extension [Self <: HandleFiles](x: Self) {
      
      inline def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setHandleRemove(value: /* id */ String => Unit): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      inline def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      inline def setHandleRetry(value: /* id */ String => Unit): Self = StObject.set(x, "handleRetry", js.Any.fromFunction1(value))
      
      inline def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      inline def setUploads(value: js.Array[FileUpload]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      inline def setUploadsVarargs(value: FileUpload*): Self = StObject.set(x, "uploads", js.Array(value :_*))
    }
  }
  
  trait Multiple extends StObject {
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Multiple {
    
    inline def apply(): Multiple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiple]
    }
    
    extension [Self <: Multiple](x: Self) {
      
      inline def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait OnClick extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  }
  object OnClick {
    
    inline def apply(): OnClick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnClick]
    }
    
    extension [Self <: OnClick](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
