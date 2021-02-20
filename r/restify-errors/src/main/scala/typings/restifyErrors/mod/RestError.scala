package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "RestError")
@js.native
class RestError protected () extends HttpError {
  def this(printf: String, args: js.Any*) = this()
  def this(options: RestifyRestErrorOptions, printf: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  def this(options: RestifyRestErrorOptions, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any, printf: String, args: js.Any*) = this()
  def this(
    priorErr: js.Any,
    options: RestifyRestErrorOptions,
    printf: js.UndefOr[scala.Nothing],
    args: js.Any*
  ) = this()
  def this(priorErr: js.Any, options: RestifyRestErrorOptions, printf: String, args: js.Any*) = this()
  
  var restCode: String = js.native
}
