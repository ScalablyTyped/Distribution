package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Lights")
@js.native
object Lights extends js.Object {
  
  def ambient(): Light = js.native
  def ambient(opts: LightOptions): Light = js.native
  
  def directional(): Light = js.native
  def directional(opts: LightOptions): Light = js.native
  
  def point(): Light = js.native
  def point(opts: LightOptions): Light = js.native
}
