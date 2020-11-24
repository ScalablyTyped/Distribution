package typings.quillDelta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("quill-delta/dist/AttributeMap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
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
  
  type AttributeMap = StringDictionary[js.Any]
}
