package typings
package qtip2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QTip2Ns {
  type EventApiFunc = js.Function2[/* event */ stdLib.Event, /* api */ Api, scala.Unit]
  type Target = qtip2Lib.JQuery | js.Array[scala.Double] | java.lang.String
  type Text = java.lang.String | qtip2Lib.JQuery | EventApiFunc | scala.Boolean | jqueryLib.JQueryGenericPromise[js.Any]
  /**
  	 * Content property
  	 */
  type Title = java.lang.String | qtip2Lib.JQuery | EventApiFunc | scala.Boolean | jqueryLib.JQueryGenericPromise[js.Any]
}
