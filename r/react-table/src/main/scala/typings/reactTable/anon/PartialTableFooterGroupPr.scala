package typings.reactTable.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-table.react-table.TableFooterGroupProps> */
trait PartialTableFooterGroupPr extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PartialTableFooterGroupPr {
  
  @scala.inline
  def apply(): PartialTableFooterGroupPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableFooterGroupPr]
  }
  
  @scala.inline
  implicit class PartialTableFooterGroupPrMutableBuilder[Self <: PartialTableFooterGroupPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
