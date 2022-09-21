package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify-errors", "UpgradeRequiredError")
@js.native
open class UpgradeRequiredError () extends DefinedHttpError {
  // tslint:disable-next-line unified-signatures
  def this(printf: String, args: Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(options: RestifyHttpErrorOptions, printf: String, args: Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: Unit, args: Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: Any, printf: String, args: Any*) = this()
  def this(priorErr: Any, printf: Unit, args: Any*) = this()
  def this(priorErr: Any, options: RestifyHttpErrorOptions, printf: String, args: Any*) = this()
  def this(priorErr: Any, options: RestifyHttpErrorOptions, printf: Unit, args: Any*) = this()
}
