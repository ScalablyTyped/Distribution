package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSketchapp.anon.Document
import typings.reactSketchapp.anon.Instantiable
import typings.reactSketchapp.anon.SharedObjectID
import typings.reactSketchapp.moduleSymbolMod.SymbolMasterProps
import typings.reactSketchapp.moduleTypesMod.PlatformBridge
import typings.reactSketchapp.moduleTypesMod.SketchDocument
import typings.reactSketchapp.moduleTypesMod.SketchDocumentData
import typings.reactSketchapp.moduleTypesMod.SketchLayer
import typings.reactSketchapp.moduleTypesMod.TextStyle
import typings.reactSketchapp.moduleTypesMod.WrappedSketchDocument
import typings.reactSketchapp.moduleTypesMod.WrappedSketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entrypointDotsketchMod {
  
  @JSImport("react-sketchapp/lib/module/entrypoint.sketch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TextStyles {
    
    @JSImport("react-sketchapp/lib/module/entrypoint.sketch", "TextStyles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def create(styles: StringDictionary[TextStyle]): StringDictionary[SharedObjectID] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[SharedObjectID]]
    inline def create(styles: StringDictionary[TextStyle], options: Unit, platformBridge: PlatformBridge): StringDictionary[SharedObjectID] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[SharedObjectID]]
    inline def create(styles: StringDictionary[TextStyle], options: Document): StringDictionary[SharedObjectID] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[SharedObjectID]]
    inline def create(styles: StringDictionary[TextStyle], options: Document, platformBridge: PlatformBridge): StringDictionary[SharedObjectID] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[SharedObjectID]]
    
    inline def get(name: String): js.UndefOr[TextStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: SketchDocument): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: SketchDocumentData): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    inline def get(name: String, document: WrappedSketchDocument): js.UndefOr[TextStyle] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextStyle]]
    
    inline def registerStyle(name: String, style: TextStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyle")(name.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerStyle(name: String, style: TextStyle, platformBridge: PlatformBridge): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyle")(name.asInstanceOf[js.Any], style.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolve(): js.UndefOr[SharedObjectID] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.UndefOr[SharedObjectID]]
    inline def resolve(style: TextStyle): js.UndefOr[SharedObjectID] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SharedObjectID]]
    
    inline def styles(): StringDictionary[SharedObjectID] = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")().asInstanceOf[StringDictionary[SharedObjectID]]
    
    inline def toJSON(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.SharedStyle */ Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_v1-types.SharedStyle */ Any
      ]]
  }
  
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: Unit, bridge: PlatformBridge): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: SketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: SketchDocumentData): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: SketchDocumentData,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: SketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: String, document: WrappedSketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: String,
    document: WrappedSketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: Unit,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: SketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: SketchDocumentData): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: SketchDocumentData,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: SketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(Component: ComponentType[Any], symbolProps: SymbolMasterProps, document: WrappedSketchDocument): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def makeSymbol(
    Component: ComponentType[Any],
    symbolProps: SymbolMasterProps,
    document: WrappedSketchDocument,
    bridge: PlatformBridge
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(Component.asInstanceOf[js.Any], symbolProps.asInstanceOf[js.Any], document.asInstanceOf[js.Any], bridge.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  
  inline def render(element: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def render(element: ReactElement, container: Unit, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: ReactElement, container: SketchLayer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: ReactElement, container: SketchLayer, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: ReactElement, container: WrappedSketchLayer): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def render(element: ReactElement, container: WrappedSketchLayer, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def renderToJSON(element: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def renderToJSON(element: ReactElement, platformBridge: PlatformBridge): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToJSON")(element.asInstanceOf[js.Any], platformBridge.asInstanceOf[js.Any])).asInstanceOf[Any]
}
