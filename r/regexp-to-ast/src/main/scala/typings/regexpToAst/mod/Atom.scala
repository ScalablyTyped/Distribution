package typings.regexpToAst.mod

import typings.regexpToAst.anon.Begin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpToAst.mod.Character
  - typings.regexpToAst.mod.Set
  - typings.regexpToAst.mod.Group
  - typings.regexpToAst.mod.GroupBackReference
*/
trait Atom
  extends StObject
     with Term
object Atom {
  
  inline def Character(loc: Begin, value: Double): typings.regexpToAst.mod.Character = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Character")
    __obj.asInstanceOf[typings.regexpToAst.mod.Character]
  }
  
  inline def Group(capturing: Boolean, loc: Begin, value: Disjunction): typings.regexpToAst.mod.Group = {
    val __obj = js.Dynamic.literal(capturing = capturing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typings.regexpToAst.mod.Group]
  }
  
  inline def GroupBackReference(loc: Begin, value: Double): typings.regexpToAst.mod.GroupBackReference = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GroupBackReference")
    __obj.asInstanceOf[typings.regexpToAst.mod.GroupBackReference]
  }
  
  inline def Set(complement: Boolean, loc: Begin, value: js.Array[Double | Range]): typings.regexpToAst.mod.Set = {
    val __obj = js.Dynamic.literal(complement = complement.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Set")
    __obj.asInstanceOf[typings.regexpToAst.mod.Set]
  }
}
