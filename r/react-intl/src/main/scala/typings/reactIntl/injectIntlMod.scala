package typings.reactIntl

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactIntl.anon.ForwardedRef
import typings.reactIntl.anon.WrappedComponentComponentType
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.reactIntlStrings.intl
import typings.reactIntl.typesMod.IntlShape
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectIntlMod {
  
  @JSImport("react-intl/lib/src/components/injectIntl", JSImport.Default)
  @js.native
  def default[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  
  @JSImport("react-intl/lib/src/components/injectIntl", "Context")
  @js.native
  val Context: typings.react.mod.Context[IntlShape] = js.native
  
  @JSImport("react-intl/lib/src/components/injectIntl", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[IntlShape] = js.native
  
  @JSImport("react-intl/lib/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib/src/components/injectIntl", JSImport.Default)
  @js.native
  def default_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  
  @js.native
  trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends StObject {
    
    var enforceContext: js.UndefOr[Boolean] = js.native
    
    var forwardRef: js.UndefOr[ForwardRef] = js.native
    
    var intlPropName: js.UndefOr[IntlPropName] = js.native
  }
  object Opts {
    
    @scala.inline
    def apply[IntlPropName /* <: String */, ForwardRef /* <: Boolean */](): Opts[IntlPropName, ForwardRef] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts[_, _], IntlPropName /* <: String */, ForwardRef /* <: Boolean */] (val x: Self with (Opts[IntlPropName, ForwardRef])) extends AnyVal {
      
      @scala.inline
      def setEnforceContext(value: Boolean): Self = StObject.set(x, "enforceContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceContextUndefined: Self = StObject.set(x, "enforceContext", js.undefined)
      
      @scala.inline
      def setForwardRef(value: ForwardRef): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setIntlPropName(value: IntlPropName): Self = StObject.set(x, "intlPropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntlPropNameUndefined: Self = StObject.set(x, "intlPropName", js.undefined)
    }
  }
  
  type WithIntlProps[P] = (Omit[P, intl]) with ForwardedRef
  
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/src/types.IntlShape}
    */ typings.reactIntl.reactIntlStrings.WrappedComponentProps with TopLevel[js.Any]
}
