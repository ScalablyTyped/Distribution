package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.typeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Hearts", JSImport.Default)
  @js.native
  val default: FunctionComponent[HeartsProps] = js.native
  
  type HeartsProps = BaseProps
  
  type _To = FunctionComponent[HeartsProps]
  
  /* This means you don't have to write `default`, but can instead just say `heartsMod.foo` */
  override def _to: FunctionComponent[HeartsProps] = default
}
