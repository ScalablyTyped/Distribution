package typings
package storybookDashReadmeLib.storybookDashReadmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  def FooterComponent(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.Global.JSXNs.Element
  def PreviewComponent(props: storybookDashReadmeLib.Anon_Children): reactLib.reactMod.Global.JSXNs.Element
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: js.Function1[storybookDashReadmeLib.Anon_Children, reactLib.reactMod.Global.JSXNs.Element],
    PreviewComponent: js.Function1[storybookDashReadmeLib.Anon_Children, reactLib.reactMod.Global.JSXNs.Element]
  ): CustomComponents = {
    val __obj = js.Dynamic.literal(FooterComponent = FooterComponent, PreviewComponent = PreviewComponent)
  
    __obj.asInstanceOf[CustomComponents]
  }
}

