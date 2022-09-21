package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.Asterisk
import typings.regexpTree.regexpTreeStrings.Plussign
import typings.regexpTree.regexpTreeStrings.Questionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.SimpleQuantifier
  - typings.regexpTree.astMod.RangeQuantifier
*/
trait Quantifier extends StObject
object Quantifier {
  
  inline def RangeQuantifier(from: Double, greedy: Boolean): typings.regexpTree.astMod.RangeQuantifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], greedy = greedy.asInstanceOf[js.Any], kind = "Range")
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typings.regexpTree.astMod.RangeQuantifier]
  }
  
  inline def SimpleQuantifier(greedy: Boolean, kind: Plussign | Asterisk | Questionmark): typings.regexpTree.astMod.SimpleQuantifier = {
    val __obj = js.Dynamic.literal(greedy = greedy.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Quantifier")
    __obj.asInstanceOf[typings.regexpTree.astMod.SimpleQuantifier]
  }
}
