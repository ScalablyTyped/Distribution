package typings.rbx

import org.scalablytyped.runtime.TopLevel
import typings.rbx.anon.As
import typings.rbx.anon.AsTDefaultComponent
import typings.rbx.anon.`0`
import typings.rbx.typesMod.Prefer
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.WeakValidationMap
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exoticMod {
  
  @JSImport("rbx/base/exotic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forwardRefAs[TOwnProps, TDefaultComponent /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any */](
    factory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.RefForwardingComponent<HTMLElement | SVGElement | React.ComponentType, TOwnProps & {  as :React.ReactType}> */ Any,
    defaultProps: Partial[
      Prefer[
        (PropsWithoutRef[TOwnProps & `0`[TDefaultComponent]]) & RefAttributes[FromReactType[TDefaultComponent]], 
        ComponentPropsWithoutRef[TDefaultComponent]
      ]
    ]
  ): ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardRefAs")(factory.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent]]
  
  /* Inlined std.Pick<react.react.ForwardRefExoticComponent<TDefaultComponent>, std.Exclude<keyof react.react.ForwardRefExoticComponent<TDefaultComponent>, 'defaultProps'>> & {None <TAsComponent extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType * / any = TDefaultComponent>(props : rbx.rbx/types.Prefer<{  as :TAsComponent | undefined} & TOwnProps, react.react.ComponentProps<TAsComponent>> & react.react.RefAttributes<TAsComponent extends keyof react.react.<global>.JSX.IntrinsicElements ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :TDefaultComponent} & std.Partial<TOwnProps & react.react.ComponentPropsWithoutRef<TDefaultComponent>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}>} */
  @js.native
  trait ForwardRefAsExoticComponent[TOwnProps, TDefaultComponent /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any */] extends StObject {
    
    def apply[TAsComponent /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any */](
      props: (Prefer[As[TAsComponent] & TOwnProps, ComponentProps[TAsComponent]]) & (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var defaultProps: AsTDefaultComponent[TDefaultComponent] & (Partial[TOwnProps & ComponentPropsWithoutRef[TDefaultComponent]]) = js.native
    
    var displayName: js.UndefOr[String] & String = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[TDefaultComponent]] & (WeakValidationMap[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in 'as' | keyof TOwnProps | keyof react.react.ComponentPropsWithoutRef<TDefaultComponent> ]: any}
      */ typings.rbx.rbxStrings.ForwardRefAsExoticComponent & TopLevel[Any]
      ]) = js.native
  }
  
  type FromReactType[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any */] = T | Any
}
