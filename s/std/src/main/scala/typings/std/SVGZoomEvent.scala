package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGZoomEvent
  extends StObject
     with UIEvent {
  
  val newScale: Double = js.native
  
  val newTranslate: SVGPoint = js.native
  
  val previousScale: Double = js.native
  
  val previousTranslate: SVGPoint = js.native
  
  val zoomRectScreen: SVGRect = js.native
}
