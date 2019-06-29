package typings
package reactDashSelectLib.reactDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val components: stdLib.Required[reactDashSelectLib.srcComponentsMod.SelectComponents[js.Any]] = js.native
  def createFilter(): js.Function2[
    /* option */ reactDashSelectLib.srcFiltersMod.Option, 
    /* rawInput */ java.lang.String, 
    scala.Boolean
  ] = js.native
  def createFilter(config: reactDashSelectLib.srcFiltersMod.Config): js.Function2[
    /* option */ reactDashSelectLib.srcFiltersMod.Option, 
    /* rawInput */ java.lang.String, 
    scala.Boolean
  ] = js.native
  def mergeStyles(source: js.Any, target: js.Any): reactLib.reactMod.CSSProperties = js.native
}

