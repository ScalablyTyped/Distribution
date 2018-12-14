package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NativeMethodsMixinStatic extends js.Object {
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.Component[_, _, _]]
  /**
       * Removes focus from an input or view. This is the opposite of `focus()`.
       */
  def blur(): scala.Unit
  /**
       * Requests focus for the given input or view. The exact behavior triggered
       * will depend on the platform and type of view.
       */
  def focus(): scala.Unit
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
  def measure(callback: MeasureOnSuccessCallback): scala.Unit
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
  def measureInWindow(callback: MeasureInWindowOnSuccessCallback): scala.Unit
  /**
       * Like [`measure()`](#measure), but measures the view relative an ancestor,
       * specified as `relativeToNativeNode`. This means that the returned x, y
       * are relative to the origin x, y of the ancestor view.
       *
       * As always, to obtain a native node handle for a component, you can use
       * `React.findNodeHandle(component)`.
       */
  def measureLayout(
    relativeToNativeNode: scala.Double,
    onSuccess: MeasureLayoutOnSuccessCallback,
    onFail: js.Function0[scala.Unit]
  ): scala.Unit
  /**
       * This function sends props straight to native. They will not participate in
       * future diff process - this means that if you do not include them in the
       * next render, they will remain active (see [Direct
       * Manipulation](docs/direct-manipulation.html)).
       */
  def setNativeProps(nativeProps: js.Object): scala.Unit
}

