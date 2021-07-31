package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode
  extends StObject
     with AudioNode {
  
  val attack: AudioParam = js.native
  
  val knee: AudioParam = js.native
  
  val ratio: AudioParam = js.native
  
  val reduction: Double = js.native
  
  val release: AudioParam = js.native
  
  val threshold: AudioParam = js.native
}
