package typings.rcTable.anon

import typings.rcTable.interfaceMod.ExpandableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expandable[RecordType] extends StObject {
  
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
}
object Expandable {
  
  @scala.inline
  def apply[RecordType](): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable[RecordType]]
  }
  
  @scala.inline
  implicit class ExpandableMutableBuilder[Self <: Expandable[?], RecordType] (val x: Self & Expandable[RecordType]) extends AnyVal {
    
    @scala.inline
    def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
  }
}
