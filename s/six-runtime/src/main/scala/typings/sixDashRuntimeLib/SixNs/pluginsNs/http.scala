package typings
package sixDashRuntimeLib.SixNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait http extends js.Object {
  def del(url: js.Any): stdLib.Promise[_] = js.native
  def del(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def get(url: js.Any): stdLib.Promise[_] = js.native
  def get(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def head(url: js.Any): stdLib.Promise[_] = js.native
  def head(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def patch(url: js.Any): stdLib.Promise[_] = js.native
  def patch(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def post(url: js.Any): stdLib.Promise[_] = js.native
  def post(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
  def proxy(options: js.Object): sixDashRuntimeLib.SixNs.middleware = js.native
  def put(url: js.Any): stdLib.Promise[_] = js.native
  def put(url: js.Any, options: js.Object): stdLib.Promise[_] = js.native
}

