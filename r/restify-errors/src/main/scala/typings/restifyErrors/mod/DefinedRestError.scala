package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "DefinedRestError")
@js.native
class DefinedRestError () extends RestError {
  // tslint:disable-next-line unified-signatures
  def this(printf: String, args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: Unit, args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: Unit, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: Unit, args: js.Any*) = this()
}
