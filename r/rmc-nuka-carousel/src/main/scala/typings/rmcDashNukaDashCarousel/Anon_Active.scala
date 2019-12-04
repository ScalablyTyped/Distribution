package typings.rmcDashNukaDashCarousel

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactInstance
import typings.react.reactMod._Global_.JSX.Element
import typings.rmcDashNukaDashCarousel.libDecoratorsMod.IDecoratorProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Active extends js.Object {
  var context: js.Any = js.native
  var props: Anon_Children with IDecoratorProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  def getButtonStyles(active: js.Any): Anon_BackgroundBorder = js.native
  def getIndexes(count: js.Any, inc: js.Any): js.Array[Double] = js.native
  def getListItemStyles(): CSSProperties = js.native
  def getListStyles(): CSSProperties = js.native
  def render(): Element = js.native
  def setState[K /* <: String */](f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]]): Unit = js.native
  def setState[K /* <: String */](
    f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]],
    callback: js.Function0[_]
  ): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K], callback: js.Function0[_]): Unit = js.native
}

