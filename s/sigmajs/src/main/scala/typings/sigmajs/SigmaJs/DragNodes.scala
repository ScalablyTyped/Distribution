package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type DragNodes = (sigma : sigmajs.SigmaJs.Sigma, renderer : sigmajs.SigmaJs.Renderer): sigmajs.SigmaJs.DragNodes
}}}
to avoid circular code involving: 
- sigmajs.SigmaJs.DragNodes
*/
@js.native
trait DragNodes extends StObject {
  
  def apply(sigma: Sigma, renderer: Renderer): DragNodes = js.native
}
