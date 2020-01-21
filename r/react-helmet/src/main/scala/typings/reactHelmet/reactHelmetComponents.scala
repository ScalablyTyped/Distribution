package typings.reactHelmet

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactHelmetComponents extends reactHelmetProps {
  @scala.inline
  def Helmet: ComponentType[HelmetProps] = js.constructorOf[typings.reactHelmet.mod.Helmet].asInstanceOf[typings.react.mod.ComponentType[HelmetProps]]
  @scala.inline
  def ReactHelmet: ComponentType[ReactHelmetProps] = js.constructorOf[typings.reactHelmet.mod.default].asInstanceOf[typings.react.mod.ComponentType[ReactHelmetProps]]
}

