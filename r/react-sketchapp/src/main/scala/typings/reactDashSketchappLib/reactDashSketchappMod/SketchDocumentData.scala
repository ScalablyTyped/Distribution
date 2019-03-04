package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocumentData extends js.Object {
  def assets(): SketchAssetCollection
  def layerStyles(): scala.Unit
  def layerSymbols(): scala.Unit
  def layerTextStyles(): SketchSharedStyleContainer
}

object SketchDocumentData {
  @scala.inline
  def apply(
    assets: js.Function0[SketchAssetCollection],
    layerStyles: js.Function0[scala.Unit],
    layerSymbols: js.Function0[scala.Unit],
    layerTextStyles: js.Function0[SketchSharedStyleContainer]
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(assets = assets, layerStyles = layerStyles, layerSymbols = layerSymbols, layerTextStyles = layerTextStyles)
  
    __obj.asInstanceOf[SketchDocumentData]
  }
}

