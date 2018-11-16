package typings
package restifyDashErrorsLib.restifyDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-errors", "HttpError")
@js.native
class HttpError protected ()
  extends verrorLib.verrorMod.VError {
  def this(options: RestifyHttpErrorOptions) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any) = this()
  def this(printf: java.lang.String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions) = this()
  def this(options: RestifyHttpErrorOptions, printf: java.lang.String, args: js.Any*) = this()
  // tslint:disable-next-line unified-signatures
  def this(priorErr: js.Any, printf: java.lang.String, args: js.Any*) = this()
  def this(priorErr: js.Any, options: RestifyHttpErrorOptions, printf: java.lang.String, args: js.Any*) = this()
  var body: js.Any = js.native
  var code: java.lang.String = js.native
  var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var statusCode: scala.Double = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[stdLib.Error] = js.native
  def toJSON(): js.Any = js.native
}

