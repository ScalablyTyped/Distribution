package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.ReorderImpact
  - typings.reactBeautifulDnd.mod.CombineImpact
*/
trait ImpactLocation extends StObject
object ImpactLocation {
  
  @scala.inline
  def CombineImpact(combine: Combine, `type`: COMBINE): typings.reactBeautifulDnd.mod.CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.CombineImpact]
  }
  
  @scala.inline
  def ReorderImpact(destination: DraggableLocation, `type`: REORDER): typings.reactBeautifulDnd.mod.ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBeautifulDnd.mod.ReorderImpact]
  }
}
