package typings.reactFilepond

import typings.filepond.mod.FilePondOptions
import typings.react.mod.Component
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-filepond", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof filepond.filepond.FilePond, react-filepond.react-filepond.FilteredMethods> ]: filepond.filepond.FilePond[P]} */ @JSImport("react-filepond", "FilePond")
  @js.native
  class FilePond protected ()
    extends Component[FilePondProps, js.Object, js.Any] {
    def this(props: FilePondProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FilePondProps, context: js.Any) = this()
  }
  
  @JSImport("react-filepond", "FileStatus")
  @js.native
  object FileStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.filepond.mod.FileStatus & Double] = js.native
    
    /* 2 */ val IDLE: typings.filepond.mod.FileStatus.IDLE & Double = js.native
    
    /* 1 */ val INIT: typings.filepond.mod.FileStatus.INIT & Double = js.native
    
    /* 7 */ val LOADING: typings.filepond.mod.FileStatus.LOADING & Double = js.native
    
    /* 8 */ val LOAD_ERROR: typings.filepond.mod.FileStatus.LOAD_ERROR & Double = js.native
    
    /* 3 */ val PROCESSING: typings.filepond.mod.FileStatus.PROCESSING & Double = js.native
    
    /* 5 */ val PROCESSING_COMPLETE: typings.filepond.mod.FileStatus.PROCESSING_COMPLETE & Double = js.native
    
    /* 6 */ val PROCESSING_ERROR: typings.filepond.mod.FileStatus.PROCESSING_ERROR & Double = js.native
    
    /* 9 */ val PROCESSING_QUEUED: typings.filepond.mod.FileStatus.PROCESSING_QUEUED & Double = js.native
    
    /* 10 */ val PROCESSING_REVERT_ERROR: typings.filepond.mod.FileStatus.PROCESSING_REVERT_ERROR & Double = js.native
  }
  
  inline def registerPlugin(plugins: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait FilePondProps
    extends StObject
       with FilePondOptions {
    
    // (Temporarily) changed to old definition, see discussion at <https://github.com/pqina/react-filepond/pull/151>
    // acceptedFileTypes?: React.InputHTMLAttributes<any>['accept'];
    var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FilePondProps {
    
    inline def apply(): FilePondProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePondProps]
    }
    
    extension [Self <: FilePondProps](x: Self) {
      
      inline def setAcceptedFileTypes(value: js.Array[String]): Self = StObject.set(x, "acceptedFileTypes", value.asInstanceOf[js.Any])
      
      inline def setAcceptedFileTypesUndefined: Self = StObject.set(x, "acceptedFileTypes", js.undefined)
      
      inline def setAcceptedFileTypesVarargs(value: String*): Self = StObject.set(x, "acceptedFileTypes", js.Array(value :_*))
    }
  }
  
  /*
  According to react-filepond implementation, every FilePond instance key is cloned except some from an array, see
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L13> and
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L56-L61>.
  Exluded keys as of 2020-08-27:
  */
  /* Rewritten from type alias, can be one of: 
    - typings.reactFilepond.reactFilepondStrings.setOptions
    - typings.reactFilepond.reactFilepondStrings.on
    - typings.reactFilepond.reactFilepondStrings.off
    - typings.reactFilepond.reactFilepondStrings.onOnce
    - typings.reactFilepond.reactFilepondStrings.appendTo
    - typings.reactFilepond.reactFilepondStrings.insertAfter
    - typings.reactFilepond.reactFilepondStrings.insertBefore
    - typings.reactFilepond.reactFilepondStrings.isAttachedTo
    - typings.reactFilepond.reactFilepondStrings.replaceElement
    - typings.reactFilepond.reactFilepondStrings.restoreElement
    - typings.reactFilepond.reactFilepondStrings.destroy
    - typings.reactFilepond.reactFilepondStrings.dropOnPage
    - typings.reactFilepond.reactFilepondStrings.dropOnElement
    - typings.reactFilepond.reactFilepondStrings.dropValidation
    - typings.reactFilepond.reactFilepondStrings.ignoredFiles
    - typings.reactFilepond.reactFilepondStrings.instantUpload
    - typings.reactFilepond.reactFilepondStrings.maxParallelUploads
    - typings.reactFilepond.reactFilepondStrings.server
    - typings.reactFilepond.reactFilepondStrings.chunkUploads
    - typings.reactFilepond.reactFilepondStrings.chunkForce
    - typings.reactFilepond.reactFilepondStrings.chunkSize
    - typings.reactFilepond.reactFilepondStrings.chunkRetryDelays
    - typings.reactFilepond.reactFilepondStrings.files
    - typings.reactFilepond.reactFilepondStrings.labelDecimalSeparator
    - typings.reactFilepond.reactFilepondStrings.labelThousandsSeparator
    - typings.reactFilepond.reactFilepondStrings.labelIdle
    - typings.reactFilepond.reactFilepondStrings.labelInvalidField
    - typings.reactFilepond.reactFilepondStrings.labelFileWaitingForSize
    - typings.reactFilepond.reactFilepondStrings.labelFileSizeNotAvailable
    - typings.reactFilepond.reactFilepondStrings.labelFileCountSingular
    - typings.reactFilepond.reactFilepondStrings.labelFileCountPlural
    - typings.reactFilepond.reactFilepondStrings.labelFileLoading
    - typings.reactFilepond.reactFilepondStrings.labelFileAdded
    - typings.reactFilepond.reactFilepondStrings.labelFileLoadError
    - typings.reactFilepond.reactFilepondStrings.labelFileRemoved
    - typings.reactFilepond.reactFilepondStrings.labelFileRemoveError
    - typings.reactFilepond.reactFilepondStrings.labelFileProcessing
    - typings.reactFilepond.reactFilepondStrings.labelFileProcessingComplete
    - typings.reactFilepond.reactFilepondStrings.labelFileProcessingAborted
    - typings.reactFilepond.reactFilepondStrings.labelFileProcessingError
    - typings.reactFilepond.reactFilepondStrings.labelFileProcessingRevertError
    - typings.reactFilepond.reactFilepondStrings.labelTapToCancel
    - typings.reactFilepond.reactFilepondStrings.labelTapToRetry
    - typings.reactFilepond.reactFilepondStrings.labelTapToUndo
    - typings.reactFilepond.reactFilepondStrings.labelButtonRemoveItem
    - typings.reactFilepond.reactFilepondStrings.labelButtonAbortItemLoad
    - typings.reactFilepond.reactFilepondStrings.labelButtonRetryItemLoad
    - typings.reactFilepond.reactFilepondStrings.labelButtonAbortItemProcessing
    - typings.reactFilepond.reactFilepondStrings.labelButtonUndoItemProcessing
    - typings.reactFilepond.reactFilepondStrings.labelButtonRetryItemProcessing
    - typings.reactFilepond.reactFilepondStrings.labelButtonProcessItem
    - typings.reactFilepond.reactFilepondStrings.iconRemove
    - typings.reactFilepond.reactFilepondStrings.iconProcess
    - typings.reactFilepond.reactFilepondStrings.iconRetry
    - typings.reactFilepond.reactFilepondStrings.iconUndo
    - typings.reactFilepond.reactFilepondStrings.iconDone
    - typings.reactFilepond.reactFilepondStrings.oninit
    - typings.reactFilepond.reactFilepondStrings.onwarning
    - typings.reactFilepond.reactFilepondStrings.onerror
    - typings.reactFilepond.reactFilepondStrings.onaddfilestart
    - typings.reactFilepond.reactFilepondStrings.onaddfileprogress
    - typings.reactFilepond.reactFilepondStrings.onaddfile
    - typings.reactFilepond.reactFilepondStrings.onprocessfilestart
    - typings.reactFilepond.reactFilepondStrings.onprocessfileprogress
    - typings.reactFilepond.reactFilepondStrings.onprocessfileabort
    - typings.reactFilepond.reactFilepondStrings.onprocessfilerevert
    - typings.reactFilepond.reactFilepondStrings.onprocessfile
    - typings.reactFilepond.reactFilepondStrings.onprocessfiles
    - typings.reactFilepond.reactFilepondStrings.onremovefile
    - typings.reactFilepond.reactFilepondStrings.onpreparefile
    - typings.reactFilepond.reactFilepondStrings.onupdatefiles
    - typings.reactFilepond.reactFilepondStrings.onactivatefile
    - typings.reactFilepond.reactFilepondStrings.onreorderfiles
    - typings.reactFilepond.reactFilepondStrings.beforeDropFile
    - typings.reactFilepond.reactFilepondStrings.beforeAddFile
    - typings.reactFilepond.reactFilepondStrings.beforeRemoveFile
    - typings.reactFilepond.reactFilepondStrings.stylePanelLayout
    - typings.reactFilepond.reactFilepondStrings.stylePanelAspectRatio
    - typings.reactFilepond.reactFilepondStrings.styleItemPanelAspectRatio
    - typings.reactFilepond.reactFilepondStrings.styleButtonRemoveItemPosition
    - typings.reactFilepond.reactFilepondStrings.styleButtonProcessItemPosition
    - typings.reactFilepond.reactFilepondStrings.styleLoadIndicatorPosition
    - typings.reactFilepond.reactFilepondStrings.styleProgressIndicatorPosition
    - typings.reactFilepond.reactFilepondStrings.styleButtonRemoveItemAlign
    - typings.reactFilepond.reactFilepondStrings.id
    - typings.reactFilepond.reactFilepondStrings.name
    - typings.reactFilepond.reactFilepondStrings.className
    - typings.reactFilepond.reactFilepondStrings.required
    - typings.reactFilepond.reactFilepondStrings.disabled
    - typings.reactFilepond.reactFilepondStrings.captureMethod
    - typings.reactFilepond.reactFilepondStrings.allowSyncAcceptAttribute
    - typings.reactFilepond.reactFilepondStrings.allowDrop
    - typings.reactFilepond.reactFilepondStrings.allowBrowse
    - typings.reactFilepond.reactFilepondStrings.allowPaste
    - typings.reactFilepond.reactFilepondStrings.allowMultiple
    - typings.reactFilepond.reactFilepondStrings.allowReplace
    - typings.reactFilepond.reactFilepondStrings.allowRevert
    - typings.reactFilepond.reactFilepondStrings.allowProcess
    - typings.reactFilepond.reactFilepondStrings.allowReorder
    - typings.reactFilepond.reactFilepondStrings.allowDirectoriesOnly
    - typings.reactFilepond.reactFilepondStrings.forceRevert
    - typings.reactFilepond.reactFilepondStrings.maxFiles
    - typings.reactFilepond.reactFilepondStrings.checkValidity
    - typings.reactFilepond.reactFilepondStrings.itemInsertLocationFreedom
    - typings.reactFilepond.reactFilepondStrings.itemInsertLocation
    - typings.reactFilepond.reactFilepondStrings.itemInsertInterval
  */
  trait FilteredMethods extends StObject
  
  // Copy of Omit to retain TypeScript 3.4 compatibility (Omit is a built-in since TS 3.5)
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
