package typings.reactDashJss

import typings.reactDashJss.libInjectSheetMod.ClassNameMap
import typings.reactDashJss.libInjectSheetMod.StyleCreator
import typings.reactDashJss.libInjectSheetMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes[S /* <: String | (Styles[String, js.Object]) | (StyleCreator[String, _, js.Object]) */, Props] extends js.Object {
  var classes: ClassNameMap[_ | S]
}

object Anon_Classes {
  @scala.inline
  def apply[S /* <: String | (Styles[String, js.Object]) | (StyleCreator[String, _, js.Object]) */, Props](classes: ClassNameMap[_ | S]): Anon_Classes[S, Props] = {
    val __obj = js.Dynamic.literal(classes = classes)
  
    __obj.asInstanceOf[Anon_Classes[S, Props]]
  }
}

