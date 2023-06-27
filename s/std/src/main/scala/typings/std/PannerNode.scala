package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels!
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode)
  */
@js.native
trait PannerNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneInnerAngle) */
  /* standard dom */
  var coneInnerAngle: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterAngle) */
  /* standard dom */
  var coneOuterAngle: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterGain) */
  /* standard dom */
  var coneOuterGain: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel) */
  /* standard dom */
  var distanceModel: DistanceModelType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/maxDistance) */
  /* standard dom */
  var maxDistance: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationX) */
  /* standard dom */
  val orientationX: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationY) */
  /* standard dom */
  val orientationY: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationZ) */
  /* standard dom */
  val orientationZ: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel) */
  /* standard dom */
  var panningModel: PanningModelType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionX) */
  /* standard dom */
  val positionX: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionY) */
  /* standard dom */
  val positionY: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionZ) */
  /* standard dom */
  val positionZ: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/refDistance) */
  /* standard dom */
  var refDistance: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/rolloffFactor) */
  /* standard dom */
  var rolloffFactor: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/setOrientation)
    */
  /* standard dom */
  def setOrientation(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/setPosition)
    */
  /* standard dom */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}
