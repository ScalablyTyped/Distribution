package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss/lib/injectSheet", JSImport.Namespace)
@js.native
object libInjectSheetModMembers extends js.Object {
  def default[C /* <: java.lang.String */, T /* <: js.Object */](stylesOrCreator: StyleCreator[C, T]): PropInjector[WithSheet[C, T], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */](stylesOrCreator: StyleCreator[C, T], options: InjectOptions): PropInjector[WithSheet[C, T], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */](stylesOrCreator: Styles[C]): PropInjector[WithSheet[C, T], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */](stylesOrCreator: Styles[C], options: InjectOptions): PropInjector[WithSheet[C, T], StyledComponentProps[C]] = js.native
}

