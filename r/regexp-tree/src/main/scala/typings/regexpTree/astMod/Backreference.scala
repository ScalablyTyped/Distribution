package typings.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.NumericBackreference
  - typings.regexpTree.astMod.NamedBackreference
*/
trait Backreference
  extends StObject
     with Expression
object Backreference {
  
  inline def NamedBackreference(number: Double, reference: String, referenceRaw: String): typings.regexpTree.astMod.NamedBackreference = {
    val __obj = js.Dynamic.literal(kind = "name", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], referenceRaw = referenceRaw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTree.astMod.NamedBackreference]
  }
  
  inline def NumericBackreference(number: Double, reference: Double): typings.regexpTree.astMod.NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[typings.regexpTree.astMod.NumericBackreference]
  }
}
