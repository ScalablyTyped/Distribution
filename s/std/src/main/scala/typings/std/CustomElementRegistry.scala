package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: java.lang.String, constructor: js.Function): Unit = js.native
  def define(name: java.lang.String, constructor: js.Function, options: ElementDefinitionOptions): Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def upgrade(root: Node): Unit = js.native
  def whenDefined(name: java.lang.String): js.Promise[Unit] = js.native
}

@JSGlobal("CustomElementRegistry")
@js.native
class CustomElementRegistryCls () extends CustomElementRegistry

@JSGlobal("CustomElementRegistry")
@js.native
object CustomElementRegistry extends Instantiable0[CustomElementRegistry]

