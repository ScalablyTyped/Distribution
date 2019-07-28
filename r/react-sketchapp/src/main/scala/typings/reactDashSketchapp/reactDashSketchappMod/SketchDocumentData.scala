package typings.reactDashSketchapp.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocumentData extends js.Object {
  def assets(): SketchAssetCollection
  def layerStyles(): Unit
  def layerSymbols(): Unit
  def layerTextStyles(): SketchSharedStyleContainer
}

object SketchDocumentData {
  @scala.inline
  def apply(
    assets: () => SketchAssetCollection,
    layerStyles: () => Unit,
    layerSymbols: () => Unit,
    layerTextStyles: () => SketchSharedStyleContainer
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(assets = js.Any.fromFunction0(assets), layerStyles = js.Any.fromFunction0(layerStyles), layerSymbols = js.Any.fromFunction0(layerSymbols), layerTextStyles = js.Any.fromFunction0(layerTextStyles))
  
    __obj.asInstanceOf[SketchDocumentData]
  }
}

