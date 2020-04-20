package typings.reactIntl

import typings.intlMessageformat.mod.PrimitiveType
import typings.react.mod.ComponentType
import typings.reactIntl.htmlMessageMod.default
import typings.reactIntl.mod.FormatNumberOptions
import typings.reactIntl.mod.FormattedPlural.WrappedComponent
import typings.reactIntl.typesMod.IntlShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactIntlComponents extends reactIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[FormattedDateProps] = typings.reactIntl.mod.FormattedDate.asInstanceOf[ComponentType[FormattedDateProps]]
  @scala.inline
  def FormattedDateParts: ComponentType[FormattedDatePartsProps] = typings.reactIntl.mod.FormattedDateParts.asInstanceOf[ComponentType[FormattedDatePartsProps]]
  @scala.inline
  def FormattedDisplayName: ComponentType[FormattedDisplayNameProps] = typings.reactIntl.mod.FormattedDisplayName.asInstanceOf[ComponentType[FormattedDisplayNameProps]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[FormattedHTMLMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactIntl.mod.FormattedHTMLMessage].asInstanceOf[ComponentType[FormattedHTMLMessageProps[Record[String, PrimitiveType]]]]
  @scala.inline
  def FormattedList: ComponentType[FormattedListProps] = typings.reactIntl.mod.FormattedList.asInstanceOf[ComponentType[FormattedListProps]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, js.Any] */]: ComponentType[FormattedMessageProps[V]] = js.constructorOf[typings.reactIntl.mod.FormattedMessage[V]].asInstanceOf[ComponentType[FormattedMessageProps[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[FormattedNumberProps] = typings.reactIntl.mod.FormattedNumber.asInstanceOf[ComponentType[FormattedNumberProps]]
  @scala.inline
  def FormattedNumberParts: ComponentType[FormatNumberOptions with Anon3] = typings.reactIntl.mod.FormattedNumberParts.asInstanceOf[ComponentType[FormatNumberOptions with Anon3]]
  @scala.inline
  def FormattedPluralWrappedComponent: ComponentType[FormattedPluralWrappedComponentProps] = WrappedComponent.asInstanceOf[ComponentType[FormattedPluralWrappedComponentProps]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[FormattedRelativeTimeProps] = js.constructorOf[typings.reactIntl.mod.FormattedRelativeTime].asInstanceOf[ComponentType[FormattedRelativeTimeProps]]
  @scala.inline
  def FormattedTime: ComponentType[FormattedTimeProps] = typings.reactIntl.mod.FormattedTime.asInstanceOf[ComponentType[FormattedTimeProps]]
  @scala.inline
  def FormattedTimeParts: ComponentType[FormattedTimePartsProps] = typings.reactIntl.mod.FormattedTimeParts.asInstanceOf[ComponentType[FormattedTimePartsProps]]
  @scala.inline
  def HtmlMessage: ComponentType[HtmlMessageProps[Record[String, PrimitiveType]]] = js.constructorOf[default].asInstanceOf[ComponentType[HtmlMessageProps[Record[String, PrimitiveType]]]]
  @scala.inline
  def IntlProvider: ComponentType[IntlProviderProps] = js.constructorOf[typings.reactIntl.mod.IntlProvider].asInstanceOf[ComponentType[IntlProviderProps]]
  @scala.inline
  def Message[V /* <: Record[String, js.Any] */]: ComponentType[MessageProps[V]] = js.constructorOf[typings.reactIntl.messageMod.default[V]].asInstanceOf[ComponentType[MessageProps[V]]]
  @scala.inline
  def PluralWrappedComponent: ComponentType[PluralWrappedComponentProps] = typings.reactIntl.pluralMod.default.WrappedComponent.asInstanceOf[ComponentType[PluralWrappedComponentProps]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[IntlShape]] = typings.reactIntl.injectIntlMod.Provider.asInstanceOf[ComponentType[ProviderProps[IntlShape]]]
  @scala.inline
  def RawIntlProvider: ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]] = typings.reactIntl.mod.RawIntlProvider.asInstanceOf[ComponentType[RawIntlProviderProps[typings.reactIntl.mod.IntlShape]]]
  @scala.inline
  def Relative: ComponentType[RelativeProps] = js.constructorOf[typings.reactIntl.relativeMod.default].asInstanceOf[ComponentType[RelativeProps]]
}

