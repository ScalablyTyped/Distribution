package typings.reactIcons

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactIcons.anon.IconBasePropsattrundefine
import typings.reactIcons.iconBaseMod.IconBaseProps
import typings.reactIcons.iconBaseMod.IconTree
import typings.reactIcons.iconsManifestMod.IconManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icons", "DefaultContext")
  @js.native
  val DefaultContext: typings.reactIcons.iconContextMod.IconContext = js.native
  
  @JSImport("react-icons", "GenIcon")
  @js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = js.native
  
  @JSImport("react-icons", "IconBase")
  @js.native
  def IconBase(props: IconBasePropsattrundefine): Element = js.native
  
  @JSImport("react-icons", "IconContext")
  @js.native
  val IconContext: Context[typings.reactIcons.iconContextMod.IconContext] = js.native
  
  @JSImport("react-icons", "icons")
  @js.native
  val icons: IconManifest = js.native
}
