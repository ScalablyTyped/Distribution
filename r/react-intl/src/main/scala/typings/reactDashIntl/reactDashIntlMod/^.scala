package typings.reactDashIntl.reactDashIntlMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.Anon_WrappedComponentAnonIntlValue
import typings.reactDashIntl.Anon_WrappedComponentAnonIntlValueAny
import typings.reactDashIntl.Anon_WrappedComponentComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.Opts
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distDefineDashMessagesMod.Messages
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormattedDate: ((ComponentClass[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.DateTimeFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number | Date | undefined,   intl  :imported_react-intl/dist/types.IntlShape}> */ _, 
    _
  ]) with Anon_WrappedComponentAnonIntlValue) | ((FunctionComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.DateTimeFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number | Date | undefined,   intl  :imported_react-intl/dist/types.IntlShape}> */ _
  ]) with Anon_WrappedComponentAnonIntlValue) = js.native
  val FormattedNumber: ((ComponentClass[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.NumberFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number,   intl  :imported_react-intl/dist/types.IntlShape}> */ _, 
    _
  ]) with Anon_WrappedComponentAnonIntlValueAny) | ((FunctionComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.NumberFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number,   intl  :imported_react-intl/dist/types.IntlShape}> */ _
  ]) with Anon_WrappedComponentAnonIntlValueAny) = js.native
  val FormattedPlural: ((ComponentClass[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Props> */ _, 
    _
  ]) with Anon_WrappedComponentComponentType) | ((FunctionComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Props> */ _
  ]) with Anon_WrappedComponentComponentType) = js.native
  val FormattedTime: ((ComponentClass[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.DateTimeFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number | Date | undefined,   intl  :imported_react-intl/dist/types.IntlShape}> */ _, 
    _
  ]) with Anon_WrappedComponentAnonIntlValue) | ((FunctionComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/components/injectIntl.WithIntlProps<Intl.DateTimeFormatOptions & imported_react-intl/dist/types.CustomFormatConfig & {  value  :number | Date | undefined,   intl  :imported_react-intl/dist/types.IntlShape}> */ _
  ]) with Anon_WrappedComponentAnonIntlValue) = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[Names /* <: String */](messageDescriptors: Messages[Names]): Messages[Names] = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponent = js.native
  def useIntl(): js.Any = js.native
}

