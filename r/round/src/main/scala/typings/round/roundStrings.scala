package typings.round

import typings.round.mod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roundStrings {
  
  @js.native
  sealed trait down
    extends StObject
       with Direction
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait up
    extends StObject
       with Direction
  inline def up: up = "up".asInstanceOf[up]
}
