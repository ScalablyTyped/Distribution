package typings
package reactDashSelectLib.reactDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val components: stdLib.Required[reactDashSelectLib.libComponentsMod.SelectComponents[js.Any]] = js.native
  def createFilter(): js.Function2[
    /* option */ reactDashSelectLib.libFiltersMod.Option, 
    /* rawInput */ java.lang.String, 
    scala.Boolean
  ] = js.native
  def createFilter(config: reactDashSelectLib.libFiltersMod.Config): js.Function2[
    /* option */ reactDashSelectLib.libFiltersMod.Option, 
    /* rawInput */ java.lang.String, 
    scala.Boolean
  ] = js.native
  def makeAnimated[OptionType](): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType](externalComponents: reactDashSelectLib.libComponentsMod.SelectComponentsConfig[OptionType]): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  def mergeStyles(source: js.Any, target: js.Any): reactLib.reactMod.ReactNs.CSSProperties = js.native
}

