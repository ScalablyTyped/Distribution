package typings.reactDomFactories

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactDOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-dom-factories", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ReactDOM = js.native
  
  type _To = js.Object & ReactDOM
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ReactDOM = ^
}
