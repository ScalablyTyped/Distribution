package typings.reactInnertext

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-innertext", JSImport.Namespace)
  @js.native
  val ^ : InnerText = js.native
  
  @js.native
  trait InnerText extends StObject {
    
    def apply(jsx: ReactNode): String = js.native
    
    var default: InnerText = js.native
  }
  
  type _To = InnerText
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: InnerText = ^
}
