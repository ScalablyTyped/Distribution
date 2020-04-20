package typings.reactI18next

import typings.react.mod.ComponentType
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactI18nextComponents extends reactI18nextProps {
  @scala.inline
  def I18nextProvider: ComponentType[I18nextProviderProps] = typings.reactI18next.mod.I18nextProvider.asInstanceOf[ComponentType[I18nextProviderProps]]
  @scala.inline
  def Trans[E /* <: Element */]: ComponentType[TransProps[E]] = typings.reactI18next.mod.Trans.asInstanceOf[ComponentType[TransProps[E]]]
}

