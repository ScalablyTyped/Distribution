package typings.riot

import org.scalablytyped.runtime.StringDictionary
import typings.riot.anon.Attributes
import typings.riot.anon.ParentScope
import typings.riot.riotStrings.$
import typings.riot.riotStrings.DollarDollar
import typings.riot.riotStrings.mount
import typings.riot.riotStrings.name
import typings.riot.riotStrings.props
import typings.riot.riotStrings.root
import typings.riot.riotStrings.slots
import typings.riot.riotStrings.state
import typings.riot.riotStrings.unmount
import typings.riot.riotStrings.update
import typings.riotjsDomBindings.mod.BindingData
import typings.riotjsDomBindings.mod.SlotBindingData
import typings.riotjsDomBindings.mod.TemplateChunk
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("riot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def component[Props, State, Component](wrapper: RiotComponentWrapper[Component]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[ParentScope], 
    Component
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(wrapper.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[ParentScope], 
    Component
  ]]
  
  inline def install(plugin: ComponentEnhancer): InstalledPluginsSet = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(plugin.asInstanceOf[js.Any]).asInstanceOf[InstalledPluginsSet]
  
  inline def mount[Props, State](selector: String): js.Array[RiotComponent[Props, State]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: String, initialProps: Props): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: String, initialProps: Props, componentName: String): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: String, initialProps: Unit, componentName: String): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: HTMLElement): js.Array[RiotComponent[Props, State]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: HTMLElement, initialProps: Props): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: HTMLElement, initialProps: Props, componentName: String): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  inline def mount[Props, State](selector: HTMLElement, initialProps: Unit, componentName: String): js.Array[RiotComponent[Props, State]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(selector.asInstanceOf[js.Any], initialProps.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RiotComponent[Props, State]]]
  
  inline def pure[InitialProps, Context, FactoryFunction](func: FactoryFunction): FactoryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(func.asInstanceOf[js.Any]).asInstanceOf[FactoryFunction]
  
  inline def register[Props, State](componentName: String, wrapper: RiotComponentWrapper[RiotComponent[Props, State]]): RegisteredComponentsMap = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(componentName.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[RegisteredComponentsMap]
  
  inline def uninstall(plugin: ComponentEnhancer): InstalledPluginsSet = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(plugin.asInstanceOf[js.Any]).asInstanceOf[InstalledPluginsSet]
  
  inline def unmount(selector: String): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def unmount(selector: String, keepRootElement: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(selector.asInstanceOf[js.Any], keepRootElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def unmount(selector: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def unmount(selector: HTMLElement, keepRootElement: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(selector.asInstanceOf[js.Any], keepRootElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def unregister(componentName: String): RegisteredComponentsMap = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(componentName.asInstanceOf[js.Any]).asInstanceOf[RegisteredComponentsMap]
  
  @JSImport("riot", "version")
  @js.native
  val version: String = js.native
  
  inline def withTypes[Component /* <: RiotComponent[Any, Any] */, ComponentObjectWithoutInitialState](component: AutobindObjectMethods[ComponentObjectWithoutInitialState, Component]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("withTypes")(component.asInstanceOf[js.Any]).asInstanceOf[Component]
  inline def withTypes[Component /* <: RiotComponent[Any, Any] */, ComponentFactory](fn: ComponentFactory): js.Function0[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTypes")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Component]]
  
  inline def withTypes_ComponentComponentObjectWithInitialState[Component /* <: RiotComponent[Any, Any] */, ComponentObjectWithInitialState](component: AutobindObjectMethods[ComponentObjectWithInitialState, Component]): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("withTypes")(component.asInstanceOf[js.Any]).asInstanceOf[Component]
  
  /* Inlined {[ K in keyof Object ]: Object[K] extends (args : any): any? (this : This, args : std.Parameters<Object[K]>): std.ReturnType<Object[K]> : Object[K]} */
  trait AutobindObjectMethods[Object, This] extends StObject {
    
    var constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends (args : any): any ? (this : This, args : std.Parameters<std.Function>): std.ReturnType<std.Function> : std.Function */ js.Any
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.Object): boolean>): std.ReturnType<(v : std.Object): boolean> : (v : std.Object): boolean */ js.Any
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("toLocaleString")
    var toLocaleString_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any
    
    @JSName("toString")
    var toString_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any
    
    @JSName("valueOf")
    var valueOf_FAutobindObjectMethods: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends (args : any): any ? (this : This, args : std.Parameters<(): std.Object>): std.ReturnType<(): std.Object> : (): std.Object */ js.Any
  }
  object AutobindObjectMethods {
    
    inline def apply[Object, This](
      constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends (args : any): any ? (this : This, args : std.Parameters<std.Function>): std.ReturnType<std.Function> : std.Function */ js.Any,
      hasOwnProperty: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any,
      isPrototypeOf: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.Object): boolean>): std.ReturnType<(v : std.Object): boolean> : (v : std.Object): boolean */ js.Any,
      propertyIsEnumerable: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any,
      toLocaleString: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any,
      toString_ : /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any,
      valueOf: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends (args : any): any ? (this : This, args : std.Parameters<(): std.Object>): std.ReturnType<(): std.Object> : (): std.Object */ js.Any
    ): AutobindObjectMethods[Object, This] = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = hasOwnProperty.asInstanceOf[js.Any], isPrototypeOf = isPrototypeOf.asInstanceOf[js.Any], propertyIsEnumerable = propertyIsEnumerable.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], valueOf = valueOf.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutobindObjectMethods[Object, This]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutobindObjectMethods[?, ?], Object, This] (val x: Self & (AutobindObjectMethods[Object, This])) extends AnyVal {
      
      inline def setConstructor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends (args : any): any ? (this : This, args : std.Parameters<std.Function>): std.ReturnType<std.Function> : std.Function */ js.Any
      ): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setHasOwnProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "hasOwnProperty", value.asInstanceOf[js.Any])
      
      inline def setIsPrototypeOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.Object): boolean>): std.ReturnType<(v : std.Object): boolean> : (v : std.Object): boolean */ js.Any
      ): Self = StObject.set(x, "isPrototypeOf", value.asInstanceOf[js.Any])
      
      inline def setPropertyIsEnumerable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends (args : any): any ? (this : This, args : std.Parameters<(v : std.PropertyKey): boolean>): std.ReturnType<(v : std.PropertyKey): boolean> : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "propertyIsEnumerable", value.asInstanceOf[js.Any])
      
      inline def setToLocaleString(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any
      ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToString_(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends (args : any): any ? (this : This, args : std.Parameters<(): string>): std.ReturnType<(): string> : (): string */ js.Any
      ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setValueOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends (args : any): any ? (this : This, args : std.Parameters<(): std.Object>): std.ReturnType<(): std.Object> : (): std.Object */ js.Any
      ): Self = StObject.set(x, "valueOf", value.asInstanceOf[js.Any])
    }
  }
  
  type ComponentEnhancer = js.Function1[/* component */ RiotComponent[Any, Any], RiotComponent[Any, Any]]
  
  type InstalledPluginsSet = Set[ComponentEnhancer]
  
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[/* param0 */ Attributes[Context, InitialProps], RiotPureComponent[Context]]
  
  type RegisteredComponentsMap = Map[String, js.Function0[RiotComponent[Any, Any]]]
  
  @js.native
  trait RiotComponent[Props, State] extends StObject {
    
    // Helpers
    @JSName("$")
    def $(selector: String): Element | Null = js.native
    
    @JSName("$$")
    def DollarDollar(selector: String): js.Array[Element] = js.native
    
    // optional alias to map the children component names
    var components: js.UndefOr[RiotComponentsMap] = js.native
    
    def mount(element: HTMLElement): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: State): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: State, parentScope: js.Object): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: Unit, parentScope: js.Object): RiotComponent[Props, State] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    // lifecycle methods
    var onBeforeMount: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    var onBeforeUnmount: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    var onBeforeUpdate: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    var onMounted: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    var onUnmounted: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    var onUpdated: js.UndefOr[js.Function2[/* props */ Props, /* state */ State, Unit]] = js.native
    
    // automatically generated on any component instance
    val props: Props = js.native
    
    val root: HTMLElement = js.native
    
    // state handling methods
    var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* oldProps */ Props, Boolean]] = js.native
    
    val slots: js.Array[SlotBindingData[Any]] = js.native
    
    // mutable state property
    var state: State = js.native
    
    def unmount(): RiotComponent[Props, State] = js.native
    def unmount(keepRootElement: Boolean): RiotComponent[Props, State] = js.native
    
    def update(): RiotComponent[Props, State] = js.native
    def update(newState: Unit, parentScope: js.Object): RiotComponent[Props, State] = js.native
    def update(newState: Partial[State]): RiotComponent[Props, State] = js.native
    def update(newState: Partial[State], parentScope: js.Object): RiotComponent[Props, State] = js.native
  }
  
  @js.native
  trait RiotComponentFactoryFunction[Component] extends StObject {
    
    def apply(): Component = js.native
    
    var components: js.UndefOr[RiotComponentsMap] = js.native
  }
  
  type RiotComponentWithoutInternals[Component /* <: RiotComponent[Any, Any] */] = Omit[
    Component, 
    props | root | name | slots | mount | update | unmount | $ | DollarDollar
  ]
  
  type RiotComponentWithoutInternalsAndInitialState[Component /* <: RiotComponent[Any, Any] */] = Omit[RiotComponentWithoutInternals[Component], state]
  
  trait RiotComponentWrapper[Component] extends StObject {
    
    val css: js.UndefOr[String | Null] = js.undefined
    
    val exports: js.UndefOr[RiotComponentFactoryFunction[Component] | Component | Null] = js.undefined
    
    val name: js.UndefOr[String | Null] = js.undefined
    
    var template: js.UndefOr[
        js.Function4[
          /* template */ js.Function2[
            /* template */ String, 
            /* bindings */ js.UndefOr[js.Array[BindingData[Component]]], 
            TemplateChunk[Component, Any]
          ], 
          /* expressionTypes */ Record[
            /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionType * / any */ String, 
            Double
          ], 
          /* bindingTypes */ Record[
            /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingType * / any */ String, 
            Double
          ], 
          /* getComponent */ js.Function1[/* componentName */ String, Any], 
          (TemplateChunk[Component, Any]) | Null
        ]
      ] = js.undefined
  }
  object RiotComponentWrapper {
    
    inline def apply[Component](): RiotComponentWrapper[Component] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RiotComponentWrapper[Component]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RiotComponentWrapper[?], Component] (val x: Self & RiotComponentWrapper[Component]) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setExports(value: RiotComponentFactoryFunction[Component] | Component): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsNull: Self = StObject.set(x, "exports", null)
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTemplate(
        value: (/* template */ js.Function2[
              /* template */ String, 
              /* bindings */ js.UndefOr[js.Array[BindingData[Component]]], 
              TemplateChunk[Component, Any]
            ], /* expressionTypes */ Record[
              /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionType * / any */ String, 
              Double
            ], /* bindingTypes */ Record[
              /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingType * / any */ String, 
              Double
            ], /* getComponent */ js.Function1[/* componentName */ String, Any]) => (TemplateChunk[Component, Any]) | Null
      ): Self = StObject.set(x, "template", js.Any.fromFunction4(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  type RiotComponentsMap = StringDictionary[RiotComponentWrapper[RiotComponent[Any, Any]]]
  
  @js.native
  trait RiotPureComponent[Context] extends StObject {
    
    def mount(element: HTMLElement): RiotPureComponent[Context] = js.native
    def mount(element: HTMLElement, context: Context): RiotPureComponent[Context] = js.native
    
    def unmount(keepRootElement: Boolean): RiotPureComponent[Context] = js.native
    
    def update(): RiotPureComponent[Context] = js.native
    def update(context: Context): RiotPureComponent[Context] = js.native
  }
}
