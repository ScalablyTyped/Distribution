package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderHeartsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/Hearts", JSImport.Default)
  @js.native
  val default: FunctionComponent[HeartsProps] = js.native
  
  type HeartsProps = BaseProps
  
  type _To = FunctionComponent[HeartsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderHeartsMod.foo` */
  override def _to: FunctionComponent[HeartsProps] = default
}
