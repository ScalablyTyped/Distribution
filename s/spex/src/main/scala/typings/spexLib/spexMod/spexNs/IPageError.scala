package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/errors.PageError.html
trait IPageError
  extends stdLib.Error {
  var dest: js.Any
  var duration: scala.Double
  // extended properties:
  var error: js.Any
  var index: scala.Double
  var reason: java.lang.String
  var source: js.Any
  @JSName("stack")
  var stack_IPageError: java.lang.String
}

