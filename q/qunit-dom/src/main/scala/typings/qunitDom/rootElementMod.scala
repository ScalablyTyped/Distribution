package typings.qunitDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootElementMod {
  
  @JSImport("qunit-dom/dist/root-element", "getRootElement")
  @js.native
  def getRootElement(): Element = js.native
  
  @JSImport("qunit-dom/dist/root-element", "overrideRootElement")
  @js.native
  def overrideRootElement(fn: js.Function0[Element]): Unit = js.native
}
