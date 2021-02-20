package typings.riot

import org.scalablytyped.runtime.StringDictionary
import typings.riot.anon.Attributes
import typings.riot.anon.ParentScope
import typings.riotjsDomBindings.mod.BindingType
import typings.riotjsDomBindings.mod.ExpressionType
import typings.riotjsDomBindings.mod.SlotBindingData
import typings.riotjsDomBindings.mod.TemplateChunk
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("riot", "component")
  @js.native
  def component[Props, State](shell: RiotComponentShell[Props, State]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[ParentScope], 
    RiotComponent[Props, State]
  ] = js.native
  
  @JSImport("riot", "install")
  @js.native
  def install(plugin: ComponentEnhancer): InstalledPluginsSet = js.native
  
  @JSImport("riot", "mount")
  @js.native
  def mount[Props, State](selector: String): js.Array[RiotComponent[Props, State]] = js.native
  @JSImport("riot", "mount")
  @js.native
  def mount[Props, State](selector: String, initialProps: Props): js.Array[RiotComponent[Props, State]] = js.native
  @JSImport("riot", "mount")
  @js.native
  def mount[Props, State](selector: String, initialProps: Props, componentName: String): js.Array[RiotComponent[Props, State]] = js.native
  @JSImport("riot", "mount")
  @js.native
  def mount[Props, State](selector: String, initialProps: js.UndefOr[scala.Nothing], componentName: String): js.Array[RiotComponent[Props, State]] = js.native
  
  @JSImport("riot", "pure")
  @js.native
  def pure[InitialProps, Context, FactoryFunction](func: FactoryFunction): FactoryFunction = js.native
  
  @JSImport("riot", "register")
  @js.native
  def register[Props, State](componentName: String, shell: RiotComponentShell[Props, State]): RegisteredComponentsMap = js.native
  
  @JSImport("riot", "uninstall")
  @js.native
  def uninstall(plugin: ComponentEnhancer): InstalledPluginsSet = js.native
  
  @JSImport("riot", "unmount")
  @js.native
  def unmount(selector: String, keepRootElement: Boolean): js.Array[HTMLElement] = js.native
  
  @JSImport("riot", "unregister")
  @js.native
  def unregister(componentName: String): RegisteredComponentsMap = js.native
  
  @JSImport("riot", "version")
  @js.native
  val version: String = js.native
  
  type ComponentEnhancer = js.Function1[/* component */ RiotComponent[js.Any, js.Any], RiotComponent[js.Any, js.Any]]
  
  type InstalledPluginsSet = Set[ComponentEnhancer]
  
  type PureComponentFactoryFunction[InitialProps, Context] = js.Function1[/* hasSlotsAttributesProps */ Attributes[InitialProps], RiotPureComponent[Context]]
  
  type RegisteredComponentsMap = Map[String, js.Function0[RiotComponent[js.Object, js.Object]]]
  
  @js.native
  trait RiotComponent[Props, State]
    extends RiotComponentExport[Props, State]
       with RiotCoreComponent[Props, State]
  
  @js.native
  trait RiotComponentExport[Props, State]
    extends /* key */ StringDictionary[js.Any] {
    
    // optional alias to map the children component names
    var components: js.UndefOr[StringDictionary[RiotComponentShell[Props, State]]] = js.native
    
    // lifecycle methods
    var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    var onMounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    var onUpdated: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
    
    // state handling methods
    var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* currentProps */ Props, Boolean]] = js.native
    
    // optional on the component object
    var state: js.UndefOr[State] = js.native
  }
  object RiotComponentExport {
    
    @scala.inline
    def apply[Props, State](): RiotComponentExport[Props, State] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RiotComponentExport[Props, State]]
    }
    
    @scala.inline
    implicit class RiotComponentExportMutableBuilder[Self <: RiotComponentExport[_, _], Props, State] (val x: Self with (RiotComponentExport[Props, State])) extends AnyVal {
      
      @scala.inline
      def setComponents(value: StringDictionary[RiotComponentShell[Props, State]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setOnBeforeMount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onBeforeMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeMountUndefined: Self = StObject.set(x, "onBeforeMount", js.undefined)
      
      @scala.inline
      def setOnBeforeUnmount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onBeforeUnmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeUnmountUndefined: Self = StObject.set(x, "onBeforeUnmount", js.undefined)
      
      @scala.inline
      def setOnBeforeUpdate(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onBeforeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeUpdateUndefined: Self = StObject.set(x, "onBeforeUpdate", js.undefined)
      
      @scala.inline
      def setOnMounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onMounted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMountedUndefined: Self = StObject.set(x, "onMounted", js.undefined)
      
      @scala.inline
      def setOnUnmounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onUnmounted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnmountedUndefined: Self = StObject.set(x, "onUnmounted", js.undefined)
      
      @scala.inline
      def setOnUpdated(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self = StObject.set(x, "onUpdated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdatedUndefined: Self = StObject.set(x, "onUpdated", js.undefined)
      
      @scala.inline
      def setShouldUpdate(value: (/* newProps */ Props, /* currentProps */ Props) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait RiotComponentShell[Props, State] extends StObject {
    
    val css: js.UndefOr[String] = js.native
    
    val exports: js.UndefOr[js.Function0[(RiotComponentExport[Props, State]) | js.Object]] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    def template(
      template: js.Function,
      expressionTypes: ExpressionType,
      bindingTypes: BindingType,
      getComponent: js.Function1[/* componentName */ String, _]
    ): TemplateChunk[_, _] = js.native
  }
  object RiotComponentShell {
    
    @scala.inline
    def apply[Props, State](
      template: (js.Function, ExpressionType, BindingType, js.Function1[/* componentName */ String, _]) => TemplateChunk[_, _]
    ): RiotComponentShell[Props, State] = {
      val __obj = js.Dynamic.literal(template = js.Any.fromFunction4(template))
      __obj.asInstanceOf[RiotComponentShell[Props, State]]
    }
    
    @scala.inline
    implicit class RiotComponentShellMutableBuilder[Self <: RiotComponentShell[_, _], Props, State] (val x: Self with (RiotComponentShell[Props, State])) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setExports(value: () => (RiotComponentExport[Props, State]) | js.Object): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTemplate(
        value: (js.Function, ExpressionType, BindingType, js.Function1[/* componentName */ String, _]) => TemplateChunk[_, _]
      ): Self = StObject.set(x, "template", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait RiotCoreComponent[Props, State] extends StObject {
    
    // Helpers
    @JSName("$")
    def $(selector: String): HTMLElement = js.native
    
    @JSName("$$")
    def DollarDollar(selector: String): js.Array[HTMLElement] = js.native
    
    def mount(element: HTMLElement): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: State): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: State, parentScope: js.Object): RiotComponent[Props, State] = js.native
    def mount(element: HTMLElement, initialState: js.UndefOr[scala.Nothing], parentScope: js.Object): RiotComponent[Props, State] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    // automatically generated on any component instance
    val props: Props = js.native
    
    val root: HTMLElement = js.native
    
    val slots: js.Array[SlotBindingData] = js.native
    
    def unmount(keepRootElement: Boolean): RiotComponent[Props, State] = js.native
    
    def update(): RiotComponent[Props, State] = js.native
    def update(newState: js.UndefOr[scala.Nothing], parentScope: js.Object): RiotComponent[Props, State] = js.native
    def update(newState: Partial[State]): RiotComponent[Props, State] = js.native
    def update(newState: Partial[State], parentScope: js.Object): RiotComponent[Props, State] = js.native
  }
  
  @js.native
  trait RiotPureComponent[Context] extends StObject {
    
    def mount(element: HTMLElement): RiotPureComponent[Context] = js.native
    def mount(element: HTMLElement, context: Context): RiotPureComponent[Context] = js.native
    
    def unmount(keepRootElement: Boolean): RiotPureComponent[Context] = js.native
    
    def update(): RiotPureComponent[Context] = js.native
    def update(context: Context): RiotPureComponent[Context] = js.native
  }
}
