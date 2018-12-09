package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: java.lang.String, constructor: js.Function): scala.Unit = js.native
  def define(name: java.lang.String, constructor: js.Function, options: ElementDefinitionOptions): scala.Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def upgrade(root: Node): scala.Unit = js.native
  def whenDefined(name: java.lang.String): js.Promise[scala.Unit] = js.native
}

@JSGlobal("CustomElementRegistry")
@js.native
object CustomElementRegistry
  extends ScalablyTyped.runtime.Instantiable0[CustomElementRegistry]

