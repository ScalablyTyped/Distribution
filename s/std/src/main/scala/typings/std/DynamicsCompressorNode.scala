package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  val attack: AudioParam = js.native
  
  /* standard dom */
  val knee: AudioParam = js.native
  
  /* standard dom */
  val ratio: AudioParam = js.native
  
  /* standard dom */
  val reduction: Double = js.native
  
  /* standard dom */
  val release: AudioParam = js.native
  
  /* standard dom */
  val threshold: AudioParam = js.native
}
