package typings.reactLoadableVisibility

import typings.loadableComponent.anon.Default
import typings.loadableComponent.anon.FnCall
import typings.loadableComponent.mod.DefaultComponent
import typings.loadableComponent.mod.LoadableClassComponent
import typings.loadableComponent.mod.LoadableComponent
import typings.loadableComponent.mod.Options
import typings.loadableComponent.mod.OptionsWithResolver
import typings.loadableComponent.mod.OptionsWithoutResolver
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined {None <Component extends react.react.ComponentClass<any, react.react.ComponentState>>(loadFn : (props : react.react.ComponentProps<Component>): std.Promise<Component | {  default :Component}>, options : @loadable/component.@loadable/component.Options<react.react.ComponentProps<Component>, Component> | undefined): @loadable/component.@loadable/component.LoadableClassComponent<Component>, None <Props>(loadFn : (props : Props): std.Promise<@loadable/component.@loadable/component.DefaultComponent<Props>>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableComponent<Props>, None <Props, Module = @loadable/component.@loadable/component.DefaultComponent<Props>>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithResolver<Props, Module>): @loadable/component.@loadable/component.LoadableComponent<Props>} & {  lib :{None <Props, Module>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableLibrary<Module>}} */
  object default {
    
    inline def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = ^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any]).asInstanceOf[LoadableComponent[Props]]
    inline def apply[Component /* <: ComponentClass[Any, ComponentState] */](
      loadFn: js.Function1[/* props */ ComponentProps[Component], js.Promise[Component | Default[Component]]],
      options: Options[ComponentProps[Component], Component]
    ): LoadableClassComponent[Component] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableClassComponent[Component]]
    inline def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    inline def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    
    @JSImport("react-loadable-visibility", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-loadable-visibility", "default.lib")
    @js.native
    def lib: FnCall = js.native
    inline def lib_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lib")(x.asInstanceOf[js.Any])
  }
}
