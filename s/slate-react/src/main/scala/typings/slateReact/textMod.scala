package typings.slateReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import typings.slateReact.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("slate-react/dist/components/text", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Parent, Element]] = js.native
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Parent, Element]]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Parent, Element]] = default
}
