package typings.reactTracking.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T] extends js.Object {
  /**
    * By default, data tracking objects are pushed to `window.dataLayer[]`. This is a good default if you use Google
    * Tag Manager. You can override this by passing in a dispatch function as a second parameter to the tracking
    * decorator `{ dispatch: fn() }` on some top-level component high up in your app (typically some root-level
    * component that wraps your entire app).
    */
  var dispatch: js.UndefOr[js.Function1[/* data */ T, _]] = js.native
  /**
    * To dispatch tracking data when a component mounts, you can pass in `{ dispatchOnMount: true }` as the second
    * parameter to `@track()`. This is useful for dispatching tracking data on "Page" components.
    *
    * If you pass in a function, the function will be called with all of the tracking data from the app's context when
    * the component mounts. The return value of this function will be dispatched in `componentDidMount()`. The object
    * returned from this function call will be merged with the context data and then dispatched. A use case for this
    * would be that you want to provide extra tracking data without adding it to the context.
    */
  var dispatchOnMount: js.UndefOr[Boolean | (js.Function1[/* contextData */ T, T])] = js.native
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
  var process: js.UndefOr[js.Function1[/* ownTrackingData */ T, T | Falsy]] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
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
    def setDispatch(value: /* data */ T => _): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    @scala.inline
    def setDispatchOnMountFunction1(value: /* contextData */ T => T): Self = this.set("dispatchOnMount", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatchOnMount(value: Boolean | (js.Function1[/* contextData */ T, T])): Self = this.set("dispatchOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispatchOnMount: Self = this.set("dispatchOnMount", js.undefined)
    @scala.inline
    def setProcess(value: /* ownTrackingData */ T => T | Falsy): Self = this.set("process", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
  }
  
}

