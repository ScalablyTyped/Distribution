package typings.sauronjs.sauronjsMod

import typings.sauronjs.coreSauronMod.SauronComponentMap
import typings.sauronjs.coreSauronMod.SauronInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def instance(componentMap: SauronComponentMap): SauronInstance = js.native
  def instance(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
}

