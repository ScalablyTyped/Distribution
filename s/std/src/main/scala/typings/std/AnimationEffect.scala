package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffect extends StObject {
  
  /* standard dom */
  def getComputedTiming(): ComputedEffectTiming = js.native
  
  /* standard dom */
  def getTiming(): EffectTiming = js.native
  
  /* standard dom */
  def updateTiming(): Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): Unit = js.native
}
