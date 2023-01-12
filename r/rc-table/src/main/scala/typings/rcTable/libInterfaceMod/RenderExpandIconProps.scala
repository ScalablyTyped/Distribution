package typings.rcTable.libInterfaceMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderExpandIconProps[RecordType] extends StObject {
  
  var expandable: Boolean
  
  var expanded: Boolean
  
  var onExpand: TriggerEventHandler[RecordType]
  
  var prefixCls: String
  
  var record: RecordType
}
object RenderExpandIconProps {
  
  inline def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    prefixCls: String,
    record: RecordType
  ): RenderExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderExpandIconProps[RecordType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderExpandIconProps[?], RecordType] (val x: Self & RenderExpandIconProps[RecordType]) extends AnyVal {
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
