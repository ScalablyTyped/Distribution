package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: java.lang.String, constructor: Function): scala.Unit = js.native
  def define(name: java.lang.String, constructor: Function, options: ElementDefinitionOptions): scala.Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def upgrade(root: Node): scala.Unit = js.native
  def whenDefined(name: java.lang.String): Promise[scala.Unit] = js.native
}

@JSGlobal("CustomElementRegistry")
@js.native
object CustomElementRegistry
  extends org.scalablytyped.runtime.Instantiable0[CustomElementRegistry]

