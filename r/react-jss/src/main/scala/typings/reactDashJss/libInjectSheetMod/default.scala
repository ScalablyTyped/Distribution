package typings.reactDashJss.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss/lib/injectSheet", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def apply[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def apply[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def apply[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
}

