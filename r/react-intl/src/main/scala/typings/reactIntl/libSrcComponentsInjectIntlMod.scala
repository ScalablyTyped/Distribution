package typings.reactIntl

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactIntl.anon.ForwardedRef
import typings.reactIntl.anon.WrappedComponentComponentType
import typings.reactIntl.libSrcTypesMod.IntlShape
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.reactIntlStrings.intl
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcComponentsInjectIntlMod {
  
  @JSImport("react-intl/lib/src/components/injectIntl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] & (WrappedComponentComponentType[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponentComponentType[P, IntlPropName])]
  
  @JSImport("react-intl/lib/src/components/injectIntl", "Context")
  @js.native
  val Context: typings.react.mod.Context[IntlShape] = js.native
  
  @JSImport("react-intl/lib/src/components/injectIntl", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[IntlShape] = js.native
  
  inline def default_IntlPropNamePT[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName])]
  
  inline def default_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] & (WrappedComponentComponentType[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FC[WithIntlProps[P]] & (WrappedComponentComponentType[P, IntlPropName])]
  
  inline def default_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName])]
  
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
  
  type WithIntlProps[P] = (Omit[P, intl]) & ForwardedRef
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in IntlPropName ]: react-intl.react-intl/lib/src/types.IntlShape}
    }}}
    */
  @js.native
  trait WrappedComponentProps[IntlPropName /* <: String */] extends StObject
}
