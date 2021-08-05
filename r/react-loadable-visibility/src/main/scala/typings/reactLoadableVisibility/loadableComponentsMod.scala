package typings.reactLoadableVisibility

import typings.loadableComponent.anon.FnCall
import typings.loadableComponent.mod.DefaultComponent
import typings.loadableComponent.mod.LoadableComponent
import typings.loadableComponent.mod.OptionsWithResolver
import typings.loadableComponent.mod.OptionsWithoutResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadableComponentsMod {
  
  /* Inlined {None <Props>(loadFn : (props : Props): std.Promise<@loadable/component.@loadable/component.DefaultComponent<Props>>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableComponent<Props>, None <Props, Module = @loadable/component.@loadable/component.DefaultComponent<Props>>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithResolver<Props, Module>): @loadable/component.@loadable/component.LoadableComponent<Props>} & {  lib :{None <Props, Module>(loadFn : (props : Props): std.Promise<Module>, options : @loadable/component.@loadable/component.OptionsWithoutResolver<Props> | undefined): @loadable/component.@loadable/component.LoadableLibrary<Module>}} */
  object default {
    
    inline def apply[Props](loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]]): LoadableComponent[Props] = ^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any]).asInstanceOf[LoadableComponent[Props]]
    inline def apply[Props](
      loadFn: js.Function1[/* props */ Props, js.Promise[DefaultComponent[Props]]],
      options: OptionsWithoutResolver[Props]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    inline def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithResolver[Props, Module]
    ): LoadableComponent[Props] = (^.asInstanceOf[js.Dynamic].apply(loadFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadableComponent[Props]]
    
    @JSImport("react-loadable-visibility/loadable-components", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-loadable-visibility/loadable-components", "default.lib")
    @js.native
    def lib: FnCall = js.native
    inline def lib_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lib")(x.asInstanceOf[js.Any])
  }
}
