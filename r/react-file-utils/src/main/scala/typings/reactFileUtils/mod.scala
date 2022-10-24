package typings.reactFileUtils

import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.distComponentsFileIconFileIconMod.FileIconProps
import typings.reactFileUtils.distComponentsFilePreviewerMod.FilePreviewerProps
import typings.reactFileUtils.distComponentsFileUploadButtonMod.FileUploadButtonProps
import typings.reactFileUtils.distComponentsIconButtonMod.IconButtonProps
import typings.reactFileUtils.distComponentsImageDropzoneMod.ImageDropzoneProps
import typings.reactFileUtils.distComponentsImagePreviewerMod.ImagePreviewerProps
import typings.reactFileUtils.distComponentsImageUploadButtonMod.ImageUploadButtonProps
import typings.reactFileUtils.distComponentsLoadingIndicatorMod.LoadingIndicatorProps
import typings.reactFileUtils.distComponentsThumbnailMod.ThumbnailProps
import typings.reactFileUtils.distComponentsThumbnailPlaceholderMod.ThumbnailPlaceholderProps
import typings.reactFileUtils.distComponentsUploadButtonMod.UploadButtonProps
import typings.reactFileUtils.distTypesMod.FileLike
import typings.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AttachmentIcon(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AttachmentIcon")().asInstanceOf[Element]
  
  inline def FileIcon(props: FileIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePreviewer(param0: FilePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePreviewer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileUploadButton(param0: PropsWithChildren[FileUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileUploadButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IconButton(param0: PropsWithChildren[IconButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageDropzone(param0: PropsWithChildren[ImageDropzoneProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageDropzone")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImagePreviewer(param0: ImagePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImagePreviewer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageUploadButton(param0: PropsWithChildren[ImageUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageUploadButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def LoadingIndicator(param0: LoadingIndicatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadingIndicator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PictureIcon(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PictureIcon")().asInstanceOf[Element]
  
  inline def Thumbnail(param0: ThumbnailProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Thumbnail")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ThumbnailPlaceholder(param0: ThumbnailPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThumbnailPlaceholder")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def UploadButton(param0: UploadButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UploadButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def dataTransferItemsHaveFiles(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")().asInstanceOf[Boolean]
  inline def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")().asInstanceOf[js.Promise[js.Array[FileLike]]]
  inline def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")(items.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileLike]]]
}
