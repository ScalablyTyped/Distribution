package typings.reactVirtualized.esTableMod

import typings.reactVirtualized.reactVirtualizedStrings.ASC
import typings.reactVirtualized.reactVirtualizedStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortDirectionStatic extends js.Object {
  
  /**
    * Sort items in ascending order.
    * This means arranging from the lowest value to the highest (e.g. a-z, 0-9).
    */
  var ASC: typings.reactVirtualized.reactVirtualizedStrings.ASC = js.native
  
  /**
    * Sort items in descending order.
    * This means arranging from the highest value to the lowest (e.g. z-a, 9-0).
    */
  var DESC: typings.reactVirtualized.reactVirtualizedStrings.DESC = js.native
}
object SortDirectionStatic {
  
  @scala.inline
  def apply(ASC: ASC, DESC: DESC): SortDirectionStatic = {
    val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortDirectionStatic]
  }
  
  @scala.inline
  implicit class SortDirectionStaticOps[Self <: SortDirectionStatic] (val x: Self) extends AnyVal {
    
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
    def setASC(value: ASC): Self = this.set("ASC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESC(value: DESC): Self = this.set("DESC", value.asInstanceOf[js.Any])
  }
}
