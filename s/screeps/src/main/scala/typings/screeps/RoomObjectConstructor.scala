package typings.screeps

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomObjectConstructor
  extends StObject
     with Constructor[RoomObject]
     with Instantiable3[/* x */ Double, /* y */ Double, /* roomName */ String, RoomObject] {
  
  def apply(x: Double, y: Double, roomName: String): RoomObject = js.native
}
