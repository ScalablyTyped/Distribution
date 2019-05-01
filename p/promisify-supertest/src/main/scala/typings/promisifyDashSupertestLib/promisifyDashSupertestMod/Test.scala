package typings
package promisifyDashSupertestLib.promisifyDashSupertestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test
  extends superagentLib.superagentMod.SuperAgentRequest {
  def expect(body: java.lang.String): this.type = js.native
  def expect(body: java.lang.String, callback: CallbackHandler): this.type = js.native
  def expect(body: js.Object): this.type = js.native
  def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
  def expect(body: stdLib.RegExp): this.type = js.native
  def expect(body: stdLib.RegExp, callback: CallbackHandler): this.type = js.native
  def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
  def expect(field: java.lang.String, `val`: java.lang.String): this.type = js.native
  def expect(field: java.lang.String, `val`: java.lang.String, callback: CallbackHandler): this.type = js.native
  def expect(field: java.lang.String, `val`: stdLib.RegExp): this.type = js.native
  def expect(field: java.lang.String, `val`: stdLib.RegExp, callback: CallbackHandler): this.type = js.native
  def expect(status: scala.Double): this.type = js.native
  def expect(status: scala.Double, body: java.lang.String): this.type = js.native
  def expect(status: scala.Double, body: java.lang.String, callback: CallbackHandler): this.type = js.native
  def expect(status: scala.Double, callback: CallbackHandler): this.type = js.native
  def serverAddress(app: js.Any, path: java.lang.String): java.lang.String = js.native
}

