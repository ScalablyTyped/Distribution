package typings.qtip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QTip2Ns {
  import typings.jquery.JQueryGenericPromise
  import typings.qtip2.JQuery
  import typings.std.Event

  type EventApiFunc = js.Function2[/* event */ Event, /* api */ Api, Unit]
  type Target = JQuery | js.Array[Double] | String
  type Text = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
  /**
  	 * Content property
  	 */
  type Title = String | JQuery | EventApiFunc | Boolean | JQueryGenericPromise[js.Any]
}
