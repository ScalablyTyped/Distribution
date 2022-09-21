package typings.rcImage

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.imageMod.CompoundedComponent
import typings.rcImage.imageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-image", JSImport.Default)
  @js.native
  val default: CompoundedComponent[ImageProps] = js.native
  
  type _To = CompoundedComponent[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: CompoundedComponent[ImageProps] = default
}
