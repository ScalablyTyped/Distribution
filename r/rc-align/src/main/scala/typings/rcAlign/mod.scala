package typings.rcAlign

import org.scalablytyped.runtime.Shortcut
import typings.rcAlign.alignMod.AlignProps
import typings.rcAlign.alignMod.RefAlign
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-align", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = js.native
  
  type _To = ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = default
}
