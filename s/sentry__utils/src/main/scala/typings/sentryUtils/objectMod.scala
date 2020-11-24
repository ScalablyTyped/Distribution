package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryUtils.memoMod.Memo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  
  def dropUndefinedKeys[T](`val`: T): T = js.native
  
  def extractExceptionKeysForMessage(exception: js.Any): String = js.native
  def extractExceptionKeysForMessage(exception: js.Any, maxLength: Double): String = js.native
  
  def fill(
    source: StringDictionary[js.Any],
    name: String,
    replacement: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  def normalize(input: js.Any): js.Any = js.native
  def normalize(input: js.Any, depth: Double): js.Any = js.native
  
  def normalizeToSize[T](`object`: StringDictionary[js.Any]): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: js.UndefOr[scala.Nothing], maxSize: Double): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double): T = js.native
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double, maxSize: Double): T = js.native
  
  def urlEncode(`object`: StringDictionary[js.Any]): String = js.native
  
  def walk(key: String, value: js.Any): js.Any = js.native
  def walk(key: String, value: js.Any, depth: js.UndefOr[scala.Nothing], memo: Memo): js.Any = js.native
  def walk(key: String, value: js.Any, depth: Double): js.Any = js.native
  def walk(key: String, value: js.Any, depth: Double, memo: Memo): js.Any = js.native
}
