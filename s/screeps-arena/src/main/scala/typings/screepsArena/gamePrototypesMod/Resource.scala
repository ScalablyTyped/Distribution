package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.gamePrototypesMod.^
import typings.screepsArena.screepsArenaStrings.energy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource
  extends StObject
     with GameObject {
  
  var amount: Double = js.native
  
  var resourceType: energy = js.native
}
object Resource {
  
  inline def apply: Constructor[Resource] = ^.asInstanceOf[js.Dynamic].selectDynamic("Resource").asInstanceOf[Constructor[Resource]]
}
