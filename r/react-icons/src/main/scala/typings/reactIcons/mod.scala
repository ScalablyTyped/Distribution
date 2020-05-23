package typings.reactIcons

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactIcons.anon.IconBasePropsattrundefine
import typings.reactIcons.iconBaseMod.IconBaseProps
import typings.reactIcons.iconBaseMod.IconTree
import typings.reactIcons.iconsManifestMod.IconManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-icons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DefaultContext: typings.reactIcons.iconContextMod.IconContext = js.native
  val IconContext: Context[typings.reactIcons.iconContextMod.IconContext] = js.native
  val icons: IconManifest = js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = js.native
  def IconBase(props: IconBasePropsattrundefine): Element = js.native
}

