package typings.reactDashIntl.reactDashIntlMod

import typings.intlDashMessageformat.libFormattersMod.PrimitiveType
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ProviderExoticComponent
import typings.react.reactMod.ProviderProps
import typings.reactDashIntl.Anon_IntlWrappedComponent
import typings.reactDashIntl.Anon_IntlWrappedComponentAnonValueNumber
import typings.reactDashIntl.Anon_Value
import typings.reactDashIntl.Anon_ValueNumber
import typings.reactDashIntl.Anon_WrappedComponent
import typings.reactDashIntl.Anon_WrappedComponentAny
import typings.reactDashIntl.Anon_WrappedComponentAnyComponentType
import typings.reactDashIntl.Anon_WrappedComponentComponentType
import typings.reactDashIntl.Anon_WrappedComponentComponentTypeProps
import typings.reactDashIntl.distComponentsInjectIntlMod.Opts
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distDefineDashMessagesMod.Messages
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlStrings.intl
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormattedDate: ((ComponentClass[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ], 
    _
  ]) with Anon_IntlWrappedComponent) | ((FunctionComponent[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ]
  ]) with Anon_IntlWrappedComponent) = js.native
  val FormattedHTMLMessage: ((ComponentClass[WithIntlProps[Props[Record[String, PrimitiveType]]], _]) with Anon_WrappedComponent) | ((FunctionComponent[WithIntlProps[Props[Record[String, PrimitiveType]]]]) with Anon_WrappedComponent) = js.native
  val FormattedMessage: ((ComponentClass[WithIntlProps[Props[Record[String, _]]], _]) with Anon_WrappedComponentAnyComponentType) | ((FunctionComponent[WithIntlProps[Props[Record[String, _]]]]) with Anon_WrappedComponentAnyComponentType) = js.native
  val FormattedNumber: ((ComponentClass[
    WithIntlProps[
      NumberFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_ValueNumber
    ], 
    _
  ]) with Anon_IntlWrappedComponentAnonValueNumber) | ((FunctionComponent[
    WithIntlProps[
      NumberFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_ValueNumber
    ]
  ]) with Anon_IntlWrappedComponentAnonValueNumber) = js.native
  val FormattedPlural: ((ComponentClass[WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props], _]) with Anon_WrappedComponentComponentType) | (FunctionComponent[WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]] with Anon_WrappedComponentComponentType) = js.native
  val FormattedRelativeTime: ((ComponentClass[WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props], _]) with Anon_WrappedComponentComponentTypeProps) | (FunctionComponent[WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props]] with Anon_WrappedComponentComponentTypeProps) = js.native
  val FormattedTime: ((ComponentClass[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ], 
    _
  ]) with Anon_IntlWrappedComponent) | ((FunctionComponent[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ]
  ]) with Anon_IntlWrappedComponent) = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ProviderExoticComponent[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[Names /* <: String */](messageDescriptors: Messages[Names]): Messages[Names] = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponentAny = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName]): ComponentType[WithIntlProps[P]] with Anon_WrappedComponentAny = js.native
  def useIntl(): js.Any = js.native
}

