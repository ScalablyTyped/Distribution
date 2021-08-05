package typings.reactIntl

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import typings.formatjsIntl.srcTypesMod.CustomFormatConfig
import typings.react.mod.PureComponent
import typings.react.mod.ReactChild
import typings.reactIntl.anon.PartialStateCurrentValueInSeconds
import typings.reactIntl.anon.PickPropsunitvalue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRelativeMod {
  
  @JSImport("react-intl/src/components/relative", JSImport.Default)
  @js.native
  class default protected () extends FormattedRelativeTime {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-intl/src/components/relative", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/relative", "default.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    inline def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialStateCurrentValueInSeconds | Null]
  }
  
  @JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends PureComponent[Props, State, js.Any] {
    def this(props: Props) = this()
    
    var _updateTimer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFormattedRelativeTime(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
    
    def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State): Unit = js.native
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    inline def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialStateCurrentValueInSeconds | Null]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions */ trait Props
    extends StObject
       with CustomFormatConfig {
    
    var children: js.UndefOr[js.Function1[/* value */ String, ReactChild]] = js.undefined
    
    var unit: js.UndefOr[RelativeTimeUnit] = js.undefined
    
    var updateIntervalInSeconds: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ String => ReactChild): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setUnit(value: RelativeTimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUpdateIntervalInSeconds(value: Double): Self = StObject.set(x, "updateIntervalInSeconds", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalInSecondsUndefined: Self = StObject.set(x, "updateIntervalInSeconds", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var currentValueInSeconds: Double
    
    var prevUnit: js.UndefOr[RelativeTimeUnit] = js.undefined
    
    var prevValue: js.UndefOr[Double] = js.undefined
  }
  object State {
    
    inline def apply(currentValueInSeconds: Double): State = {
      val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCurrentValueInSeconds(value: Double): Self = StObject.set(x, "currentValueInSeconds", value.asInstanceOf[js.Any])
      
      inline def setPrevUnit(value: RelativeTimeUnit): Self = StObject.set(x, "prevUnit", value.asInstanceOf[js.Any])
      
      inline def setPrevUnitUndefined: Self = StObject.set(x, "prevUnit", js.undefined)
      
      inline def setPrevValue(value: Double): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
      
      inline def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
    }
  }
}
