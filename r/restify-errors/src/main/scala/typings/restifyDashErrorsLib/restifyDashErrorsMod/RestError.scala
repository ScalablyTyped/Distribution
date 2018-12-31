package typings
package restifyDashErrorsLib.restifyDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-errors", "RestError")
@js.native
class RestError protected () extends HttpError {
  def this(options: RestifyRestErrorOptions) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any) = this()
  def this(printf: java.lang.String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyRestErrorOptions) = this()
  def this(options: RestifyRestErrorOptions, printf: java.lang.String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: java.lang.String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyRestErrorOptions, printf: java.lang.String, args: js.Any*) = this()
  var restCode: java.lang.String = js.native
}

