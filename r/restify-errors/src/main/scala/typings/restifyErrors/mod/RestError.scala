package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "RestError")
@js.native
open class RestError protected () extends HttpError {
  def this(printf: String, args: Any*) = this()
  def this(options: RestifyRestErrorOptions, printf: String, args: Any*) = this()
  def this(options: RestifyRestErrorOptions, printf: Unit, args: Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: Any, printf: String, args: Any*) = this()
  def this(priorErr: Any, printf: Unit, args: Any*) = this()
  def this(priorErr: Any, options: RestifyRestErrorOptions, printf: String, args: Any*) = this()
  def this(priorErr: Any, options: RestifyRestErrorOptions, printf: Unit, args: Any*) = this()
  
  var restCode: String = js.native
}
