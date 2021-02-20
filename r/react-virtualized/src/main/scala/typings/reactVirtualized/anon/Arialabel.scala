package typings.reactVirtualized.anon

import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellSizeAndPositionGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabel extends StObject {
  
  var `aria-label`: Requireable[String] = js.native
  
  var cellCount: Validator[Double] = js.native
  
  var cellGroupRenderer: Validator[CollectionCellGroupRenderer] = js.native
  
  var cellRenderer: Validator[CollectionCellRenderer] = js.native
  
  var cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter] = js.native
  
  var sectionSize: Requireable[Double] = js.native
}
object Arialabel {
  
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellCount: Validator[Double],
    cellGroupRenderer: Validator[CollectionCellGroupRenderer],
    cellRenderer: Validator[CollectionCellRenderer],
    cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter],
    sectionSize: Requireable[Double]
  ): Arialabel = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellGroupRenderer = cellGroupRenderer.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], cellSizeAndPositionGetter = cellSizeAndPositionGetter.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit class ArialabelMutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: Requireable[String]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCount(value: Validator[Double]): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellGroupRenderer(value: Validator[CollectionCellGroupRenderer]): Self = StObject.set(x, "cellGroupRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: Validator[CollectionCellRenderer]): Self = StObject.set(x, "cellRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSizeAndPositionGetter(value: Validator[CollectionCellSizeAndPositionGetter]): Self = StObject.set(x, "cellSizeAndPositionGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSize(value: Requireable[Double]): Self = StObject.set(x, "sectionSize", value.asInstanceOf[js.Any])
  }
}
