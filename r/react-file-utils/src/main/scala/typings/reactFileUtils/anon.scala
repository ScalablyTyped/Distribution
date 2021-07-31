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
    
    @scala.inline
    def apply(): Accept = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accept]
    }
    
    @scala.inline
    implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String | js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[FileLike] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
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
    
    @scala.inline
    def apply(): Accepts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accepts]
    }
    
    @scala.inline
    implicit class AcceptsMutableBuilder[Self <: Accepts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: String | js.Array[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: String*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[Blob] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object BackgroundColor {
    
    @scala.inline
    def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(): Big = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Big]
    }
    
    @scala.inline
    implicit class BigMutableBuilder[Self <: Big] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBig(value: Boolean): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigUndefined: Self = StObject.set(x, "big", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
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
    
    @scala.inline
    def apply(): Disabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setHandleRemove(value: /* id */ String => Unit): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      @scala.inline
      def setHandleRetry(value: /* id */ String => Unit): Self = StObject.set(x, "handleRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      @scala.inline
      def setImageUploads(value: js.Array[ImageUpload]): Self = StObject.set(x, "imageUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUploadsUndefined: Self = StObject.set(x, "imageUploads", js.undefined)
      
      @scala.inline
      def setImageUploadsVarargs(value: ImageUpload*): Self = StObject.set(x, "imageUploads", js.Array(value :_*))
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
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
    
    @scala.inline
    def apply(): HandleClose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClose]
    }
    
    @scala.inline
    implicit class HandleCloseMutableBuilder[Self <: HandleClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleClose(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "handleClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleCloseUndefined: Self = StObject.set(x, "handleClose", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setImgSrc(value: js.Any): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait HandleFiles extends StObject {
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var uploads: js.UndefOr[js.Array[FileUpload]] = js.undefined
  }
  object HandleFiles {
    
    @scala.inline
    def apply(): HandleFiles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleFiles]
    }
    
    @scala.inline
    implicit class HandleFilesMutableBuilder[Self <: HandleFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setHandleRemove(value: /* id */ String => Unit): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      @scala.inline
      def setHandleRetry(value: /* id */ String => Unit): Self = StObject.set(x, "handleRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      @scala.inline
      def setUploads(value: js.Array[FileUpload]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      @scala.inline
      def setUploadsVarargs(value: FileUpload*): Self = StObject.set(x, "uploads", js.Array(value :_*))
    }
  }
  
  trait Multiple extends StObject {
    
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object Multiple {
    
    @scala.inline
    def apply(): Multiple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiple]
    }
    
    @scala.inline
    implicit class MultipleMutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
  
  trait OnClick extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  }
  object OnClick {
    
    @scala.inline
    def apply(): OnClick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnClick]
    }
    
    @scala.inline
    implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
