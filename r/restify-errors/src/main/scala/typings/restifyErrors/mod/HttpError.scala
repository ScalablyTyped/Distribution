package typings.restifyErrors.mod

import typings.std.Error
import typings.verror.mod.VError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-errors", "HttpError")
@js.native
class HttpError protected () extends VError {
  def this(options: RestifyHttpErrorOptions) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any) = this()
  def this(printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions) = this()
  def this(options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, printf: String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: String, args: js.Any*) = this()
  var body: js.Any = js.native
  var code: String = js.native
  var displayName: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var statusCode: Double = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[Error] = js.native
  def toJSON(): js.Any = js.native
}

