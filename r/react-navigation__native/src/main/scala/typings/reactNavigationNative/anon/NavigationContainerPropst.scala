package typings.reactNavigationNative.anon

import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.typesMod.DocumentTitleOptions
import typings.reactNavigationNative.typesMod.LinkingOptions
import typings.reactNavigationNative.typesMod.Theme
import typings.reactNavigationRouters.typesMod.InitialState
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core.NavigationContainerProps & {  theme :@react-navigation/native.@react-navigation/native/lib/typescript/src/types.Theme | undefined,   linking :@react-navigation/native.@react-navigation/native/lib/typescript/src/types.LinkingOptions | undefined,   fallback :react.react.ReactNode | undefined,   documentTitle :@react-navigation/native.@react-navigation/native/lib/typescript/src/types.DocumentTitleOptions | undefined,   onReady :(): void | undefined} & react.react.RefAttributes<@react-navigation/core.@react-navigation/core.NavigationContainerRef> */
@js.native
trait NavigationContainerPropst extends StObject {
  
  /**
    * Children elements to render.
    */
  var children: ReactNode = js.native
  
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.native
  
  var fallback: js.UndefOr[ReactNode] = js.native
  
  /**
    * Whether this navigation container should be independent of parent containers.
    * If this is not set to `true`, this container cannot be nested inside another container.
    * Setting it to `true` disconnects any children navigators from parent container.
    */
  var independent: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial navigation state for the child navigators.
    */
  var initialState: js.UndefOr[InitialState] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var linking: js.UndefOr[LinkingOptions] = js.native
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback which is called with the latest navigation state when it changes.
    */
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.native
  
  /**
    * Callback which is called when an action is not handled.
    */
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.native
  
  var ref: js.UndefOr[Ref[NavigationContainerRef]] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object NavigationContainerPropst {
  
  @scala.inline
  def apply(): NavigationContainerPropst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerPropst]
  }
  
  @scala.inline
  implicit class NavigationContainerPropstMutableBuilder[Self <: NavigationContainerPropst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    @scala.inline
    def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    @scala.inline
    def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLinking(value: LinkingOptions): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[NavigationContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ NavigationContainerRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
