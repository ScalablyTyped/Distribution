package typings.reactDashIntl

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
import typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.libTypesMod.CustomFormatConfig
import typings.reactDashIntl.libTypesMod.FormatNumberOptions
import typings.reactDashIntl.libTypesMod.IntlShape
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlComponents extends reactDashIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = typings.reactDashIntl.libMod.FormattedDate.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactDashIntl.libTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Value]]
  @scala.inline
  def FormattedDateParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.libMod.FormattedDateParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactDashIntl.libTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[FormattedHTMLMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.libMod.FormattedHTMLMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  FormattedHTMLMessageProps[
    typings.std.Record[
      java.lang.String, 
      typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
    ]
  ]]]
  @scala.inline
  def FormattedList: ComponentType[IntlListFormatOptions with Anon_ValueArray] = typings.reactDashIntl.libMod.FormattedList.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions with typings.reactDashIntl.Anon_ValueArray]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, js.Any] */]: ComponentType[FormattedMessageProps[V]] = js.constructorOf[typings.reactDashIntl.libMod.FormattedMessage[V]].asInstanceOf[typings.react.reactMod.ComponentType[FormattedMessageProps[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = typings.reactDashIntl.libMod.FormattedNumber.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions with typings.reactDashIntl.libTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_ValueNumber]]
  @scala.inline
  def FormattedNumberParts: ComponentType[FormatNumberOptions with Anon_0] = typings.reactDashIntl.libMod.FormattedNumberParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.libTypesMod.FormatNumberOptions with typings.reactDashIntl.Anon_0]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[FormattedRelativeTimeProps] = js.constructorOf[typings.reactDashIntl.libMod.FormattedRelativeTime].asInstanceOf[typings.react.reactMod.ComponentType[FormattedRelativeTimeProps]]
  @scala.inline
  def FormattedTime: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = typings.reactDashIntl.libMod.FormattedTime.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactDashIntl.libTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Value]]
  @scala.inline
  def FormattedTimeParts: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.libMod.FormattedTimeParts.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Intl.DateTimeFormatOptions with typings.reactDashIntl.libTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def HtmlDashMessage: ComponentType[HtmlDashMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.libComponentsHtmlDashMessageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  HtmlDashMessageProps[
    typings.std.Record[
      java.lang.String, 
      typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
    ]
  ]]]
  @scala.inline
  def IntlProvider: ComponentType[IntlProviderProps] = js.constructorOf[typings.reactDashIntl.libMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[IntlProviderProps]]
  @scala.inline
  def Message[V /* <: Record[String, js.Any] */]: ComponentType[MessageProps[V]] = js.constructorOf[typings.reactDashIntl.libComponentsMessageMod.default[V]].asInstanceOf[typings.react.reactMod.ComponentType[MessageProps[V]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[IntlShape]] = typings.reactDashIntl.libComponentsInjectIntlMod.Provider.asInstanceOf[typings.react.reactMod.ComponentType[ProviderProps[typings.reactDashIntl.libTypesMod.IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[RawIntlProviderProps[IntlShape]] = typings.reactDashIntl.libMod.RawIntlProvider.asInstanceOf[typings.react.reactMod.ComponentType[RawIntlProviderProps[typings.reactDashIntl.libTypesMod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[RelativeProps] = js.constructorOf[typings.reactDashIntl.libComponentsRelativeMod.default].asInstanceOf[typings.react.reactMod.ComponentType[RelativeProps]]
}

