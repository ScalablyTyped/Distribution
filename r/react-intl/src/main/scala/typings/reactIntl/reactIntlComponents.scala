package typings.reactIntl

import typings.formatjsIntlDisplaynames.libMod.DisplayNamesOptions
import typings.formatjsIntlListformat.mod.IntlListFormatOptions
import typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions
import typings.intlMessageformat.mod.PrimitiveType
import typings.react.mod.ComponentType
import typings.reactIntl.mod.CustomFormatConfig
import typings.reactIntl.mod.FormatNumberOptions
import typings.reactIntl.typesMod.IntlShape
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactIntlComponents extends reactIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[DateTimeFormatOptions with CustomFormatConfig with AnonValue] = typings.reactIntl.mod.FormattedDate.asInstanceOf[typings.react.mod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactIntl.mod.CustomFormatConfig with typings.reactIntl.AnonValue]]
  @scala.inline
  def FormattedDateParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with AnonChildren] = typings.reactIntl.mod.FormattedDateParts.asInstanceOf[typings.react.mod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactIntl.mod.CustomFormatConfig with typings.reactIntl.AnonChildren]]
  @scala.inline
  def FormattedDisplayName: ComponentType[DisplayNamesOptions with AnonValueNumberObject] = typings.reactIntl.mod.FormattedDisplayName.asInstanceOf[typings.react.mod.ComponentType[
  typings.formatjsIntlDisplaynames.libMod.DisplayNamesOptions with typings.reactIntl.AnonValueNumberObject]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[FormattedHTMLMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactIntl.mod.FormattedHTMLMessage].asInstanceOf[typings.react.mod.ComponentType[
  FormattedHTMLMessageProps[
    typings.std.Record[java.lang.String, typings.intlMessageformat.mod.PrimitiveType]
  ]]]
  @scala.inline
  def FormattedList: ComponentType[IntlListFormatOptions with AnonValueArray] = typings.reactIntl.mod.FormattedList.asInstanceOf[typings.react.mod.ComponentType[
  typings.formatjsIntlListformat.mod.IntlListFormatOptions with typings.reactIntl.AnonValueArray]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, js.Any] */]: ComponentType[FormattedMessageProps[V]] = js.constructorOf[typings.reactIntl.mod.FormattedMessage[V]].asInstanceOf[typings.react.mod.ComponentType[FormattedMessageProps[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[UnifiedNumberFormatOptions with CustomFormatConfig with AnonValueNumber] = typings.reactIntl.mod.FormattedNumber.asInstanceOf[typings.react.mod.ComponentType[
  typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions with typings.reactIntl.mod.CustomFormatConfig with typings.reactIntl.AnonValueNumber]]
  @scala.inline
  def FormattedNumberParts: ComponentType[FormatNumberOptions with Anon0ChildrenFormatOptsVal] = typings.reactIntl.mod.FormattedNumberParts.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactIntl.mod.FormatNumberOptions with typings.reactIntl.Anon0ChildrenFormatOptsVal]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[FormattedRelativeTimeProps] = js.constructorOf[typings.reactIntl.mod.FormattedRelativeTime].asInstanceOf[typings.react.mod.ComponentType[FormattedRelativeTimeProps]]
  @scala.inline
  def FormattedTime: ComponentType[DateTimeFormatOptions with CustomFormatConfig with AnonValue] = typings.reactIntl.mod.FormattedTime.asInstanceOf[typings.react.mod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactIntl.mod.CustomFormatConfig with typings.reactIntl.AnonValue]]
  @scala.inline
  def FormattedTimeParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with AnonChildren] = typings.reactIntl.mod.FormattedTimeParts.asInstanceOf[typings.react.mod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactIntl.mod.CustomFormatConfig with typings.reactIntl.AnonChildren]]
  @scala.inline
  def HtmlMessage: ComponentType[HtmlMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactIntl.htmlMessageMod.default].asInstanceOf[typings.react.mod.ComponentType[
  HtmlMessageProps[
    typings.std.Record[java.lang.String, typings.intlMessageformat.mod.PrimitiveType]
  ]]]
  @scala.inline
  def IntlProvider: ComponentType[IntlProviderProps] = js.constructorOf[typings.reactIntl.mod.IntlProvider].asInstanceOf[typings.react.mod.ComponentType[IntlProviderProps]]
  @scala.inline
  def Message[V /* <: Record[String, js.Any] */]: ComponentType[MessageProps[V]] = js.constructorOf[typings.reactIntl.messageMod.default[V]].asInstanceOf[typings.react.mod.ComponentType[MessageProps[V]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[IntlShape]] = typings.reactIntl.injectIntlMod.Provider.asInstanceOf[typings.react.mod.ComponentType[ProviderProps[typings.reactIntl.typesMod.IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]] = typings.reactIntl.mod.RawIntlProvider.asInstanceOf[typings.react.mod.ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[RelativeProps] = js.constructorOf[typings.reactIntl.relativeMod.default].asInstanceOf[typings.react.mod.ComponentType[RelativeProps]]
}

