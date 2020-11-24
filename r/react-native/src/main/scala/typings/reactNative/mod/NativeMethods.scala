package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeMethods extends js.Object {
  
  /**
    * Removes focus from an input or view. This is the opposite of `focus()`.
    */
  def blur(): Unit = js.native
  
  /**
    * Requests focus for the given input or view. The exact behavior triggered
    * will depend on the platform and type of view.
    */
  def focus(): Unit = js.native
  
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
  def measure(callback: MeasureOnSuccessCallback): Unit = js.native
  
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
  def measureInWindow(callback: MeasureInWindowOnSuccessCallback): Unit = js.native
  
  def measureLayout(
    relativeToNativeComponentRef: Double,
    onSuccess: MeasureLayoutOnSuccessCallback,
    onFail: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Like [`measure()`](#measure), but measures the view relative an ancestor,
    * specified as `relativeToNativeComponentRef`. This means that the returned x, y
    * are relative to the origin x, y of the ancestor view.
    * _Can also be called with a relativeNativeNodeHandle but is deprecated._
    */
  def measureLayout(
    relativeToNativeComponentRef: HostComponent[_],
    onSuccess: MeasureLayoutOnSuccessCallback,
    onFail: js.Function0[Unit]
  ): Unit = js.native
  
  var refs: StringDictionary[Component[_, _, _]] = js.native
  
  /**
    * This function sends props straight to native. They will not participate in
    * future diff process - this means that if you do not include them in the
    * next render, they will remain active (see [Direct
    * Manipulation](https://reactnative.dev/docs/direct-manipulation)).
    */
  def setNativeProps(nativeProps: js.Object): Unit = js.native
}
