package typings.reactIcons

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactIcons.anon.IconBasePropsattrundefine
import typings.reactIcons.libEsmIconBaseMod.IconBaseProps
import typings.reactIcons.libEsmIconBaseMod.IconTree
import typings.reactIcons.libEsmIconsManifestMod.IconManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-icons", "DefaultContext")
  @js.native
  val DefaultContext: typings.reactIcons.libEsmIconContextMod.IconContext = js.native
  
  inline def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenIcon")(data.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ IconBaseProps, Element]]
  
  inline def IconBase(props: IconBasePropsattrundefine): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-icons", "IconContext")
  @js.native
  val IconContext: Context[typings.reactIcons.libEsmIconContextMod.IconContext] = js.native
  
  @JSImport("react-icons", "icons")
  @js.native
  val icons: IconManifest = js.native
}
