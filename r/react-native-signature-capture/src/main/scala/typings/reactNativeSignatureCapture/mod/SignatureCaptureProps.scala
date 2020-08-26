package typings.reactNativeSignatureCapture.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.landscape
import typings.reactNativeSignatureCapture.reactNativeSignatureCaptureStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureCaptureProps extends ViewProps {
  /**
    * sets the max size of the image maintains aspect ratio,
    *
    * @default 500
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Triggered when user marks their signature on the canvas.
    * This will not be called when the user does not perform any action on canvas.
    *
    * @param event - the event when a drag is performed
    */
  var onDragEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  /**
    * Triggered when saveImage() is called, which return Base64 Encoded String and image file path.
    *
    * @param params - the file path and encoded png
    */
  var onSaveEvent: js.UndefOr[js.Function1[/* params */ SaveEventParams, Unit]] = js.native
  /**
    * Make this props true, if you want to save the image file in external storage.
    * Warning: Image file will be visible in gallery or any other image browsing app
    *
    * @default false
    */
  var saveImageFileInExtStorage: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to false, it will hide the dashed border (the border is shown on iOS only).
    *
    * @default false
    */
  var showBorder: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to true, it will display the native buttons "Save" and "Reset".
    *
    * @default false
    */
  var showNativeButtons: js.UndefOr[Boolean] = js.native
  /**
    * If this props is made to true, it will display the "x_ _ _ _ _ _ _ _ _ _ _" placeholder indicating where to sign.
    *
    * @default false
    */
  var showTitleLabel: js.UndefOr[Boolean] = js.native
  /**
    * Change the screen orientation based on boolean value
    * "portrait" or "landscape"
    */
  var viewMode: js.UndefOr[portrait | landscape] = js.native
}

object SignatureCaptureProps {
  @scala.inline
  def apply(): SignatureCaptureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureCaptureProps]
  }
  @scala.inline
  implicit class SignatureCapturePropsOps[Self <: SignatureCaptureProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setOnDragEvent(value: /* event */ js.Any => Unit): Self = this.set("onDragEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEvent: Self = this.set("onDragEvent", js.undefined)
    @scala.inline
    def setOnSaveEvent(value: /* params */ SaveEventParams => Unit): Self = this.set("onSaveEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSaveEvent: Self = this.set("onSaveEvent", js.undefined)
    @scala.inline
    def setSaveImageFileInExtStorage(value: Boolean): Self = this.set("saveImageFileInExtStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveImageFileInExtStorage: Self = this.set("saveImageFileInExtStorage", js.undefined)
    @scala.inline
    def setShowBorder(value: Boolean): Self = this.set("showBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBorder: Self = this.set("showBorder", js.undefined)
    @scala.inline
    def setShowNativeButtons(value: Boolean): Self = this.set("showNativeButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNativeButtons: Self = this.set("showNativeButtons", js.undefined)
    @scala.inline
    def setShowTitleLabel(value: Boolean): Self = this.set("showTitleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitleLabel: Self = this.set("showTitleLabel", js.undefined)
    @scala.inline
    def setViewMode(value: portrait | landscape): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

