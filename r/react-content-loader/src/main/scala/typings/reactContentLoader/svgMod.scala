package typings.reactContentLoader

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactContentLoader.mod.IContentLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod extends Shortcut {
  
  @JSImport("react-content-loader/dist/web/Svg", JSImport.Default)
  @js.native
  val default: FC[IContentLoaderProps] = js.native
  
  type _To = FC[IContentLoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `svgMod.foo` */
  override def _to: FC[IContentLoaderProps] = default
}
