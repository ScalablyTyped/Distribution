package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect) */
@js.native
trait AnimationEffect extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getComputedTiming) */
  /* standard dom */
  def getComputedTiming(): ComputedEffectTiming = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming) */
  /* standard dom */
  def getTiming(): EffectTiming = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/updateTiming) */
  /* standard dom */
  def updateTiming(): Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): Unit = js.native
}
