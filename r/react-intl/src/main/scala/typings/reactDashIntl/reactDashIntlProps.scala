package typings.reactDashIntl

import typings.reactDashIntl.distComponentsMessageMod.Props
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashIntlProps {
  @scala.inline
  def BaseFormattedHTMLMessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type BaseFormattedHTMLMessageProps[V /* <: Record[String, _] */] = Props[V]
  @scala.inline
  def BaseFormattedMessageProps: Props.type = typings.reactDashIntl.distComponentsMessageMod.Props
  type BaseFormattedMessageProps[V /* <: Record[String, _] */] = Props[V]
  @scala.inline
  def BaseFormattedRelativeTimeProps: typings.reactDashIntl.distComponentsRelativeMod.Props.type = typings.reactDashIntl.distComponentsRelativeMod.Props
  type BaseFormattedRelativeTimeProps = typings.reactDashIntl.distComponentsRelativeMod.Props
  type IntlProviderProps = OptionalIntlConfig
  @scala.inline
  def ProviderProps: typings.react.reactMod.ProviderProps.type = typings.react.reactMod.ProviderProps
  type ProviderProps[T] = typings.react.reactMod.ProviderProps[T]
  @scala.inline
  def RawIntlProviderProps: typings.react.reactMod.ProviderProps.type = typings.react.reactMod.ProviderProps
  type RawIntlProviderProps[T] = typings.react.reactMod.ProviderProps[T]
}

