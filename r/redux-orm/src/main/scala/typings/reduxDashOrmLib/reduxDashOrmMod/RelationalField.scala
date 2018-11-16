package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "RelationalField")
@js.native
class RelationalField protected () extends js.Object {
  def this(opts: RelationalFieldOpts) = this()
  def this(toModelName: java.lang.String) = this()
  def this(toModelName: java.lang.String, relatedName: java.lang.String) = this()
  @JSName("getClass")
  var getClass_FRelationalField: ScalablyTyped.runtime.Instantiable2[
    /* toModelName */ java.lang.String, 
    /* relatedName */ js.UndefOr[/* relatedName */ java.lang.String], 
    RelationalField
  ] = js.native
}

