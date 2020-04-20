package typings.reactHelmet

import typings.react.mod.ComponentType
import typings.reactHelmet.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactHelmetComponents extends reactHelmetProps {
  @scala.inline
  def Helmet: ComponentType[HelmetProps] = js.constructorOf[typings.reactHelmet.mod.Helmet].asInstanceOf[ComponentType[HelmetProps]]
  @scala.inline
  def ReactHelmet: ComponentType[ReactHelmetProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactHelmetProps]]
}

