package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGGeometryElement extends SVGGraphicsElement {
  
  def getPointAtLength(distance: Double): DOMPoint = js.native
  
  def getTotalLength(): Double = js.native
  
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
  
  val pathLength: SVGAnimatedNumber = js.native
}
