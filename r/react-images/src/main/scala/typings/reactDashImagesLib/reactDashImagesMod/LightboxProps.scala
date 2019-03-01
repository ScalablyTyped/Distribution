package typings
package reactDashImagesLib.reactDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxProps extends js.Object {
  /**
    * Allow users to exit the lightbox by clicking the backdrop. Default value: false.
    */
  var backdropClosesModal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom close esc title. Default value: ' Close (Esc) '
    */
  var closeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the image to display initially. Default value: 0
    */
  var currentImage: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of elements to display as custom controls on the top of lightbox. Default value: undefined
    */
  var customControls: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactHTMLElement[_]]] = js.undefined
  /**
    * Supports keyboard input - esc, arrow left, and arrow right. Default value: true
    */
  var enableKeyboardInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The image count separator. Default value: ' of '
    */
  var imageCountSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of image objects. Required.
    */
  var images: js.Array[Image]
  /**
    * Whether or not the lightbox is displayed. Default value: false;
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom of left arrow title. Default value: ' Previous (Left arrow key) '
    */
  var leftArrowTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Handle click on image.
    */
  var onClickImage: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLImageElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired on request of the next image.
    */
  var onClickNext: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Fired on request of the previous image.
    */
  var onClickPrev: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Handle click on thumbnail.
    */
  var onClickThumbnail: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Based on the direction the user is navigating, preload the next available image. Default value: true
    */
  var preloadNextImage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines whether scrolling is prevented via react-scrolllock. Default value: true
    */
  var preventScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customize right arrow title. Default value: ' Next (Right arrow key) '
    */
  var rightArrowTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optionally display a close "X" button in top right corner. Default value: true
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optionally display image index, e.g., "3 of 20". Default value: true
    */
  var showImageCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optionally display thumbnails beneath the Lightbox
    */
  var showThumbnails: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Spinner component.
    */
  var spinner: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  /**
    *  Color of spinner. Default value: 'white'
    */
  var spinnerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size of spinner. Default value: 100
    */
  var spinnerSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum width of the carousel; defaults to 1024px
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Handle closing of the lightbox. Required.
    */
  def onClose(): scala.Unit
}

object LightboxProps {
  @scala.inline
  def apply(
    images: js.Array[Image],
    onClose: js.Function0[scala.Unit],
    backdropClosesModal: js.UndefOr[scala.Boolean] = js.undefined,
    closeButtonTitle: java.lang.String = null,
    currentImage: scala.Int | scala.Double = null,
    customControls: js.Array[reactLib.reactMod.ReactNs.ReactHTMLElement[_]] = null,
    enableKeyboardInput: js.UndefOr[scala.Boolean] = js.undefined,
    imageCountSeparator: java.lang.String = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    leftArrowTitle: java.lang.String = null,
    onClickImage: js.Function1[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLImageElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onClickNext: js.Function0[scala.Unit] = null,
    onClickPrev: js.Function0[scala.Unit] = null,
    onClickThumbnail: js.Function1[/* index */ scala.Double, scala.Unit] = null,
    preloadNextImage: js.UndefOr[scala.Boolean] = js.undefined,
    preventScroll: js.UndefOr[scala.Boolean] = js.undefined,
    rightArrowTitle: java.lang.String = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showImageCount: js.UndefOr[scala.Boolean] = js.undefined,
    showThumbnails: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    spinnerColor: java.lang.String = null,
    spinnerSize: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): LightboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("onClose")(onClose)
    if (!js.isUndefined(backdropClosesModal)) __obj.updateDynamic("backdropClosesModal")(backdropClosesModal)
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle)
    if (currentImage != null) __obj.updateDynamic("currentImage")(currentImage.asInstanceOf[js.Any])
    if (customControls != null) __obj.updateDynamic("customControls")(customControls)
    if (!js.isUndefined(enableKeyboardInput)) __obj.updateDynamic("enableKeyboardInput")(enableKeyboardInput)
    if (imageCountSeparator != null) __obj.updateDynamic("imageCountSeparator")(imageCountSeparator)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (leftArrowTitle != null) __obj.updateDynamic("leftArrowTitle")(leftArrowTitle)
    if (onClickImage != null) __obj.updateDynamic("onClickImage")(onClickImage)
    if (onClickNext != null) __obj.updateDynamic("onClickNext")(onClickNext)
    if (onClickPrev != null) __obj.updateDynamic("onClickPrev")(onClickPrev)
    if (onClickThumbnail != null) __obj.updateDynamic("onClickThumbnail")(onClickThumbnail)
    if (!js.isUndefined(preloadNextImage)) __obj.updateDynamic("preloadNextImage")(preloadNextImage)
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll)
    if (rightArrowTitle != null) __obj.updateDynamic("rightArrowTitle")(rightArrowTitle)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showImageCount)) __obj.updateDynamic("showImageCount")(showImageCount)
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner)
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor)
    if (spinnerSize != null) __obj.updateDynamic("spinnerSize")(spinnerSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightboxProps]
  }
}

