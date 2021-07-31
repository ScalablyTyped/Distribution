package typings.rbx

import org.scalablytyped.runtime.TopLevel
import typings.rbx.anon.As
import typings.rbx.anon.AsReactType
import typings.rbx.anon.AsTDefaultComponent
import typings.rbx.anon.`0`
import typings.rbx.typesMod.Prefer
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ComponentType
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactType
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import typings.react.mod.WeakValidationMap
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exoticMod {
  
  @JSImport("rbx/base/exotic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forwardRefAs[TOwnProps, TDefaultComponent /* <: ReactType[js.Any] */](
    factory: RefForwardingComponent[HTMLElement | SVGElement | ComponentType[js.Object], TOwnProps & AsReactType],
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps & `0`[TDefaultComponent]]) & RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardRefAs")(factory.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent]]
  
  /* Inlined std.Pick<react.react.ForwardRefExoticComponent<TDefaultComponent>, std.Exclude<keyof react.react.ForwardRefExoticComponent<TDefaultComponent>, 'defaultProps'>> & {None <TAsComponent extends react.react.ReactType<any> = TDefaultComponent>(props : rbx.rbx/types.Prefer<{  as :TAsComponent | undefined} & TOwnProps, react.react.ComponentProps<TAsComponent>> & react.react.RefAttributes<TAsComponent extends keyof react.react.<global>.JSX.IntrinsicElements ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :TDefaultComponent} & std.Partial<TOwnProps & react.react.ComponentPropsWithoutRef<TDefaultComponent>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}>} */
  @js.native
  trait ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent /* <: ReactType[js.Any] */] extends StObject {
    
    def apply[TAsComponent /* <: ReactType[js.Any] */](
      props: (Prefer[As[TAsComponent] & TOwnProps, ComponentProps[TAsComponent]]) & (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var defaultProps: AsTDefaultComponent[TDefaultComponent] & (Partial[TOwnProps & ComponentPropsWithoutRef[TDefaultComponent]]) = js.native
    
    var displayName: js.UndefOr[String] & String = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[TDefaultComponent]] & (WeakValidationMap[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}
      */ typings.rbx.rbxStrings.ForwardRefAsExoticComponent & TopLevel[js.Any]
      ]) = js.native
  }
  
  type FromReactType[T /* <: ReactType[js.Any] */] = T | js.Any
}
