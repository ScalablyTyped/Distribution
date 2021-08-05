package typings.reactIntl

import typings.formatjsIntl.srcTypesMod.CustomFormatConfig
import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.reactIntl.injectIntlMod.WithIntlProps
import typings.reactIntl.typesMod.IntlShape
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralMod {
  
  /* Inlined react.react.FC<react-intl.react-intl/lib/src/components/injectIntl.WithIntlProps<react-intl.react-intl/lib/src/components/plural.Props>> & {  WrappedComponent :react.react.ComponentType<react-intl.react-intl/lib/src/components/plural.Props>} */
  object default {
    
    inline def apply(props: PropsWithChildren[WithIntlProps[Props]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: PropsWithChildren[WithIntlProps[Props]], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("react-intl/lib/src/components/plural", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib/src/components/plural", "default.WrappedComponent")
    @js.native
    def WrappedComponent: ComponentType[Props] = js.native
    inline def WrappedComponent_=(x: ComponentType[Props]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/components/plural", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/components/plural", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[WithIntlProps[Props]]] = js.native
    inline def defaultProps_=(x: js.UndefOr[Partial[WithIntlProps[Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/components/plural", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib/src/components/plural", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[Props]]] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMap[WithIntlProps[Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Intl.PluralRulesOptions extends 'localeMatcher' ? never : std.Intl.PluralRulesOptions */ trait Props
    extends StObject
       with CustomFormatConfig {
    
    var children: js.UndefOr[js.Function1[/* value */ ReactNode, ReactElement | Null]] = js.undefined
    
    var few: js.UndefOr[ReactNode] = js.undefined
    
    var intl: IntlShape
    
    var many: js.UndefOr[ReactNode] = js.undefined
    
    var one: js.UndefOr[ReactNode] = js.undefined
    
    var other: ReactNode
    
    var two: js.UndefOr[ReactNode] = js.undefined
    
    var value: Double
    
    var zero: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(intl: IntlShape, value: Double): Props = {
      val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ ReactNode => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFew(value: ReactNode): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
      
      inline def setMany(value: ReactNode): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOne(value: ReactNode): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: ReactNode): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTwo(value: ReactNode): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setZero(value: ReactNode): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
}
