package typings.qunitDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssertionsMatchesSelectorMod {
  
  @JSImport("qunit-dom/dist/assertions/matches-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elements: js.Array[Element], compareSelector: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any], compareSelector.asInstanceOf[js.Any])).asInstanceOf[Double]
}
