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
    assets: () => SketchAssetCollection,
    layerStyles: () => scala.Unit,
    layerSymbols: () => scala.Unit,
    layerTextStyles: () => SketchSharedStyleContainer
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(assets = js.Any.fromFunction0(assets), layerStyles = js.Any.fromFunction0(layerStyles), layerSymbols = js.Any.fromFunction0(layerSymbols), layerTextStyles = js.Any.fromFunction0(layerTextStyles))
  
    __obj.asInstanceOf[SketchDocumentData]
  }
}

