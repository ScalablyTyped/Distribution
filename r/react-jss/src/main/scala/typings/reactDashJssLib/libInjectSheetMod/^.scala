package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss/lib/injectSheet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
}

