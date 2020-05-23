package typings.reactAsync.mod

import org.scalablytyped.runtime.Instantiable0
import typings.reactAsync.anon.FnCall
import typings.reactAsync.anon.Instantiable
import typings.std.global.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalScope_ extends js.Object {
  var AbortController: js.UndefOr[Instantiable with Instantiable0[typings.std.global.AbortController]] = js.undefined
  var __REACT_ASYNC__ : js.Any
  var fetch: FnCall
}

object GlobalScope_ {
  @scala.inline
  def apply(
    __REACT_ASYNC__ : js.Any,
    fetch: FnCall,
    AbortController: Instantiable with Instantiable0[AbortController] = null
  ): GlobalScope_ = {
    val __obj = js.Dynamic.literal(__REACT_ASYNC__ = __REACT_ASYNC__.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
    if (AbortController != null) __obj.updateDynamic("AbortController")(AbortController.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalScope_]
  }
}

