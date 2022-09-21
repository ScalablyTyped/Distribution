package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.constantsMod.ERR_NOT_OWNER
import typings.screepsArena.constantsMod.OK
import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructionSite
  extends StObject
     with GameObject {
  
  // TODO: ConstructionSite object now has a new property structure that links to the corresponding Structure object.
  // It will be the live object instance that will appear when the construction site is completed. You can check what structure is being constructed using the instanceof operator:
  /**
    * Whether it is your construction site.
    */
  var my: Boolean = js.native
  
  /**
    * The current construction progress.
    */
  var progress: Double = js.native
  
  /**
    * The total construction progress needed for the structure to be built.
    */
  var progressTotal: Double = js.native
  
  def remove(): ERR_NOT_OWNER | OK = js.native
  
  /**
    * One of the STRUCTURE_PROTOTYPES entries
    */
  var structurePrototypeName: String = js.native
}
object ConstructionSite {
  
  inline def apply: ConstructionSiteConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("ConstructionSite").asInstanceOf[ConstructionSiteConstructor]
}
