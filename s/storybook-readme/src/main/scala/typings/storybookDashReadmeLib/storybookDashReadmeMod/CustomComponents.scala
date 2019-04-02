package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  def FooterComponent(props: storybookDashReadmeLib.Anon_ChildrenElement): reactLib.reactMod.Global.JSXNs.Element
  def PreviewComponent(props: storybookDashReadmeLib.Anon_ChildrenElement): reactLib.reactMod.Global.JSXNs.Element
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: storybookDashReadmeLib.Anon_ChildrenElement => reactLib.reactMod.Global.JSXNs.Element,
    PreviewComponent: storybookDashReadmeLib.Anon_ChildrenElement => reactLib.reactMod.Global.JSXNs.Element
  ): CustomComponents = {
    val __obj = js.Dynamic.literal(FooterComponent = js.Any.fromFunction1(FooterComponent), PreviewComponent = js.Any.fromFunction1(PreviewComponent))
  
    __obj.asInstanceOf[CustomComponents]
  }
}

