package typings.reactTypesShared

import typings.react.mod.Key
import typings.reactTypesShared.reactTypesSharedStrings.all
import typings.reactTypesShared.reactTypesSharedStrings.checkbox
import typings.reactTypesShared.reactTypesSharedStrings.highlight
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.selection
    - typings.reactTypesShared.reactTypesSharedStrings.all
  */
  trait DisabledBehavior extends StObject
  object DisabledBehavior {
    
    inline def all: typings.reactTypesShared.reactTypesSharedStrings.all = "all".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.all]
    
    inline def selection: typings.reactTypesShared.reactTypesSharedStrings.selection = "selection".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.selection]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.first
    - typings.reactTypesShared.reactTypesSharedStrings.last
  */
  trait FocusStrategy extends StObject
  object FocusStrategy {
    
    inline def first: typings.reactTypesShared.reactTypesSharedStrings.first = "first".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.first]
    
    inline def last: typings.reactTypesShared.reactTypesSharedStrings.last = "last".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.last]
  }
  
  trait MultipleSelection extends StObject {
    
    /** The initial selected keys in the collection (uncontrolled). */
    var defaultSelectedKeys: js.UndefOr[all | js.Iterable[Key]] = js.undefined
    
    /** The currently disabled keys in the collection (controlled). */
    var disabledKeys: js.UndefOr[js.Iterable[Key]] = js.undefined
    
    /** Whether the collection allows empty selection. */
    var disallowEmptySelection: js.UndefOr[Boolean] = js.undefined
    
    /** Handler that is called when the selection changes. */
    var onSelectionChange: js.UndefOr[js.Function1[/* keys */ Selection, Any]] = js.undefined
    
    /** The currently selected keys in the collection (controlled). */
    var selectedKeys: js.UndefOr[all | js.Iterable[Key]] = js.undefined
    
    /** The type of selection that is allowed in the collection. */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object MultipleSelection {
    
    inline def apply(): MultipleSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipleSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleSelection] (val x: Self) extends AnyVal {
      
      inline def setDefaultSelectedKeys(value: all | js.Iterable[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDisabledKeys(value: js.Iterable[Key]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      inline def setDisallowEmptySelection(value: Boolean): Self = StObject.set(x, "disallowEmptySelection", value.asInstanceOf[js.Any])
      
      inline def setDisallowEmptySelectionUndefined: Self = StObject.set(x, "disallowEmptySelection", js.undefined)
      
      inline def setOnSelectionChange(value: /* keys */ Selection => Any): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelectedKeys(value: all | js.Iterable[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
  
  type Selection = all | Set[Key]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.toggle
    - typings.reactTypesShared.reactTypesSharedStrings.replace
  */
  trait SelectionBehavior extends StObject
  object SelectionBehavior {
    
    inline def replace: typings.reactTypesShared.reactTypesSharedStrings.replace = "replace".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.replace]
    
    inline def toggle: typings.reactTypesShared.reactTypesSharedStrings.toggle = "toggle".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.toggle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.none
    - typings.reactTypesShared.reactTypesSharedStrings.single
    - typings.reactTypesShared.reactTypesSharedStrings.multiple
  */
  trait SelectionMode extends StObject
  object SelectionMode {
    
    inline def multiple: typings.reactTypesShared.reactTypesSharedStrings.multiple = "multiple".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.multiple]
    
    inline def none: typings.reactTypesShared.reactTypesSharedStrings.none = "none".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.none]
    
    inline def single: typings.reactTypesShared.reactTypesSharedStrings.single = "single".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.single]
  }
  
  trait SingleSelection extends StObject {
    
    /** The initial selected key in the collection (uncontrolled). */
    var defaultSelectedKey: js.UndefOr[Key] = js.undefined
    
    /** Whether the collection allows empty selection. */
    var disallowEmptySelection: js.UndefOr[Boolean] = js.undefined
    
    /** Handler that is called when the selection changes. */
    var onSelectionChange: js.UndefOr[js.Function1[/* key */ Key, Any]] = js.undefined
    
    /** The currently selected key in the collection (controlled). */
    var selectedKey: js.UndefOr[Key | Null] = js.undefined
  }
  object SingleSelection {
    
    inline def apply(): SingleSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleSelection] (val x: Self) extends AnyVal {
      
      inline def setDefaultSelectedKey(value: Key): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      inline def setDisallowEmptySelection(value: Boolean): Self = StObject.set(x, "disallowEmptySelection", value.asInstanceOf[js.Any])
      
      inline def setDisallowEmptySelectionUndefined: Self = StObject.set(x, "disallowEmptySelection", js.undefined)
      
      inline def setOnSelectionChange(value: /* key */ Key => Any): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelectedKey(value: Key): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyNull: Self = StObject.set(x, "selectedKey", null)
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
  
  trait SpectrumSelectionProps extends StObject {
    
    /** How selection should be displayed. */
    var selectionStyle: js.UndefOr[checkbox | highlight] = js.undefined
  }
  object SpectrumSelectionProps {
    
    inline def apply(): SpectrumSelectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrumSelectionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpectrumSelectionProps] (val x: Self) extends AnyVal {
      
      inline def setSelectionStyle(value: checkbox | highlight): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    }
  }
}
