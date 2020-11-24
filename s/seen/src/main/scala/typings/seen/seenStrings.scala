package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object seenStrings {
  
  @scala.inline
  def ambient: ambient = "ambient".asInstanceOf[ambient]
  
  @scala.inline
  def directional: directional = "directional".asInstanceOf[directional]
  
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait ambient extends js.Object
  
  @js.native
  sealed trait directional extends js.Object
  
  @js.native
  sealed trait point extends js.Object
}
