package typings.reactDashIntl

import typings.intlDashMessageformat.libFormattersMod.PrimitiveType
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.reactDashIntl.reactDashIntlStrings.intl
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlComponents extends reactDashIntlProps {
  @scala.inline
  def BaseFormattedHTMLMessage: ComponentType[Props[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.distComponentsHtmlDashMessageMod.BaseFormattedHTMLMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsMessageMod.Props[
    typings.std.Record[java.lang.String, typings.intlDashMessageformat.libFormattersMod.PrimitiveType]
  ]]]
  @scala.inline
  def BaseFormattedMessage[V /* <: Record[String, _] */]: ComponentType[Props[V]] = js.constructorOf[typings.reactDashIntl.distComponentsMessageMod.BaseFormattedMessage[V]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsMessageMod.Props[V]]]
  @scala.inline
  def BaseFormattedRelativeTime: ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props] = js.constructorOf[typings.reactDashIntl.distComponentsRelativeMod.BaseFormattedRelativeTime].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props]]
  @scala.inline
  def FormattedDate: ComponentType[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ]
  ] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedDate].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps[typings.reactDashIntl.reactDashIntlStrings.intl] with typings.reactDashIntl.Anon_Value
  ]]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[WithIntlProps[Props[Record[String, PrimitiveType]]]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedHTMLMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.reactDashIntl.distComponentsMessageMod.Props[
      typings.std.Record[java.lang.String, typings.intlDashMessageformat.libFormattersMod.PrimitiveType]
    ]
  ]]]
  @scala.inline
  def FormattedMessage: ComponentType[WithIntlProps[Props[Record[String, js.Any]]]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.reactDashIntl.distComponentsMessageMod.Props[typings.std.Record[java.lang.String, js.Any]]
  ]]]
  @scala.inline
  def FormattedNumber: ComponentType[
    WithIntlProps[
      NumberFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_ValueNumber
    ]
  ] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedNumber].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.std.IntlNs.NumberFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps[typings.reactDashIntl.reactDashIntlStrings.intl] with typings.reactDashIntl.Anon_ValueNumber
  ]]]
  @scala.inline
  def FormattedPlural: ComponentType[WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedPlural].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedRelativeTime].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props]]]
  @scala.inline
  def FormattedTime: ComponentType[
    WithIntlProps[
      DateTimeFormatOptions with CustomFormatConfig with WrappedComponentProps[intl] with Anon_Value
    ]
  ] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedTime].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.distComponentsInjectIntlMod.WrappedComponentProps[typings.reactDashIntl.reactDashIntlStrings.intl] with typings.reactDashIntl.Anon_Value
  ]]]
  @scala.inline
  def HtmlDashMessage: ComponentType[WithIntlProps[Props[Record[String, PrimitiveType]]]] = js.constructorOf[typings.reactDashIntl.distComponentsHtmlDashMessageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.reactDashIntl.distComponentsMessageMod.Props[
      typings.std.Record[java.lang.String, typings.intlDashMessageformat.libFormattersMod.PrimitiveType]
    ]
  ]]]
  @scala.inline
  def IntlProvider: ComponentType[OptionalIntlConfig] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig]]
  @scala.inline
  def Message: ComponentType[WithIntlProps[Props[Record[String, js.Any]]]] = js.constructorOf[typings.reactDashIntl.distComponentsMessageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[
    typings.reactDashIntl.distComponentsMessageMod.Props[typings.std.Record[java.lang.String, js.Any]]
  ]]]
  @scala.inline
  def Plural: ComponentType[WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]] = js.constructorOf[typings.reactDashIntl.distComponentsPluralMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]]]
  @scala.inline
  def Provider: ComponentType[typings.react.reactMod.ProviderProps[IntlShape]] = typings.reactDashIntl.distComponentsInjectIntlMod.^.Provider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.reactDashIntl.distTypesMod.IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[typings.react.reactMod.ProviderProps[IntlShape]] = typings.reactDashIntl.reactDashIntlMod.^.RawIntlProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.reactDashIntl.distTypesMod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props]] = js.constructorOf[typings.reactDashIntl.distComponentsRelativeMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[typings.reactDashIntl.distComponentsRelativeMod.Props]]]
}

