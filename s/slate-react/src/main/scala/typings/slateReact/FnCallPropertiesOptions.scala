package typings.slateReact

import typings.slate.AnonSnapshot
import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPropertiesOptions extends js.Object {
  def apply(properties: String): Editor = js.native
  def apply(properties: String, options: AnonSnapshot): Editor = js.native
  def apply(properties: RangeType): Editor = js.native
  def apply(properties: RangeTypeJSON): Editor = js.native
  def apply(properties: RangeTypeJSON, options: AnonSnapshot): Editor = js.native
  def apply(properties: RangeTypeProperties): Editor = js.native
  def apply(properties: RangeTypeProperties, options: AnonSnapshot): Editor = js.native
  def apply(properties: RangeType, options: AnonSnapshot): Editor = js.native
}

