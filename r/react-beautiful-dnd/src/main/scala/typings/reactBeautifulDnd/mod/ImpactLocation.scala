package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.ReorderImpact
  - typings.reactBeautifulDnd.mod.CombineImpact
*/
trait ImpactLocation extends StObject
object ImpactLocation {
  
  inline def CombineImpact(combine: Combine): typings.reactBeautifulDnd.mod.CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMBINE")
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.CombineImpact]
  }
  
  inline def ReorderImpact(destination: DraggableLocation): typings.reactBeautifulDnd.mod.ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REORDER")
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.ReorderImpact]
  }
}
