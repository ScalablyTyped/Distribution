package typings.reactQuery

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactQuery.anon.PickDetailedHTMLPropsButt
import typings.reactQuery.reactQueryBooleans.`true`
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDevtoolsExplorerMod {
  
  @JSImport("react-query/types/devtools/Explorer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ExplorerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-query/types/devtools/Explorer", "DefaultRenderer")
  @js.native
  val DefaultRenderer: Renderer = js.native
  
  trait Entry extends StObject {
    
    var label: String
  }
  object Entry {
    
    @JSImport("react-query/types/devtools/Explorer", "Entry")
    @js.native
    val ^ : ForwardRefExoticComponent[HTMLAttributes[HTMLDivElement] & RefAttributes[HTMLDivElement]] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-query/types/devtools/Explorer", "ExpandButton")
  @js.native
  val ExpandButton: ForwardRefExoticComponent[PickDetailedHTMLPropsButt] = js.native
  
  inline def Expander(param0: ExpanderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Expander")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-query/types/devtools/Explorer", "Info")
  @js.native
  val Info: ForwardRefExoticComponent[HTMLAttributes[HTMLSpanElement] & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("react-query/types/devtools/Explorer", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[HTMLAttributes[HTMLSpanElement] & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("react-query/types/devtools/Explorer", "LabelButton")
  @js.native
  val LabelButton: ForwardRefExoticComponent[PickDetailedHTMLPropsButt] = js.native
  
  @JSImport("react-query/types/devtools/Explorer", "SubEntries")
  @js.native
  val SubEntries: ForwardRefExoticComponent[HTMLAttributes[HTMLDivElement] & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("react-query/types/devtools/Explorer", "Value")
  @js.native
  val Value: ForwardRefExoticComponent[HTMLAttributes[HTMLSpanElement] & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def chunkArray[T](array: js.Array[T], size: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunkArray")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  trait ExpanderProps extends StObject {
    
    var expanded: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ExpanderProps {
    
    inline def apply(expanded: Boolean): ExpanderProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpanderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpanderProps] (val x: Self) extends AnyVal {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-query.react-query/types/devtools/Explorer.RendererProps> & {  renderer :react-query.react-query/types/devtools/Explorer.Renderer | undefined,   defaultExpanded :true | std.Record<string, boolean> | undefined} */
  trait ExplorerProps extends StObject {
    
    var HandleEntry: js.UndefOr[HandleEntryComponent] = js.undefined
    
    var defaultExpanded: js.UndefOr[`true` | (Record[String, Boolean])] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var renderer: js.UndefOr[Renderer] = js.undefined
    
    var subEntries: js.UndefOr[js.Array[Entry]] = js.undefined
    
    var subEntryPages: js.UndefOr[js.Array[js.Array[Entry]]] = js.undefined
    
    var toggleExpanded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ExplorerProps {
    
    inline def apply(): ExplorerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExplorerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplorerProps] (val x: Self) extends AnyVal {
      
      inline def setDefaultExpanded(value: `true` | (Record[String, Boolean])): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHandleEntry(value: /* props */ typings.reactQuery.anon.Entry => Element): Self = StObject.set(x, "HandleEntry", js.Any.fromFunction1(value))
      
      inline def setHandleEntryUndefined: Self = StObject.set(x, "HandleEntry", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setRenderer(value: /* props */ RendererProps => Element): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSubEntries(value: js.Array[Entry]): Self = StObject.set(x, "subEntries", value.asInstanceOf[js.Any])
      
      inline def setSubEntriesUndefined: Self = StObject.set(x, "subEntries", js.undefined)
      
      inline def setSubEntriesVarargs(value: Entry*): Self = StObject.set(x, "subEntries", js.Array(value*))
      
      inline def setSubEntryPages(value: js.Array[js.Array[Entry]]): Self = StObject.set(x, "subEntryPages", value.asInstanceOf[js.Any])
      
      inline def setSubEntryPagesUndefined: Self = StObject.set(x, "subEntryPages", js.undefined)
      
      inline def setSubEntryPagesVarargs(value: js.Array[Entry]*): Self = StObject.set(x, "subEntryPages", js.Array(value*))
      
      inline def setToggleExpanded(value: () => Unit): Self = StObject.set(x, "toggleExpanded", js.Any.fromFunction0(value))
      
      inline def setToggleExpandedUndefined: Self = StObject.set(x, "toggleExpanded", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type HandleEntryComponent = js.Function1[/* props */ typings.reactQuery.anon.Entry, Element]
  
  type Renderer = js.Function1[/* props */ RendererProps, Element]
  
  trait RendererProps extends StObject {
    
    var HandleEntry: HandleEntryComponent
    
    var expanded: Boolean
    
    var label: js.UndefOr[String] = js.undefined
    
    var pageSize: Double
    
    var subEntries: js.Array[Entry]
    
    var subEntryPages: js.Array[js.Array[Entry]]
    
    def toggleExpanded(): Unit
    
    var `type`: String
    
    var value: Any
  }
  object RendererProps {
    
    inline def apply(
      HandleEntry: /* props */ typings.reactQuery.anon.Entry => Element,
      expanded: Boolean,
      pageSize: Double,
      subEntries: js.Array[Entry],
      subEntryPages: js.Array[js.Array[Entry]],
      toggleExpanded: () => Unit,
      `type`: String,
      value: Any
    ): RendererProps = {
      val __obj = js.Dynamic.literal(HandleEntry = js.Any.fromFunction1(HandleEntry), expanded = expanded.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], subEntries = subEntries.asInstanceOf[js.Any], subEntryPages = subEntryPages.asInstanceOf[js.Any], toggleExpanded = js.Any.fromFunction0(toggleExpanded), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RendererProps] (val x: Self) extends AnyVal {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setHandleEntry(value: /* props */ typings.reactQuery.anon.Entry => Element): Self = StObject.set(x, "HandleEntry", js.Any.fromFunction1(value))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setSubEntries(value: js.Array[Entry]): Self = StObject.set(x, "subEntries", value.asInstanceOf[js.Any])
      
      inline def setSubEntriesVarargs(value: Entry*): Self = StObject.set(x, "subEntries", js.Array(value*))
      
      inline def setSubEntryPages(value: js.Array[js.Array[Entry]]): Self = StObject.set(x, "subEntryPages", value.asInstanceOf[js.Any])
      
      inline def setSubEntryPagesVarargs(value: js.Array[Entry]*): Self = StObject.set(x, "subEntryPages", js.Array(value*))
      
      inline def setToggleExpanded(value: () => Unit): Self = StObject.set(x, "toggleExpanded", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
