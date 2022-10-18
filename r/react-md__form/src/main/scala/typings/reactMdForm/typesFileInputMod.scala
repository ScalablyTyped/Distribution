package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.reactMdFormStrings.max
import typings.reactMdForm.reactMdFormStrings.min
import typings.reactMdForm.reactMdFormStrings.total
import typings.reactMdForm.typesFileInputFileInputMod.FileInputProps
import typings.reactMdForm.typesFileInputUseFileUploadMod.FileUploadHookReturnValue
import typings.reactMdForm.typesFileInputUseFileUploadMod.FileUploadOptions
import typings.reactMdForm.typesFileInputUtilsMod.FileUploadStats
import typings.reactMdForm.typesFileInputUtilsMod.FileValidationError
import typings.reactMdForm.typesFileInputUtilsMod.FilesValidationOptions
import typings.reactMdForm.typesFileInputUtilsMod.GetFileParser_
import typings.reactMdForm.typesFileInputUtilsMod.IsValidFileName_
import typings.reactMdForm.typesFileInputUtilsMod.SplitFileUploads
import typings.reactMdForm.typesFileInputUtilsMod.ValidatedFilesResult
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileInputMod {
  
  @JSImport("@react-md/form/types/file-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/file-input", "FileAccessError")
  @js.native
  /**
    *
    * @param message - An optional message for the error.
    */
  open class FileAccessError ()
    extends typings.reactMdForm.typesFileInputUtilsMod.FileAccessError {
    def this(message: String) = this()
  }
  
  @JSImport("@react-md/form/types/file-input", "FileExtensionError")
  @js.native
  open class FileExtensionError protected ()
    extends typings.reactMdForm.typesFileInputUtilsMod.FileExtensionError {
    /**
      *
      * @param files - The file that caused the error
      * @param extensions - The allowed list of file extensions
      */
    def this(files: js.Array[File], extensions: js.Array[String]) = this()
  }
  
  @JSImport("@react-md/form/types/file-input", "FileInput")
  @js.native
  val FileInput: ForwardRefExoticComponent[FileInputProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/file-input", "FileSizeError")
  @js.native
  open class FileSizeError protected ()
    extends typings.reactMdForm.typesFileInputUtilsMod.FileSizeError {
    /**
      *
      * @param files - The list of files that have the file size error
      * @param type - The file size error type
      * @param limit - The number of bytes allowed based on the type
      */
    def this(files: js.Array[File], `type`: min | max | total, limit: Double) = this()
  }
  
  @JSImport("@react-md/form/types/file-input", "GenericFileError")
  @js.native
  open class GenericFileError protected ()
    extends typings.reactMdForm.typesFileInputUtilsMod.GenericFileError {
    /**
      *
      * @param files - A list of files that caused the error.
      * @param reason - An optional reason for the error
      */
    def this(files: js.Array[File]) = this()
    def this(files: js.Array[File], reason: String) = this()
  }
  
  @JSImport("@react-md/form/types/file-input", "TooManyFilesError")
  @js.native
  open class TooManyFilesError protected ()
    extends typings.reactMdForm.typesFileInputUtilsMod.TooManyFilesError {
    /**
      *
      * @param files - The list of files that could not be uploaded due to the file
      * limit defined.
      * @param limit - The max limit of files allowed.
      */
    def this(files: js.Array[File], limit: Double) = this()
  }
  
  @JSImport("@react-md/form/types/file-input", "getFileParser")
  @js.native
  val getFileParser: GetFileParser_ = js.native
  
  inline def getSplitFileUploads(stats: js.Array[FileUploadStats]): SplitFileUploads = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplitFileUploads")(stats.asInstanceOf[js.Any]).asInstanceOf[SplitFileUploads]
  
  inline def isAudioFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAudioFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileAccessError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileAccessError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileAccessError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileAccessError */ Boolean]
  
  inline def isFileExtensionError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileExtensionError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileExtensionError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileExtensionError */ Boolean]
  
  inline def isFileSizeError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileSizeError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileSizeError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileSizeError */ Boolean]
  
  inline def isGenericFileError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.GenericFileError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenericFileError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.GenericFileError */ Boolean]
  
  inline def isImageFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMediaFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTextFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTooManyFilesError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.TooManyFilesError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooManyFilesError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.TooManyFilesError */ Boolean]
  
  @JSImport("@react-md/form/types/file-input", "isValidFileName")
  @js.native
  val isValidFileName: IsValidFileName_ = js.native
  
  inline def isVideoFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVideoFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")().asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](
    hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName: FileUploadOptions[E, CustomError]
  ): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")(hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName.asInstanceOf[js.Any]).asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  
  inline def validateFiles[CustomError](
    files: js.Array[File],
    hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalBytesTotalFilesTotalFileSizeIsValidFileName: FilesValidationOptions
  ): ValidatedFilesResult[CustomError] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFiles")(files.asInstanceOf[js.Any], hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalBytesTotalFilesTotalFileSizeIsValidFileName.asInstanceOf[js.Any])).asInstanceOf[ValidatedFilesResult[CustomError]]
}
