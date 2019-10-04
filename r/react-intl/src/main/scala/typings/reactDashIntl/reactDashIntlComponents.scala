package typings.reactDashIntl

import typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions
import typings.intlDashMessageformat.distFormattersMod.PrimitiveType
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.FormatNumberOptions
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlComponents extends reactDashIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = typings.reactDashIntl.reactDashIntlMod.^.FormattedDate.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Value]]
  @scala.inline
  def FormattedDateParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.reactDashIntlMod.^.FormattedDateParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[Props[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedHTMLMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsMessageMod.Props[
    typings.std.Record[java.lang.String, typings.intlDashMessageformat.distFormattersMod.PrimitiveType]
  ]]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, _] */]: ComponentType[Props[V]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedMessage[V]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsMessageMod.Props[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = typings.reactDashIntl.reactDashIntlMod.^.FormattedNumber.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_ValueNumber]]
  @scala.inline
  def FormattedNumberParts: ComponentType[FormatNumberOptions with Anon_0] = typings.reactDashIntl.reactDashIntlMod.^.FormattedNumberParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distTypesMod.FormatNumberOptions with typings.reactDashIntl.Anon_0]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedRelativeTime].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props]]
  @scala.inline
  def FormattedTime: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = typings.reactDashIntl.reactDashIntlMod.^.FormattedTime.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Value]]
  @scala.inline
  def FormattedTimeParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.reactDashIntlMod.^.FormattedTimeParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def HtmlDashMessage: ComponentType[Props[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.distComponentsHtmlDashMessageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsMessageMod.Props[
    typings.std.Record[java.lang.String, typings.intlDashMessageformat.distFormattersMod.PrimitiveType]
  ]]]
  @scala.inline
  def IntlProvider: ComponentType[OptionalIntlConfig] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig]]
  @scala.inline
  def Message[V /* <: Record[String, _] */]: ComponentType[Props[V]] = js.constructorOf[typings.reactDashIntl.distComponentsMessageMod.default[V]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsMessageMod.Props[V]]]
  @scala.inline
  def Provider: ComponentType[typings.react.reactMod.ProviderProps[IntlShape]] = typings.reactDashIntl.distComponentsInjectIntlMod.^.Provider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.reactDashIntl.distTypesMod.IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[typings.react.reactMod.ProviderProps[IntlShape]] = typings.reactDashIntl.reactDashIntlMod.^.RawIntlProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.reactDashIntl.distTypesMod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props] = js.constructorOf[typings.reactDashIntl.distComponentsRelativeMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props]]
}

