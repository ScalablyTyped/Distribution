package typings.reactDashIntl

import typings.intlDashMessageformat.libFormattersMod.PrimitiveType
import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.reactDashIntl.distTypesMod.CustomFormatConfig
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlComponents extends reactDashIntlProps {
  @scala.inline
  def FormattedDate: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.reactDashIntlMod.^.FormattedDate.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def FormattedHTMLMessage: ComponentType[Props[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedHTMLMessage].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsMessageMod.Props[
    typings.std.Record[java.lang.String, typings.intlDashMessageformat.libFormattersMod.PrimitiveType]
  ]]]
  @scala.inline
  def FormattedMessage[V /* <: Record[String, _] */]: ComponentType[Props[V]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedMessage[V]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsMessageMod.Props[V]]]
  @scala.inline
  def FormattedNumber: ComponentType[NumberFormatOptions with CustomFormatConfig with Anon_ChildrenVal] = typings.reactDashIntl.reactDashIntlMod.^.FormattedNumber.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.NumberFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_ChildrenVal]]
  @scala.inline
  def FormattedPlural: ComponentType[WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedPlural].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps[typings.reactDashIntl.distComponentsPluralMod.Props]]]
  @scala.inline
  def FormattedRelativeTime: ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.FormattedRelativeTime].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props]]
  @scala.inline
  def FormattedTime: ComponentType[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = typings.reactDashIntl.reactDashIntlMod.^.FormattedTime.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.IntlNs.DateTimeFormatOptions with typings.reactDashIntl.distTypesMod.CustomFormatConfig with typings.reactDashIntl.Anon_Children]]
  @scala.inline
  def HtmlDashMessage: ComponentType[Props[Record[String, PrimitiveType]]] = js.constructorOf[typings.reactDashIntl.distComponentsHtmlDashMessageMod.default].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashIntl.distComponentsMessageMod.Props[
    typings.std.Record[java.lang.String, typings.intlDashMessageformat.libFormattersMod.PrimitiveType]
  ]]]
  @scala.inline
  def IntlProvider: ComponentType[OptionalIntlConfig] = js.constructorOf[typings.reactDashIntl.reactDashIntlMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig]]
  @scala.inline
  def Message[V /* <: Record[String, _] */]: ComponentType[Props[V]] = js.constructorOf[typings.reactDashIntl.distComponentsMessageMod.default[V]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsMessageMod.Props[V]]]
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
  def Relative: ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props] = js.constructorOf[typings.reactDashIntl.distComponentsRelativeMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsRelativeMod.Props]]
}

