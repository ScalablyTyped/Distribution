package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderBarsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/Bars", JSImport.Default)
  @js.native
  val default: FunctionComponent[BarsProps] = js.native
  
  type BarsProps = BaseProps
  
  type _To = FunctionComponent[BarsProps]
  
  /* This means you don't have to write `default`, but can instead just say `loaderBarsMod.foo` */
  override def _to: FunctionComponent[BarsProps] = default
}
