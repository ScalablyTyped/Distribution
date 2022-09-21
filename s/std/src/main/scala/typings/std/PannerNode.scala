package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels! */
@js.native
trait PannerNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  var coneInnerAngle: Double = js.native
  
  /* standard dom */
  var coneOuterAngle: Double = js.native
  
  /* standard dom */
  var coneOuterGain: Double = js.native
  
  /* standard dom */
  var distanceModel: DistanceModelType = js.native
  
  /* standard dom */
  var maxDistance: Double = js.native
  
  /* standard dom */
  val orientationX: AudioParam = js.native
  
  /* standard dom */
  val orientationY: AudioParam = js.native
  
  /* standard dom */
  val orientationZ: AudioParam = js.native
  
  /* standard dom */
  var panningModel: PanningModelType = js.native
  
  /* standard dom */
  val positionX: AudioParam = js.native
  
  /* standard dom */
  val positionY: AudioParam = js.native
  
  /* standard dom */
  val positionZ: AudioParam = js.native
  
  /* standard dom */
  var refDistance: Double = js.native
  
  /* standard dom */
  var rolloffFactor: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def setOrientation(x: Double, y: Double, z: Double): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}
