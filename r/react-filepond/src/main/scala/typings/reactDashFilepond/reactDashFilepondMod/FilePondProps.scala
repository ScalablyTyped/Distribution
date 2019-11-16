package typings.reactDashFilepond.reactDashFilepondMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import typings.reactDashFilepond.Anon_Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondProps
  extends FilePondDragDropProps
     with FilePondServerConfigProps
     with FilePondLabelProps
     with FilePondSvgIconProps
     with FilePondCallbackProps
     with FilePondHookProps
     with FilePondBaseProps

object FilePondProps {
  @scala.inline
  def apply(
    acceptedFileTypes: js.Array[String] = null,
    allowBrowse: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    allowPaste: js.UndefOr[Boolean] = js.undefined,
    allowReplace: js.UndefOr[Boolean] = js.undefined,
    allowRevert: js.UndefOr[Boolean] = js.undefined,
    beforeRemoveFile: /* file */ File => Boolean = null,
    captureMethod: js.Any = null,
    children: ReactElement | js.Array[ReactElement] = null,
    className: String = null,
    dropOnElement: js.UndefOr[Boolean] = js.undefined,
    dropOnPage: js.UndefOr[Boolean] = js.undefined,
    dropValidation: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[File] = null,
    iconProcess: String = null,
    iconRemove: String = null,
    iconRetry: String = null,
    iconUndo: String = null,
    id: String = null,
    ignoredFiles: js.Array[String] = null,
    instantUpload: js.UndefOr[Boolean] = js.undefined,
    labelButtonAbortItemLoad: String = null,
    labelButtonAbortItemProcessing: String = null,
    labelButtonProcessItem: String = null,
    labelButtonRemoveItem: String = null,
    labelButtonRetryItemLoad: String = null,
    labelButtonRetryItemProcessing: String = null,
    labelButtonUndoItemProcessing: String = null,
    labelDecimalSeparator: String = null,
    labelFileLoadError: String = null,
    labelFileLoading: String = null,
    labelFileProcessing: String = null,
    labelFileProcessingAborted: String = null,
    labelFileProcessingComplete: String = null,
    labelFileProcessingError: String = null,
    labelFileSizeNotAvailable: String = null,
    labelFileWaitingForSize: String = null,
    labelIdle: String = null,
    labelTapToCancel: String = null,
    labelTapToRetry: String = null,
    labelTapToUndo: String = null,
    labelThousandsSeparator: String = null,
    maxFiles: Int | Double = null,
    maxParallelUploads: Int | Double = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    onaddfile: (/* error */ FilePondErrorDescription, /* file */ File) => Unit = null,
    onaddfileprogress: (/* file */ File, /* progress */ Double) => Unit = null,
    onaddfilestart: /* file */ File => Unit = null,
    onerror: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit = null,
    oninit: () => Unit = null,
    onpreparefile: (/* file */ File, /* output */ js.Any) => Unit = null,
    onprocessfile: (/* error */ FilePondErrorDescription, /* file */ File) => Unit = null,
    onprocessfileabort: /* file */ File => Unit = null,
    onprocessfileprogress: (/* file */ File, /* progress */ Double) => Unit = null,
    onprocessfilestart: /* file */ File => Unit = null,
    onprocessfileundo: /* file */ File => Unit = null,
    onremovefile: /* file */ File => Unit = null,
    onupdatefiles: /* fileItems */ js.Array[File] => Unit = null,
    onwarning: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Unit = null,
    required: js.UndefOr[Boolean] = js.undefined,
    server: String | Anon_Fetch = null
  ): FilePondProps = {
    val __obj = js.Dynamic.literal()
    if (acceptedFileTypes != null) __obj.updateDynamic("acceptedFileTypes")(acceptedFileTypes)
    if (!js.isUndefined(allowBrowse)) __obj.updateDynamic("allowBrowse")(allowBrowse)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (!js.isUndefined(allowPaste)) __obj.updateDynamic("allowPaste")(allowPaste)
    if (!js.isUndefined(allowReplace)) __obj.updateDynamic("allowReplace")(allowReplace)
    if (!js.isUndefined(allowRevert)) __obj.updateDynamic("allowRevert")(allowRevert)
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(js.Any.fromFunction1(beforeRemoveFile))
    if (captureMethod != null) __obj.updateDynamic("captureMethod")(captureMethod)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dropOnElement)) __obj.updateDynamic("dropOnElement")(dropOnElement)
    if (!js.isUndefined(dropOnPage)) __obj.updateDynamic("dropOnPage")(dropOnPage)
    if (!js.isUndefined(dropValidation)) __obj.updateDynamic("dropValidation")(dropValidation)
    if (files != null) __obj.updateDynamic("files")(files)
    if (iconProcess != null) __obj.updateDynamic("iconProcess")(iconProcess)
    if (iconRemove != null) __obj.updateDynamic("iconRemove")(iconRemove)
    if (iconRetry != null) __obj.updateDynamic("iconRetry")(iconRetry)
    if (iconUndo != null) __obj.updateDynamic("iconUndo")(iconUndo)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignoredFiles != null) __obj.updateDynamic("ignoredFiles")(ignoredFiles)
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload)
    if (labelButtonAbortItemLoad != null) __obj.updateDynamic("labelButtonAbortItemLoad")(labelButtonAbortItemLoad)
    if (labelButtonAbortItemProcessing != null) __obj.updateDynamic("labelButtonAbortItemProcessing")(labelButtonAbortItemProcessing)
    if (labelButtonProcessItem != null) __obj.updateDynamic("labelButtonProcessItem")(labelButtonProcessItem)
    if (labelButtonRemoveItem != null) __obj.updateDynamic("labelButtonRemoveItem")(labelButtonRemoveItem)
    if (labelButtonRetryItemLoad != null) __obj.updateDynamic("labelButtonRetryItemLoad")(labelButtonRetryItemLoad)
    if (labelButtonRetryItemProcessing != null) __obj.updateDynamic("labelButtonRetryItemProcessing")(labelButtonRetryItemProcessing)
    if (labelButtonUndoItemProcessing != null) __obj.updateDynamic("labelButtonUndoItemProcessing")(labelButtonUndoItemProcessing)
    if (labelDecimalSeparator != null) __obj.updateDynamic("labelDecimalSeparator")(labelDecimalSeparator)
    if (labelFileLoadError != null) __obj.updateDynamic("labelFileLoadError")(labelFileLoadError)
    if (labelFileLoading != null) __obj.updateDynamic("labelFileLoading")(labelFileLoading)
    if (labelFileProcessing != null) __obj.updateDynamic("labelFileProcessing")(labelFileProcessing)
    if (labelFileProcessingAborted != null) __obj.updateDynamic("labelFileProcessingAborted")(labelFileProcessingAborted)
    if (labelFileProcessingComplete != null) __obj.updateDynamic("labelFileProcessingComplete")(labelFileProcessingComplete)
    if (labelFileProcessingError != null) __obj.updateDynamic("labelFileProcessingError")(labelFileProcessingError)
    if (labelFileSizeNotAvailable != null) __obj.updateDynamic("labelFileSizeNotAvailable")(labelFileSizeNotAvailable)
    if (labelFileWaitingForSize != null) __obj.updateDynamic("labelFileWaitingForSize")(labelFileWaitingForSize)
    if (labelIdle != null) __obj.updateDynamic("labelIdle")(labelIdle)
    if (labelTapToCancel != null) __obj.updateDynamic("labelTapToCancel")(labelTapToCancel)
    if (labelTapToRetry != null) __obj.updateDynamic("labelTapToRetry")(labelTapToRetry)
    if (labelTapToUndo != null) __obj.updateDynamic("labelTapToUndo")(labelTapToUndo)
    if (labelThousandsSeparator != null) __obj.updateDynamic("labelThousandsSeparator")(labelThousandsSeparator)
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxParallelUploads != null) __obj.updateDynamic("maxParallelUploads")(maxParallelUploads.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(js.Any.fromFunction2(onaddfile))
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(js.Any.fromFunction2(onaddfileprogress))
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(js.Any.fromFunction1(onaddfilestart))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3(onerror))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(js.Any.fromFunction2(onpreparefile))
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(js.Any.fromFunction2(onprocessfile))
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(js.Any.fromFunction1(onprocessfileabort))
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(js.Any.fromFunction2(onprocessfileprogress))
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(js.Any.fromFunction1(onprocessfilestart))
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(js.Any.fromFunction1(onprocessfileundo))
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(js.Any.fromFunction1(onremovefile))
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(js.Any.fromFunction1(onupdatefiles))
    if (onwarning != null) __obj.updateDynamic("onwarning")(js.Any.fromFunction3(onwarning))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondProps]
  }
}

