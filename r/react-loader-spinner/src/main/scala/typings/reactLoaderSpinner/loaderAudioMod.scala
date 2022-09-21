package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderAudioMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/Audio", JSImport.Default)
  @js.native
  val default: FunctionComponent[AudioProps] = js.native
  
  type AudioProps = BaseProps
  
  type _To = FunctionComponent[AudioProps]
  
  /* This means you don't have to write `default`, but can instead just say `loaderAudioMod.foo` */
  override def _to: FunctionComponent[AudioProps] = default
}
