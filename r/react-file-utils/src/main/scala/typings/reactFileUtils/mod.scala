package typings.reactFileUtils

import typings.react.mod.Component
import typings.react.mod.PureComponent
import typings.reactFileUtils.anon.Accept
import typings.reactFileUtils.anon.Accepts
import typings.reactFileUtils.anon.BackgroundColor
import typings.reactFileUtils.anon.Big
import typings.reactFileUtils.anon.Children
import typings.reactFileUtils.anon.Disabled
import typings.reactFileUtils.anon.HandleClose
import typings.reactFileUtils.anon.HandleFiles
import typings.reactFileUtils.anon.Multiple
import typings.reactFileUtils.anon.OnClick
import typings.std.Blob
import typings.std.DataTransferItem
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-file-utils", "AttachmentIcon")
  @js.native
  class AttachmentIcon protected ()
    extends PureComponent[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FileIcon")
  @js.native
  class FileIcon protected ()
    extends Component[Big, js.Object, js.Any] {
    def this(props: Big) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Big, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FilePreviewer")
  @js.native
  class FilePreviewer protected ()
    extends Component[HandleFiles, js.Object, js.Any] {
    def this(props: HandleFiles) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HandleFiles, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FileUploadButton")
  @js.native
  class FileUploadButton protected ()
    extends Component[Accepts, js.Object, js.Any] {
    def this(props: Accepts) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Accepts, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "IconButton")
  @js.native
  class IconButton protected ()
    extends Component[OnClick, js.Object, js.Any] {
    def this(props: OnClick) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnClick, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImageDropzone")
  @js.native
  class ImageDropzone protected ()
    extends Component[Accept, js.Object, js.Any] {
    def this(props: Accept) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Accept, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImagePreviewer")
  @js.native
  class ImagePreviewer protected ()
    extends Component[Disabled, js.Object, js.Any] {
    def this(props: Disabled) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Disabled, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImageUploadButton")
  @js.native
  class ImageUploadButton protected ()
    extends Component[Children, js.Object, js.Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "LoadingIndicator")
  @js.native
  class LoadingIndicator protected ()
    extends Component[BackgroundColor, js.Object, js.Any] {
    def this(props: BackgroundColor) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackgroundColor, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "PictureIcon")
  @js.native
  class PictureIcon protected ()
    extends PureComponent[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "Thumbnail")
  @js.native
  class Thumbnail protected ()
    extends Component[HandleClose, js.Object, js.Any] {
    def this(props: HandleClose) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HandleClose, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ThumbnailPlaceholder")
  @js.native
  class ThumbnailPlaceholder protected ()
    extends Component[Multiple, js.Object, js.Any] {
    def this(props: Multiple) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Multiple, context: js.Any) = this()
  }
  
  inline def dataTransferItemsHaveFiles(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")().asInstanceOf[Boolean]
  inline def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")().asInstanceOf[js.Promise[js.Array[FileLike]]]
  inline def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")(items.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileLike]]]
  
  type FileLike = Blob | File
  
  trait FileUpload
    extends StObject
       with UploadInfo {
    
    var file: File
  }
  object FileUpload {
    
    inline def apply(file: File, id: String, state: UploadState): FileUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUpload]
    }
    
    extension [Self <: FileUpload](x: Self) {
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageUpload
    extends StObject
       with UploadInfo {
    
    var file: Blob | File
    
    var previewUri: js.UndefOr[String] = js.undefined
  }
  object ImageUpload {
    
    inline def apply(file: Blob | File, id: String, state: UploadState): ImageUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUpload]
    }
    
    extension [Self <: ImageUpload](x: Self) {
      
      inline def setFile(value: Blob | File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPreviewUri(value: String): Self = StObject.set(x, "previewUri", value.asInstanceOf[js.Any])
      
      inline def setPreviewUriUndefined: Self = StObject.set(x, "previewUri", js.undefined)
    }
  }
  
  trait UploadInfo extends StObject {
    
    var id: String
    
    var state: UploadState
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UploadInfo {
    
    inline def apply(id: String, state: UploadState): UploadInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    extension [Self <: UploadInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: UploadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFileUtils.reactFileUtilsStrings.uploading
    - typings.reactFileUtils.reactFileUtilsStrings.finished
    - typings.reactFileUtils.reactFileUtilsStrings.failed
  */
  trait UploadState extends StObject
  object UploadState {
    
    inline def failed: typings.reactFileUtils.reactFileUtilsStrings.failed = "failed".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.failed]
    
    inline def finished: typings.reactFileUtils.reactFileUtilsStrings.finished = "finished".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.finished]
    
    inline def uploading: typings.reactFileUtils.reactFileUtilsStrings.uploading = "uploading".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.uploading]
  }
}
