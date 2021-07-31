package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryUtils.memoMod.Memo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@sentry/utils/dist/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dropUndefinedKeys[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("dropUndefinedKeys")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def extractExceptionKeysForMessage(exception: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def extractExceptionKeysForMessage(exception: js.Any, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def fill(
    source: StringDictionary[js.Any],
    name: String,
    replacement: js.Function1[/* repeated */ js.Any, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def normalize(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def normalize(input: js.Any, depth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def normalizeToSize[T](`object`: StringDictionary[js.Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Double, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def normalizeToSize[T](`object`: StringDictionary[js.Any], depth: Unit, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def urlEncode(`object`: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def walk(key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def walk(key: String, value: js.Any, depth: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def walk(key: String, value: js.Any, depth: Double, memo: Memo): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def walk(key: String, value: js.Any, depth: Unit, memo: Memo): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
