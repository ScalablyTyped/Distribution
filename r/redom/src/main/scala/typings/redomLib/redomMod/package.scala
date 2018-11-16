package typings
package redomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redomMod {
  type RedomElement = stdLib.Node | RedomComponent
  type RedomMiddleware = js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]
  type RedomQuery = java.lang.String | RedomElement
  type RedomQueryArgument = RedomQueryArgumentValue | js.Array[RedomQueryArgumentValue]
  type RedomQueryArgumentValue = RedomElement | java.lang.String | scala.Double | ScalablyTyped.runtime.StringDictionary[js.Any] | RedomMiddleware
}
