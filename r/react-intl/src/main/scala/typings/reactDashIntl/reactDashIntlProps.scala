package typings.reactDashIntl

import typings.reactDashIntl.distComponentsInjectIntlMod.WithIntlProps
import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashIntlProps {
  @scala.inline
  def FormattedHTMLMessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type FormattedHTMLMessageProps[V /* <: Record[String, _] */] = Props[V]
  @scala.inline
  def FormattedMessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type FormattedMessageProps[V /* <: Record[String, _] */] = Props[V]
  type FormattedPluralProps[P] = WithIntlProps[P]
  @scala.inline
  def FormattedRelativeTimeProps: typings.reactDashIntl.distComponentsRelativeMod.Props.type = typings.reactDashIntl.distComponentsRelativeMod.Props
  type FormattedRelativeTimeProps = typings.reactDashIntl.distComponentsRelativeMod.Props
  @scala.inline
  def HtmlDashMessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type HtmlDashMessageProps[V /* <: Record[String, _] */] = Props[V]
  type IntlProviderProps = OptionalIntlConfig
  @scala.inline
  def MessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type MessageProps[V /* <: Record[String, _] */] = Props[V]
  type PluralProps[P] = WithIntlProps[P]
  @scala.inline
  def ProviderProps: typings.react.reactMod.ProviderProps.type = typings.react.reactMod.ProviderProps
  type ProviderProps[T] = typings.react.reactMod.ProviderProps[T]
  @scala.inline
  def RawIntlProviderProps: typings.react.reactMod.ProviderProps.type = typings.react.reactMod.ProviderProps
  type RawIntlProviderProps[T] = typings.react.reactMod.ProviderProps[T]
  @scala.inline
  def RelativeProps: typings.reactDashIntl.distComponentsRelativeMod.Props.type = typings.reactDashIntl.distComponentsRelativeMod.Props
  type RelativeProps = typings.reactDashIntl.distComponentsRelativeMod.Props
}

