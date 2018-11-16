package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMethod extends js.Object {
  /** Method options */
  var options: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Request type */
  var requestType: java.lang.String
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Response type */
  var responseType: java.lang.String
  /** Method type */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

