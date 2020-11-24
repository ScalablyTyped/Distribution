package typings.reactVirtualized.anon

import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellSizeAndPositionGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabel extends js.Object {
  
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
  implicit class ArialabelOps[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAria-label`(value: Requireable[String]): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCount(value: Validator[Double]): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellGroupRenderer(value: Validator[CollectionCellGroupRenderer]): Self = this.set("cellGroupRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: Validator[CollectionCellRenderer]): Self = this.set("cellRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSizeAndPositionGetter(value: Validator[CollectionCellSizeAndPositionGetter]): Self = this.set("cellSizeAndPositionGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSize(value: Requireable[Double]): Self = this.set("sectionSize", value.asInstanceOf[js.Any])
  }
}
