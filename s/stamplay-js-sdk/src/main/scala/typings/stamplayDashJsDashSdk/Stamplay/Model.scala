package typings.stamplayDashJsDashSdk.Stamplay

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends Instantiable0[Model] {
  def destroy(): js.Promise[_] = js.native
  def fetch(id: js.Any): js.Promise[_] = js.native
   // This is suspicious, but tests show model instances being constructable...
  def get(property: String): js.Any = js.native
  def save(): js.Promise[_] = js.native
  def save(arg: js.Any): js.Promise[_] = js.native
  def set(property: String, value: js.Any): Unit = js.native
  def signup(arg: js.Any): js.Promise[_] = js.native
  def unset(property: String): Unit = js.native
   // TODO: Don't know what this is supposed to be.
  def upVote(): js.Promise[_] = js.native
}

