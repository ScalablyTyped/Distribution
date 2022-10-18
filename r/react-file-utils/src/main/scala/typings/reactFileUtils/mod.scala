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
  
  inline def FilePreviewer(hasFileIconPropsUploadsHandleRemoveHandleRetry: FilePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePreviewer")(hasFileIconPropsUploadsHandleRemoveHandleRetry.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileUploadButton(
    hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange: PropsWithChildren[FileUploadButtonProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileUploadButton")(hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IconButton(hasOnClickChildren: PropsWithChildren[IconButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconButton")(hasOnClickChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageDropzone(
    hasHandleFilesMaxNumberOfFilesChildrenAcceptMultipleDisabled: PropsWithChildren[ImageDropzoneProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageDropzone")(hasHandleFilesMaxNumberOfFilesChildrenAcceptMultipleDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImagePreviewer(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles: ImagePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImagePreviewer")(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageUploadButton(hasMultipleDisabledHandleFilesChildrenResetOnChange: PropsWithChildren[ImageUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageUploadButton")(hasMultipleDisabledHandleFilesChildrenResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def LoadingIndicator(hasSizeWidthBackgroundColorColor: LoadingIndicatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadingIndicator")(hasSizeWidthBackgroundColorColor.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PictureIcon(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PictureIcon")().asInstanceOf[Element]
  
  inline def Thumbnail(hasImageSizeHandleCloseAlt: ThumbnailProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Thumbnail")(hasImageSizeHandleCloseAlt.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ThumbnailPlaceholder(hasMultipleHandleFiles: ThumbnailPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThumbnailPlaceholder")(hasMultipleHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def UploadButton(hasResetOnChangeOnFileChangeRest: UploadButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UploadButton")(hasResetOnChangeOnFileChangeRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def dataTransferItemsHaveFiles(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")().asInstanceOf[Boolean]
  inline def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")().asInstanceOf[js.Promise[js.Array[FileLike]]]
  inline def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")(items.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileLike]]]
}
