package typings.reactTether

import typings.reactTether.mod.TetherEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTetherStrings {
  
  @js.native
  sealed trait repositioned
    extends StObject
       with TetherEvent
  inline def repositioned: repositioned = "repositioned".asInstanceOf[repositioned]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait update
    extends StObject
       with TetherEvent
  inline def update: update = "update".asInstanceOf[update]
}
