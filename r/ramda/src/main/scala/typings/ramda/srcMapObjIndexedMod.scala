package typings.ramda

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/mapObjIndexed", JSImport.Namespace)
@js.native
object srcMapObjIndexedMod extends js.Object {
  def default[T, TResult](fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[js.Any], TResult]): js.Function1[/* obj */ js.Any, StringDictionary[TResult]] = js.native
  def default[T, TResult](
    fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[js.Any], TResult],
    obj: js.Any
  ): StringDictionary[TResult] = js.native
  def default[T, TResult](
    fn: js.Function3[/* value */ T, /* key */ String, /* obj */ js.UndefOr[StringDictionary[T]], TResult],
    obj: StringDictionary[T]
  ): StringDictionary[TResult] = js.native
  @JSName("default")
  def default_TTResultTKey_String[T, TResult, TKey /* <: String */](fn: js.Function3[/* value */ T, /* key */ TKey, /* obj */ js.UndefOr[Record[TKey, T]], TResult]): js.Function1[/* obj */ Record[TKey, T], Record[TKey, TResult]] = js.native
  @JSName("default")
  def default_TTResultTKey_String_Record[T, TResult, TKey /* <: String */](
    fn: js.Function3[/* value */ T, /* key */ TKey, /* obj */ js.UndefOr[Record[TKey, T]], TResult],
    obj: Record[TKey, T]
  ): Record[TKey, TResult] = js.native
}

