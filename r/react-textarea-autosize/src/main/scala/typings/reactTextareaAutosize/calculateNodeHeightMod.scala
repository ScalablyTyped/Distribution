package typings.reactTextareaAutosize

import typings.reactTextareaAutosize.getSizingDataMod.SizingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-textarea-autosize/dist/declarations/src/calculateNodeHeight", JSImport.Namespace)
@js.native
object calculateNodeHeightMod extends js.Object {
  
  def default(sizingData: SizingData, value: String): CalculatedNodeHeights = js.native
  def default(sizingData: SizingData, value: String, minRows: js.UndefOr[scala.Nothing], maxRows: Double): CalculatedNodeHeights = js.native
  def default(sizingData: SizingData, value: String, minRows: Double): CalculatedNodeHeights = js.native
  def default(sizingData: SizingData, value: String, minRows: Double, maxRows: Double): CalculatedNodeHeights = js.native
  
  type CalculatedNodeHeights = js.Array[Double]
}
