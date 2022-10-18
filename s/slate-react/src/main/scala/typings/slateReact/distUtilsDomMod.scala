package typings.slateReact

import typings.slateReact.distPluginReactEditorMod.ReactEditor
import typings.slateReact.distUtilsDomMod.global.Window
import typings.slateReact.slateReactStrings.backward
import typings.slateReact.slateReactStrings.forward
import typings.std.ClipboardEvent
import typings.std.DataTransfer
import typings.std.MutationRecord
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsDomMod {
  
  @JSImport("slate-react/dist/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClipboardData(dataTransfer: DataTransfer): DataTransfer = ^.asInstanceOf[js.Dynamic].applyDynamic("getClipboardData")(dataTransfer.asInstanceOf[js.Any]).asInstanceOf[DataTransfer]
  
  inline def getDefaultView(value: Any): Window | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultView")(value.asInstanceOf[js.Any]).asInstanceOf[Window | Null]
  
  inline def getEditableChild(
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMElement */ Any,
    index: Double,
    direction: forward | backward
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEditableChild")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getEditableChildAndIndex(
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMElement */ Any,
    index: Double,
    direction: forward | backward
  ): js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEditableChildAndIndex")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any, 
    Double
  ]]
  
  inline def getPlainText(
    domNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlainText")(domNode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSlateFragmentAttribute(dataTransfer: DataTransfer): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlateFragmentAttribute")(dataTransfer.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def hasShadowRoot(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasShadowRoot")().asInstanceOf[Boolean]
  
  inline def isDOMComment(value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMComment * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMComment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMComment * / any */ Boolean]
  
  inline def isDOMElement(value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMElement * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMElement")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMElement * / any */ Boolean]
  
  inline def isDOMNode(value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMNode * / any */ Boolean]
  
  inline def isDOMSelection(value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMSelection * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMSelection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMSelection * / any */ Boolean]
  
  inline def isDOMText(value: Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMText * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMText")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMText * / any */ Boolean]
  
  inline def isPlainTextOnlyPaste(event: ClipboardEvent): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainTextOnlyPaste")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def isTrackedMutation(editor: ReactEditor, mutation: MutationRecord, batch: js.Array[MutationRecord]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTrackedMutation")(editor.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeDOMPoint(domPoint: DOMPoint): DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeDOMPoint")(domPoint.asInstanceOf[js.Any]).asInstanceOf[DOMPoint]
  
  type DOMPoint = js.Tuple2[Node, Double]
  
  object global {
    
    trait Window extends StObject {
      
      var DataTransfer: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataTransfer * / any['constructor'] */ js.Any
      
      var Node: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofNode['constructor'] */ js.Any
      
      var Selection: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofSelection['constructor'] */ js.Any
    }
    object Window {
      
      inline def apply(
        DataTransfer: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataTransfer * / any['constructor'] */ js.Any,
        Node: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofNode['constructor'] */ js.Any,
        Selection: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofSelection['constructor'] */ js.Any
      ): Window = {
        val __obj = js.Dynamic.literal(DataTransfer = DataTransfer.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setDataTransfer(
          value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataTransfer * / any['constructor'] */ js.Any
        ): Self = StObject.set(x, "DataTransfer", value.asInstanceOf[js.Any])
        
        inline def setNode(
          value: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofNode['constructor'] */ js.Any
        ): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
        
        inline def setSelection(
          value: /* import warning: importer.ImportType#apply Failed type conversion: slate-react.anon.TypeofSelection['constructor'] */ js.Any
        ): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      }
    }
  }
}
