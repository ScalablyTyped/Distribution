package typings.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.CapturingGroup
  - typings.regexpTree.astMod.NoncapturingGroup
*/
trait Group
  extends StObject
     with Expression
object Group {
  
  inline def CapturingGroup(number: Double): typings.regexpTree.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTree.astMod.CapturingGroup]
  }
  
  inline def NoncapturingGroup(): typings.regexpTree.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpTree.astMod.NoncapturingGroup]
  }
}
