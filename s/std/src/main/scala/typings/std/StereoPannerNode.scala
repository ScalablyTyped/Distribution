package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode)
  */
@js.native
trait StereoPannerNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/pan) */
  /* standard dom */
  val pan: AudioParam = js.native
}
