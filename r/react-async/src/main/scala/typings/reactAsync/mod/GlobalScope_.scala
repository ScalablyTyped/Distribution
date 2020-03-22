package typings.reactAsync.mod

import typings.reactAsync.AnonInstantiable
import typings.reactAsync.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalScope_ extends js.Object {
  var AbortController: js.UndefOr[AnonInstantiable] = js.undefined
  var __REACT_ASYNC__ : js.Any
  var fetch: FnCall
}

object GlobalScope_ {
  @scala.inline
  def apply(__REACT_ASYNC__ : js.Any, fetch: FnCall, AbortController: AnonInstantiable = null): GlobalScope_ = {
    val __obj = js.Dynamic.literal(__REACT_ASYNC__ = __REACT_ASYNC__.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
    if (AbortController != null) __obj.updateDynamic("AbortController")(AbortController.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalScope_]
  }
}

