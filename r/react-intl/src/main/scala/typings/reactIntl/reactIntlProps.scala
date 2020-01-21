package typings.reactIntl

import typings.reactIntl.mod.OptionalIntlConfig
import typings.reactIntl.mod.Props
import typings.reactIntl.mod.Props3
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactIntlProps {
  @scala.inline
  def FormattedHTMLMessageProps: Props3.type = typings.reactIntl.mod.Props3
  type FormattedHTMLMessageProps[V /* <: Record[String, _] */] = Props3[V]
  @scala.inline
  def FormattedMessageProps: Props3.type = typings.reactIntl.mod.Props3
  type FormattedMessageProps[V /* <: Record[String, _] */] = Props3[V]
  @scala.inline
  def FormattedRelativeTimeProps: Props.type = typings.reactIntl.mod.Props
  type FormattedRelativeTimeProps = Props
  @scala.inline
  def HtmlMessageProps: typings.reactIntl.messageMod.Props.type = typings.reactIntl.messageMod.Props
  type HtmlMessageProps[V /* <: Record[String, _] */] = typings.reactIntl.messageMod.Props[V]
  type IntlProviderProps = OptionalIntlConfig
  @scala.inline
  def MessageProps: typings.reactIntl.messageMod.Props.type = typings.reactIntl.messageMod.Props
  type MessageProps[V /* <: Record[String, _] */] = typings.reactIntl.messageMod.Props[V]
  @scala.inline
  def ProviderProps: typings.react.mod.ProviderProps.type = typings.react.mod.ProviderProps
  type ProviderProps[T] = typings.react.mod.ProviderProps[T]
  @scala.inline
  def RawIntlProviderProps: typings.react.mod.ProviderProps.type = typings.react.mod.ProviderProps
  type RawIntlProviderProps[T] = typings.react.mod.ProviderProps[T]
  @scala.inline
  def RelativeProps: typings.reactIntl.relativeMod.Props.type = typings.reactIntl.relativeMod.Props
  type RelativeProps = typings.reactIntl.relativeMod.Props
}

