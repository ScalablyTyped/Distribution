package typings.quillDelta.anon

import typings.quillDelta.mod.AttributeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAttributeMap extends js.Object {
  
  def compose(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], keepNull: Boolean): js.UndefOr[AttributeMap] = js.native
  def compose(a: js.UndefOr[scala.Nothing], b: AttributeMap, keepNull: Boolean): js.UndefOr[AttributeMap] = js.native
  def compose(a: AttributeMap, b: js.UndefOr[scala.Nothing], keepNull: Boolean): js.UndefOr[AttributeMap] = js.native
  def compose(a: AttributeMap, b: AttributeMap, keepNull: Boolean): js.UndefOr[AttributeMap] = js.native
  
  def diff(): js.UndefOr[AttributeMap] = js.native
  def diff(a: js.UndefOr[scala.Nothing], b: AttributeMap): js.UndefOr[AttributeMap] = js.native
  def diff(a: AttributeMap): js.UndefOr[AttributeMap] = js.native
  def diff(a: AttributeMap, b: AttributeMap): js.UndefOr[AttributeMap] = js.native
  
  def invert(): AttributeMap = js.native
  def invert(attr: js.UndefOr[scala.Nothing], base: AttributeMap): AttributeMap = js.native
  def invert(attr: AttributeMap): AttributeMap = js.native
  def invert(attr: AttributeMap, base: AttributeMap): AttributeMap = js.native
  
  def transform(): js.UndefOr[AttributeMap] = js.native
  def transform(a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], priority: Boolean): js.UndefOr[AttributeMap] = js.native
  def transform(a: js.UndefOr[scala.Nothing], b: AttributeMap): js.UndefOr[AttributeMap] = js.native
  def transform(a: js.UndefOr[scala.Nothing], b: AttributeMap, priority: Boolean): js.UndefOr[AttributeMap] = js.native
  def transform(a: AttributeMap): js.UndefOr[AttributeMap] = js.native
  def transform(a: AttributeMap, b: js.UndefOr[scala.Nothing], priority: Boolean): js.UndefOr[AttributeMap] = js.native
  def transform(a: AttributeMap, b: AttributeMap): js.UndefOr[AttributeMap] = js.native
  def transform(a: AttributeMap, b: AttributeMap, priority: Boolean): js.UndefOr[AttributeMap] = js.native
}
