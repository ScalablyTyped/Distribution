package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderCirclesMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/Circles", JSImport.Default)
  @js.native
  val default: FunctionComponent[CirclesProps] = js.native
  
  type CirclesProps = BaseProps
  
  type _To = FunctionComponent[CirclesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderCirclesMod.foo` */
  override def _to: FunctionComponent[CirclesProps] = default
}
