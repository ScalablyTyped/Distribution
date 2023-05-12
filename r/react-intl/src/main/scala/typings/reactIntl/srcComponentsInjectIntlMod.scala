package typings.reactIntl

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactIntl.anon.ForwardedRef
import typings.reactIntl.anon.WrappedComponent
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.reactIntlStrings.intl
import typings.reactIntl.srcTypesMod.IntlShape
import typings.std.Omit
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsInjectIntlMod {
  
  @JSImport("react-intl/src/components/injectIntl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName])]
  
  @JSImport("react-intl/src/components/injectIntl", "Context")
  @js.native
  val Context: typings.react.mod.Context[IntlShape] = js.native
  
  @JSImport("react-intl/src/components/injectIntl", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[IntlShape] = js.native
  
  inline def default_IntlPropNamePT[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  inline def default_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponent[P, IntlPropName])]
  
  inline def default_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponent[P, IntlPropName])]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? std.Omit<T, K> : never
    }}}
    */
  type DistributedOmit[T, K /* <: PropertyKey */] = Omit[T, K]
  
  trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends StObject {
    
    var enforceContext: js.UndefOr[Boolean] = js.undefined
    
    var forwardRef: js.UndefOr[ForwardRef] = js.undefined
    
    var intlPropName: js.UndefOr[IntlPropName] = js.undefined
  }
  object Opts {
    
    inline def apply[IntlPropName /* <: String */, ForwardRef /* <: Boolean */](): Opts[IntlPropName, ForwardRef] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts[?, ?], IntlPropName /* <: String */, ForwardRef /* <: Boolean */] (val x: Self & (Opts[IntlPropName, ForwardRef])) extends AnyVal {
      
      inline def setEnforceContext(value: Boolean): Self = StObject.set(x, "enforceContext", value.asInstanceOf[js.Any])
      
      inline def setEnforceContextUndefined: Self = StObject.set(x, "enforceContext", js.undefined)
      
      inline def setForwardRef(value: ForwardRef): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      inline def setIntlPropName(value: IntlPropName): Self = StObject.set(x, "intlPropName", value.asInstanceOf[js.Any])
      
      inline def setIntlPropNameUndefined: Self = StObject.set(x, "intlPropName", js.undefined)
    }
  }
  
  type WithIntlProps[P] = (DistributedOmit[P, intl]) & ForwardedRef
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in IntlPropName ]: react-intl.react-intl/src/types.IntlShape}
    }}}
    */
  @js.native
  trait WrappedComponentProps[IntlPropName /* <: String */] extends StObject
  
  object global {
    
    trait Window extends StObject {
      
      var __REACT_INTL_CONTEXT__ : js.UndefOr[typings.react.mod.Context[IntlShape]] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def set__REACT_INTL_CONTEXT__(value: typings.react.mod.Context[IntlShape]): Self = StObject.set(x, "__REACT_INTL_CONTEXT__", value.asInstanceOf[js.Any])
        
        inline def set__REACT_INTL_CONTEXT__Undefined: Self = StObject.set(x, "__REACT_INTL_CONTEXT__", js.undefined)
      }
    }
  }
}
