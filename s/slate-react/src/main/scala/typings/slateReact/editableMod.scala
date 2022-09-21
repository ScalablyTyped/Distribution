package typings.slateReact

import typings.react.mod.ElementType
import typings.react.mod.SyntheticEvent
import typings.react.mod.TextareaHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.slate.nodeMod.Node
import typings.slate.nodeMod.NodeEntry
import typings.slate.rangeMod.Range
import typings.slate.textMod.Text
import typings.slateReact.anon.ContentEditable
import typings.slateReact.anon.Dataslateinline
import typings.slateReact.anon.Dataslateleaf
import typings.slateReact.reactEditorMod.ReactEditor
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableMod {
  
  @JSImport("slate-react/dist/components/editable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DefaultPlaceholder(hasAttributesChildren: RenderPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPlaceholder")(hasAttributesChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Editable(props: EditableProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Editable")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def defaultDecorate(entry: NodeEntry[Node]): js.Array[Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultDecorate")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[Range]]
  
  inline def hasEditableTarget(editor: ReactEditor): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEditableTarget")(editor.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean]
  inline def hasEditableTarget(editor: ReactEditor, target: EventTarget): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasEditableTarget")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean]
  
  inline def hasTarget(editor: ReactEditor): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTarget")(editor.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean]
  inline def hasTarget(editor: ReactEditor, target: EventTarget): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTarget")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean]
  
  inline def isDOMEventHandled[E /* <: Event */](event: E): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMEventHandled")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDOMEventHandled[E /* <: Event */](event: E, handler: js.Function1[/* event */ E, Unit | Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDOMEventHandled")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEventHandled[EventType /* <: SyntheticEvent[Any, Any] */](event: EventType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventHandled")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEventHandled[EventType /* <: SyntheticEvent[Any, Any] */](event: EventType, handler: js.Function1[/* event */ EventType, Unit | Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEventHandled")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTargetInsideNonReadonlyVoid(editor: ReactEditor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetInsideNonReadonlyVoid")(editor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTargetInsideNonReadonlyVoid(editor: ReactEditor, target: EventTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetInsideNonReadonlyVoid")(editor.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait EditableProps
    extends StObject
       with TextareaHTMLAttributes[HTMLDivElement] {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var decorate: js.UndefOr[js.Function1[/* entry */ NodeEntry[Node], js.Array[Range]]] = js.undefined
    
    var onDOMBeforeInput: js.UndefOr[js.Function1[/* event */ InputEvent, Unit]] = js.undefined
    
    var renderElement: js.UndefOr[js.Function1[/* props */ RenderElementProps, Element]] = js.undefined
    
    var renderLeaf: js.UndefOr[js.Function1[/* props */ RenderLeafProps, Element]] = js.undefined
    
    var renderPlaceholder: js.UndefOr[js.Function1[/* props */ RenderPlaceholderProps, Element]] = js.undefined
    
    @JSName("role")
    var role_EditableProps: js.UndefOr[String] = js.undefined
    
    var scrollSelectionIntoView: js.UndefOr[
        js.Function2[
          /* editor */ ReactEditor, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMRange */ /* domRange */ Any, 
          Unit
        ]
      ] = js.undefined
  }
  object EditableProps {
    
    inline def apply(): EditableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableProps]
    }
    
    extension [Self <: EditableProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDecorate(value: /* entry */ NodeEntry[Node] => js.Array[Range]): Self = StObject.set(x, "decorate", js.Any.fromFunction1(value))
      
      inline def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
      
      inline def setOnDOMBeforeInput(value: /* event */ InputEvent => Unit): Self = StObject.set(x, "onDOMBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnDOMBeforeInputUndefined: Self = StObject.set(x, "onDOMBeforeInput", js.undefined)
      
      inline def setRenderElement(value: /* props */ RenderElementProps => Element): Self = StObject.set(x, "renderElement", js.Any.fromFunction1(value))
      
      inline def setRenderElementUndefined: Self = StObject.set(x, "renderElement", js.undefined)
      
      inline def setRenderLeaf(value: /* props */ RenderLeafProps => Element): Self = StObject.set(x, "renderLeaf", js.Any.fromFunction1(value))
      
      inline def setRenderLeafUndefined: Self = StObject.set(x, "renderLeaf", js.undefined)
      
      inline def setRenderPlaceholder(value: /* props */ RenderPlaceholderProps => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
      
      inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScrollSelectionIntoView(
        value: (/* editor */ ReactEditor, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMRange */ /* domRange */ Any) => Unit
      ): Self = StObject.set(x, "scrollSelectionIntoView", js.Any.fromFunction2(value))
      
      inline def setScrollSelectionIntoViewUndefined: Self = StObject.set(x, "scrollSelectionIntoView", js.undefined)
    }
  }
  
  trait RenderElementProps extends StObject {
    
    var attributes: Dataslateinline
    
    var children: Any
    
    var element: typings.slate.elementMod.Element
  }
  object RenderElementProps {
    
    inline def apply(attributes: Dataslateinline, children: Any, element: typings.slate.elementMod.Element): RenderElementProps = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderElementProps]
    }
    
    extension [Self <: RenderElementProps](x: Self) {
      
      inline def setAttributes(value: Dataslateinline): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setElement(value: typings.slate.elementMod.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderLeafProps extends StObject {
    
    var attributes: Dataslateleaf
    
    var children: Any
    
    var leaf: Text
    
    var text: Text
  }
  object RenderLeafProps {
    
    inline def apply(attributes: Dataslateleaf, children: Any, leaf: Text, text: Text): RenderLeafProps = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderLeafProps]
    }
    
    extension [Self <: RenderLeafProps](x: Self) {
      
      inline def setAttributes(value: Dataslateleaf): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setLeaf(value: Text): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderPlaceholderProps extends StObject {
    
    var attributes: ContentEditable
    
    var children: Any
  }
  object RenderPlaceholderProps {
    
    inline def apply(attributes: ContentEditable, children: Any): RenderPlaceholderProps = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderPlaceholderProps]
    }
    
    extension [Self <: RenderPlaceholderProps](x: Self) {
      
      inline def setAttributes(value: ContentEditable): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
