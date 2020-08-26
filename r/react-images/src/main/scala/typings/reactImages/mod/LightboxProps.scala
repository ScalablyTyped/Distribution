package typings.reactImages.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactHTMLElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightboxProps extends js.Object {
  /**
    * Allow users to exit the lightbox by clicking the backdrop. Default value: false.
    */
  var backdropClosesModal: js.UndefOr[Boolean] = js.native
  /**
    * Custom close esc title. Default value: ' Close (Esc) '
    */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
    * The index of the image to display initially. Default value: 0
    */
  var currentImage: js.UndefOr[Double] = js.native
  /**
    * An array of elements to display as custom controls on the top of lightbox. Default value: undefined
    */
  var customControls: js.UndefOr[js.Array[ReactHTMLElement[_]]] = js.native
  /**
    * Supports keyboard input - esc, arrow left, and arrow right. Default value: true
    */
  var enableKeyboardInput: js.UndefOr[Boolean] = js.native
  /**
    * The image count separator. Default value: ' of '
    */
  var imageCountSeparator: js.UndefOr[String] = js.native
  /**
    * Array of image objects. Required.
    */
  var images: js.Array[Image] = js.native
  /**
    * Whether or not the lightbox is displayed. Default value: false;
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Custom of left arrow title. Default value: ' Previous (Left arrow key) '
    */
  var leftArrowTitle: js.UndefOr[String] = js.native
  /**
    * Handle click on image.
    */
  var onClickImage: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLImageElement, NativeMouseEvent], Unit]] = js.native
  /**
    * Fired on request of the next image.
    */
  var onClickNext: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Fired on request of the previous image.
    */
  var onClickPrev: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Handle click on thumbnail.
    */
  var onClickThumbnail: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  /**
    * Based on the direction the user is navigating, preload the next available image. Default value: true
    */
  var preloadNextImage: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether scrolling is prevented via react-scrolllock. Default value: true
    */
  var preventScroll: js.UndefOr[Boolean] = js.native
  /**
    * Customize right arrow title. Default value: ' Next (Right arrow key) '
    */
  var rightArrowTitle: js.UndefOr[String] = js.native
  /**
    * Optionally display a close "X" button in top right corner. Default value: true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Optionally display image index, e.g., "3 of 20". Default value: true
    */
  var showImageCount: js.UndefOr[Boolean] = js.native
  /**
    * Optionally display thumbnails beneath the Lightbox
    */
  var showThumbnails: js.UndefOr[Boolean] = js.native
  /**
    * Spinner component.
    */
  var spinner: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    *  Color of spinner. Default value: 'white'
    */
  var spinnerColor: js.UndefOr[String] = js.native
  /**
    * Size of spinner. Default value: 100
    */
  var spinnerSize: js.UndefOr[Double] = js.native
  /**
    * Maximum width of the carousel; defaults to 1024px
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Handle closing of the lightbox. Required.
    */
  def onClose(): Unit = js.native
}

object LightboxProps {
  @scala.inline
  def apply(images: js.Array[Image], onClose: () => Unit): LightboxProps = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[LightboxProps]
  }
  @scala.inline
  implicit class LightboxPropsOps[Self <: LightboxProps] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setBackdropClosesModal(value: Boolean): Self = this.set("backdropClosesModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropClosesModal: Self = this.set("backdropClosesModal", js.undefined)
    @scala.inline
    def setCloseButtonTitle(value: String): Self = this.set("closeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonTitle: Self = this.set("closeButtonTitle", js.undefined)
    @scala.inline
    def setCurrentImage(value: Double): Self = this.set("currentImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentImage: Self = this.set("currentImage", js.undefined)
    @scala.inline
    def setCustomControlsVarargs(value: ReactHTMLElement[js.Any]*): Self = this.set("customControls", js.Array(value :_*))
    @scala.inline
    def setCustomControls(value: js.Array[ReactHTMLElement[_]]): Self = this.set("customControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomControls: Self = this.set("customControls", js.undefined)
    @scala.inline
    def setEnableKeyboardInput(value: Boolean): Self = this.set("enableKeyboardInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyboardInput: Self = this.set("enableKeyboardInput", js.undefined)
    @scala.inline
    def setImageCountSeparator(value: String): Self = this.set("imageCountSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCountSeparator: Self = this.set("imageCountSeparator", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setLeftArrowTitle(value: String): Self = this.set("leftArrowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftArrowTitle: Self = this.set("leftArrowTitle", js.undefined)
    @scala.inline
    def setOnClickImage(value: /* e */ MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit): Self = this.set("onClickImage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickImage: Self = this.set("onClickImage", js.undefined)
    @scala.inline
    def setOnClickNext(value: () => Unit): Self = this.set("onClickNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClickNext: Self = this.set("onClickNext", js.undefined)
    @scala.inline
    def setOnClickPrev(value: () => Unit): Self = this.set("onClickPrev", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClickPrev: Self = this.set("onClickPrev", js.undefined)
    @scala.inline
    def setOnClickThumbnail(value: /* index */ Double => Unit): Self = this.set("onClickThumbnail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickThumbnail: Self = this.set("onClickThumbnail", js.undefined)
    @scala.inline
    def setPreloadNextImage(value: Boolean): Self = this.set("preloadNextImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadNextImage: Self = this.set("preloadNextImage", js.undefined)
    @scala.inline
    def setPreventScroll(value: Boolean): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventScroll: Self = this.set("preventScroll", js.undefined)
    @scala.inline
    def setRightArrowTitle(value: String): Self = this.set("rightArrowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightArrowTitle: Self = this.set("rightArrowTitle", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowImageCount(value: Boolean): Self = this.set("showImageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowImageCount: Self = this.set("showImageCount", js.undefined)
    @scala.inline
    def setShowThumbnails(value: Boolean): Self = this.set("showThumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowThumbnails: Self = this.set("showThumbnails", js.undefined)
    @scala.inline
    def setSpinner(value: () => ReactElement): Self = this.set("spinner", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSpinner: Self = this.set("spinner", js.undefined)
    @scala.inline
    def setSpinnerColor(value: String): Self = this.set("spinnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerColor: Self = this.set("spinnerColor", js.undefined)
    @scala.inline
    def setSpinnerSize(value: Double): Self = this.set("spinnerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerSize: Self = this.set("spinnerSize", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

