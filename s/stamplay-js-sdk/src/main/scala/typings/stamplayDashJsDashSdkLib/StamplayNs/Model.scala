package typings
package stamplayDashJsDashSdkLib.StamplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model
  extends ScalablyTyped.runtime.Instantiable0[Model] {
  def destroy(): stdLib.Promise[_] = js.native
  def fetch(id: js.Any): stdLib.Promise[_] = js.native
   // This is suspicious, but tests show model instances being constructable...
  def get(property: java.lang.String): js.Any = js.native
  def save(): stdLib.Promise[_] = js.native
  def save(arg: js.Any): stdLib.Promise[_] = js.native
  def set(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def signup(arg: js.Any): stdLib.Promise[_] = js.native
  def unset(property: java.lang.String): scala.Unit = js.native
   // TODO: Don't know what this is supposed to be.
  def upVote(): stdLib.Promise[_] = js.native
}

