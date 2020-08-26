package typings.restifyErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-errors", "DefinedRestError")
@js.native
class DefinedRestError () extends RestError {
  // tslint:disable-next-line unified-signatures
  def this(printf: String, args: js.Any*) = this()
  def this(options: RestifyHttpErrorOptions, printf: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any, printf: String, args: js.Any*) = this()
  def this(
    priorErr: js.Any,
    options: RestifyHttpErrorOptions,
    printf: js.UndefOr[scala.Nothing],
    args: js.Any*
  ) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
}

