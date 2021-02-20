package typings.safeJsonStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: js.Array[_]): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: js.Array[_], space: String): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: js.Array[_], space: Double): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: Null, space: String): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: Null, space: Double): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: ReplacerFn): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: ReplacerFn, space: String): String = js.native
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  def apply(data: js.Object, replacer: ReplacerFn, space: Double): String = js.native
  
  @JSImport("safe-json-stringify", "ensureProperties")
  @js.native
  def ensureProperties(obj: js.Any): js.Object = js.native
  
  // see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter
  type ReplacerFn = js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]
}
