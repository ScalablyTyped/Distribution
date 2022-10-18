package typings.reactMdForm

import typings.react.mod.ChangeEventHandler
import typings.react.mod.DragEventHandler
import typings.reactMdForm.typesFileInputUtilsMod.FileReaderParser
import typings.reactMdForm.typesFileInputUtilsMod.FileUploadHandlers
import typings.reactMdForm.typesFileInputUtilsMod.FileUploadStats
import typings.reactMdForm.typesFileInputUtilsMod.FileValidationError
import typings.reactMdForm.typesFileInputUtilsMod.FileValidationOptions
import typings.reactMdForm.typesFileInputUtilsMod.FilesValidationOptions
import typings.reactMdForm.typesFileInputUtilsMod.FilesValidator
import typings.reactMdForm.typesFileInputUtilsMod.GetFileParser_
import typings.reactMdForm.typesFileInputUtilsMod.ValidatedFilesResult
import typings.std.File
import typings.std.FileReader
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileInputUseFileUploadMod {
  
  @JSImport("@react-md/form/types/file-input/useFileUpload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")().asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](
    hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName: FileUploadOptions[E, CustomError]
  ): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")(hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName.asInstanceOf[js.Any]).asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  
  @js.native
  trait FileUploadActions extends StObject {
    
    /**
      * Removes all the errors that exist in state without cancelling any of the
      * uploads already in progress.
      */
    def clearErrors(): Unit = js.native
    
    /**
      * This function is used to cancel pending and uploading files or removing
      * completed files.
      *
      * @param keyOrKeys - A single or list of {@link BaseFileUploadStats.key} to
      * remove from state.
      */
    def remove(keyOrKeys: String): Unit = js.native
    def remove(keyOrKeys: js.Array[String]): Unit = js.native
    
    /**
      * Reset everything related to uploads ensuring that all file readers have
      * been aborted.
      */
    def reset(): Unit = js.native
  }
  
  /* Inlined parent @react-md/form.@react-md/form/types/file-input/useFileUpload.FileUploadActions */
  /* Inlined parent std.Required<@react-md/form.@react-md/form/types/file-input/utils.FileUploadHandlers<E>> */
  @js.native
  trait FileUploadHookReturnValue[E /* <: HTMLElement */, CustomError] extends StObject {
    
    /**
      * An `accept` string that can be passed to the {@link FileInput} component
      * when the {@link FileValidationOptions.extensions} list has been provided to
      * limit which files the OS will _attempt_ to allow access to.
      *
      * @example
      * Simple example
      * ```ts
      * const extensions = ['pdf', 'docx', 'ppt'];
      * const { accept } = useFileUpload({ extensions, ...others });
      *
      * expect(accept).toBe("*.pdf,*.docx,*.ppt")
      * ```
      *
      * @defaultValue `"*"`
      */
    var accept: String = js.native
    
    /**
      * Removes all the errors that exist in state without cancelling any of the
      * uploads already in progress.
      */
    def clearErrors(): Unit = js.native
    
    /** {@inheritDoc FileUploadState.errors} */
    var errors: js.Array[FileValidationError[CustomError]] = js.native
    
    var onChange: ChangeEventHandler[HTMLInputElement] = js.native
    
    var onDrop: DragEventHandler[E] = js.native
    
    /**
      * This function is used to cancel pending and uploading files or removing
      * completed files.
      *
      * @param keyOrKeys - A single or list of {@link BaseFileUploadStats.key} to
      * remove from state.
      */
    def remove(keyOrKeys: String): Unit = js.native
    def remove(keyOrKeys: js.Array[String]): Unit = js.native
    
    /**
      * Reset everything related to uploads ensuring that all file readers have
      * been aborted.
      */
    def reset(): Unit = js.native
    
    /**
      * A list of all the {@link FileUploadStats}.
      *
      * @see {@link getSplitFileUploads} for separating by status
      */
    var stats: js.Array[FileUploadStats] = js.native
    
    /**
      * The total number of bytes for all the files that exist in the
      * {@link stats} list.
      */
    var totalBytes: Double = js.native
    
    /**
      * The total number of files in the {@link stats} list.
      */
    var totalFiles: Double = js.native
  }
  
  trait FileUploadHookState[CustomError]
    extends StObject
       with FileUploadState[CustomError] {
    
    /**
      * All the current readers used for uploading files to the browser.
      *
      * Note: Once an upload has completed, the reader will be removed.
      */
    var readers: Record[String, FileReader]
  }
  object FileUploadHookState {
    
    inline def apply[CustomError](
      errors: js.Array[FileValidationError[CustomError]],
      readers: Record[String, FileReader],
      stats: Record[String, FileUploadStats]
    ): FileUploadHookState[CustomError] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], readers = readers.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadHookState[CustomError]]
    }
    
    extension [Self <: FileUploadHookState[?], CustomError](x: Self & FileUploadHookState[CustomError]) {
      
      inline def setReaders(value: Record[String, FileReader]): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadOptions[E /* <: HTMLElement */, CustomError]
    extends StObject
       with FileUploadHandlers[E]
       with FileValidationOptions {
    
    /**
      * Setting this value to a number greater than `0` will update the browser
      * upload process to queue the uploads in chunks instead of all at once. This
      * can help prevent the browser from freezing if dealing with large files that
      * are being converted to data urls.
      *
      * @defaultValue `-1`
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /** {@inheritDoc GetFileParser} */
    var getFileParser: js.UndefOr[GetFileParser_] = js.undefined
    
    /** {@inheritDoc FilesValidator} */
    var validateFiles: js.UndefOr[FilesValidator[CustomError]] = js.undefined
  }
  object FileUploadOptions {
    
    inline def apply[E /* <: HTMLElement */, CustomError](): FileUploadOptions[E, CustomError] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploadOptions[E, CustomError]]
    }
    
    extension [Self <: FileUploadOptions[?, ?], E /* <: HTMLElement */, CustomError](x: Self & (FileUploadOptions[E, CustomError])) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setGetFileParser(value: /* file */ File => FileReaderParser): Self = StObject.set(x, "getFileParser", js.Any.fromFunction1(value))
      
      inline def setGetFileParserUndefined: Self = StObject.set(x, "getFileParser", js.undefined)
      
      inline def setValidateFiles(
        value: (/* files */ js.Array[File], /* options */ FilesValidationOptions) => ValidatedFilesResult[CustomError]
      ): Self = StObject.set(x, "validateFiles", js.Any.fromFunction2(value))
      
      inline def setValidateFilesUndefined: Self = StObject.set(x, "validateFiles", js.undefined)
    }
  }
  
  trait FileUploadState[CustomError] extends StObject {
    
    /**
      * A list of validation errors that have occurred before starting the upload
      * process.
      *
      * @see {@link FileAccessError}
      * @see {@link TooManyFilesError}
      * @see {@link FileValidationError}
      */
    var errors: js.Array[FileValidationError[CustomError]]
    
    /**
      * All the files that have been validated and are either:
      * - pending upload
      * - uploading
      * - complete
      *
      * Each key in this object is the {@link BaseFileUploadStats.key} generated
      * once the upload starts pending.
      */
    var stats: Record[String, FileUploadStats]
  }
  object FileUploadState {
    
    inline def apply[CustomError](errors: js.Array[FileValidationError[CustomError]], stats: Record[String, FileUploadStats]): FileUploadState[CustomError] = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadState[CustomError]]
    }
    
    extension [Self <: FileUploadState[?], CustomError](x: Self & FileUploadState[CustomError]) {
      
      inline def setErrors(value: js.Array[FileValidationError[CustomError]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: FileValidationError[CustomError]*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setStats(value: Record[String, FileUploadStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
