package typings
package reactDashTrackingLib.reactDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
    * By default, data tracking objects are pushed to `window.dataLayer[]`. This is a good default if you use Google
    * Tag Manager. You can override this by passing in a dispatch function as a second parameter to the tracking
    * decorator `{ dispatch: fn() }` on some top-level component high up in your app (typically some root-level
    * component that wraps your entire app).
    */
  var dispatch: js.UndefOr[js.Function1[/* data */ T, _]] = js.undefined
  /**
    * To dispatch tracking data when a component mounts, you can pass in `{ dispatchOnMount: true }` as the second
    * parameter to `@track()`. This is useful for dispatching tracking data on "Page" components.
    *
    * If you pass in a function, the function will be called with all of the tracking data from the app's context when
    * the component mounts. The return value of this function will be dispatched in `componentDidMount()`. The object
    * returned from this function call will be merged with the context data and then dispatched. A use case for this
    * would be that you want to provide extra tracking data without adding it to the context.
    */
  var dispatchOnMount: js.UndefOr[scala.Boolean | (js.Function1[/* contextData */ T, T])] = js.undefined
  /**
    * When there's a need to implicitly dispatch an event with some data for every component, you can define an
    * `options.process` function. This function should be declared once, at some top-level component. It will get
    * called with each component's tracking data as the only argument. The returned object from this function will be
    * merged with all the tracking context data and dispatched in `componentDidMount()`. If a falsy value is returned
    * (`false`, `null`, `undefined`, ...), nothing will be dispatched.
    *
    * A common use case for this is to dispatch a `pageview` event for every component in the application that has a
    * `page` property on its `trackingData`.
    */
  var process: js.UndefOr[js.Function1[/* ownTrackingData */ T, T | reactDashTrackingLib.Falsy]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    dispatch: js.Function1[/* data */ T, _] = null,
    dispatchOnMount: scala.Boolean | (js.Function1[/* contextData */ T, T]) = null,
    process: js.Function1[/* ownTrackingData */ T, T | reactDashTrackingLib.Falsy] = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch)
    if (dispatchOnMount != null) __obj.updateDynamic("dispatchOnMount")(dispatchOnMount.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[Options[T]]
  }
}

