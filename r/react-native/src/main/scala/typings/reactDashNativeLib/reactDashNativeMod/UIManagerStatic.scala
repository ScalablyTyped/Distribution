package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIManagerStatic extends js.Object {
  /**
    * Determines the location on screen, width, and height of the given view and
    * returns the values via an async callback. If successful, the callback will
    * be called with the following arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *  - pageX
    *  - pageY
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native. If you need the measurements as soon as
    * possible, consider using the [`onLayout`
    * prop](docs/view.html#onlayout) instead.
    */
  def measure(node: scala.Double, callback: MeasureOnSuccessCallback): scala.Unit = js.native
  /**
    * Determines the location of the given view in the window and returns the
    * values via an async callback. If the React root view is embedded in
    * another native view, this will give you the absolute coordinates. If
    * successful, the callback will be called with the following
    * arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native.
    */
  def measureInWindow(node: scala.Double, callback: MeasureInWindowOnSuccessCallback): scala.Unit = js.native
  /**
    * Like [`measure()`](#measure), but measures the view relative an ancestor,
    * specified as `relativeToNativeNode`. This means that the returned x, y
    * are relative to the origin x, y of the ancestor view.
    *
    * As always, to obtain a native node handle for a component, you can use
    * `React.findNodeHandle(component)`.
    */
  def measureLayout(
    node: scala.Double,
    relativeToNativeNode: scala.Double,
    onFail: js.Function0[scala.Unit],
    onSuccess: MeasureLayoutOnSuccessCallback
  ): scala.Unit = js.native
  /**
    * Automatically animates views to their new positions when the
    * next layout happens.
    *
    * A common way to use this API is to call it before calling `setState`.
    *
    * Note that in order to get this to work on **Android** you need to set the following flags via `UIManager`:
    *
    *     UIManager.setLayoutAnimationEnabledExperimental && UIManager.setLayoutAnimationEnabledExperimental(true);
    */
  def setLayoutAnimationEnabledExperimental(value: scala.Boolean): scala.Unit = js.native
  /**
    * Capture an image of the screen, window or an individual view. The image
    * will be stored in a temporary file that will only exist for as long as the
    * app is running.
    *
    * The `view` argument can be the literal string `window` if you want to
    * capture the entire window, or it can be a reference to a specific
    * React Native component.
    *
    * The `options` argument may include:
    * - width/height (number) - the width and height of the image to capture.
    * - format (string) - either 'png' or 'jpeg'. Defaults to 'png'.
    * - quality (number) - the quality when using jpeg. 0.0 - 1.0 (default).
    *
    * Returns a Promise<string> (tempFilePath)
    * @platform ios
    */
  def takeSnapshot(): js.Promise[java.lang.String] = js.native
  def takeSnapshot(view: reactLib.reactMod.ReactNs.ReactElement[_]): js.Promise[java.lang.String] = js.native
  def takeSnapshot(view: reactLib.reactMod.ReactNs.ReactElement[_], options: reactDashNativeLib.Anon_Quality): js.Promise[java.lang.String] = js.native
  def takeSnapshot(view: scala.Double): js.Promise[java.lang.String] = js.native
  def takeSnapshot(view: scala.Double, options: reactDashNativeLib.Anon_Quality): js.Promise[java.lang.String] = js.native
  @JSName("takeSnapshot")
  def takeSnapshot_window(view: reactDashNativeLib.reactDashNativeLibStrings.window): js.Promise[java.lang.String] = js.native
  @JSName("takeSnapshot")
  def takeSnapshot_window(
    view: reactDashNativeLib.reactDashNativeLibStrings.window,
    options: reactDashNativeLib.Anon_Quality
  ): js.Promise[java.lang.String] = js.native
}

