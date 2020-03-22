package typings.reactIntl

import typings.intlMessageformat.mod.PrimitiveType
import typings.react.mod.ComponentType
import typings.reactIntl.mod.FormatNumberOptions
import typings.reactIntl.typesMod.IntlShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactIntlComponents extends reactIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[FormattedDateProps] = typings.reactIntl.mod.FormattedDate.asInstanceOf[typings.react.mod.ComponentType[FormattedDateProps]]
  @scala.inline
  def FormattedDateParts: ComponentType[FormattedDatePartsProps] = typings.reactIntl.mod.FormattedDateParts.asInstanceOf[typings.react.mod.ComponentType[FormattedDatePartsProps]]
  @scala.inline
  def FormattedDisplayName: ComponentType[FormattedDisplayNameProps] = typings.reactIntl.mod.FormattedDisplayName.asInstanceOf[typings.react.mod.ComponentType[FormattedDisplayNameProps]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[FormattedHTMLMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactIntl.mod.FormattedHTMLMessage].asInstanceOf[typings.react.mod.ComponentType[
  FormattedHTMLMessageProps[
    typings.std.Record[java.lang.String, typings.intlMessageformat.mod.PrimitiveType]
  ]]]
  @scala.inline
  def FormattedList: ComponentType[FormattedListProps] = typings.reactIntl.mod.FormattedList.asInstanceOf[typings.react.mod.ComponentType[FormattedListProps]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, js.Any] */]: ComponentType[FormattedMessageProps[V]] = js.constructorOf[typings.reactIntl.mod.FormattedMessage[V]].asInstanceOf[typings.react.mod.ComponentType[FormattedMessageProps[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[FormattedNumberProps] = typings.reactIntl.mod.FormattedNumber.asInstanceOf[typings.react.mod.ComponentType[FormattedNumberProps]]
  @scala.inline
  def FormattedNumberParts: ComponentType[FormatNumberOptions with Anon3] = typings.reactIntl.mod.FormattedNumberParts.asInstanceOf[typings.react.mod.ComponentType[typings.reactIntl.mod.FormatNumberOptions with typings.reactIntl.Anon3]]
  @scala.inline
  def FormattedPluralWrappedComponent: ComponentType[FormattedPluralWrappedComponentProps] = typings.reactIntl.mod.FormattedPlural.WrappedComponent.asInstanceOf[typings.react.mod.ComponentType[FormattedPluralWrappedComponentProps]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[FormattedRelativeTimeProps] = js.constructorOf[typings.reactIntl.mod.FormattedRelativeTime].asInstanceOf[typings.react.mod.ComponentType[FormattedRelativeTimeProps]]
  @scala.inline
  def FormattedTime: ComponentType[FormattedTimeProps] = typings.reactIntl.mod.FormattedTime.asInstanceOf[typings.react.mod.ComponentType[FormattedTimeProps]]
  @scala.inline
  def FormattedTimeParts: ComponentType[FormattedTimePartsProps] = typings.reactIntl.mod.FormattedTimeParts.asInstanceOf[typings.react.mod.ComponentType[FormattedTimePartsProps]]
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
  def PluralWrappedComponent: ComponentType[PluralWrappedComponentProps] = typings.reactIntl.pluralMod.default.WrappedComponent.asInstanceOf[typings.react.mod.ComponentType[PluralWrappedComponentProps]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[IntlShape]] = typings.reactIntl.injectIntlMod.Provider.asInstanceOf[typings.react.mod.ComponentType[ProviderProps[typings.reactIntl.typesMod.IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]] = typings.reactIntl.mod.RawIntlProvider.asInstanceOf[typings.react.mod.ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[RelativeProps] = js.constructorOf[typings.reactIntl.relativeMod.default].asInstanceOf[typings.react.mod.ComponentType[RelativeProps]]
}

