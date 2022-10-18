package typings.rcTable.anon

import typings.rcTable.libInterfaceMod.ExpandableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expandable[RecordType] extends StObject {
  
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
}
object Expandable {
  
  inline def apply[RecordType](): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable[RecordType]]
  }
  
  extension [Self <: Expandable[?], RecordType](x: Self & Expandable[RecordType]) {
    
    inline def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
  }
}
