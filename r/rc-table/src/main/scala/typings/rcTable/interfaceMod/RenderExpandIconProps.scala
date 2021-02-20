package typings.rcTable.interfaceMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderExpandIconProps[RecordType] extends StObject {
  
  var expandable: Boolean = js.native
  
  var expanded: Boolean = js.native
  
  var onExpand: TriggerEventHandler[RecordType] = js.native
  
  var prefixCls: String = js.native
  
  var record: RecordType = js.native
}
object RenderExpandIconProps {
  
  @scala.inline
  def apply[RecordType](
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
  implicit class RenderExpandIconPropsMutableBuilder[Self <: RenderExpandIconProps[_], RecordType] (val x: Self with RenderExpandIconProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExpand(value: (RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
