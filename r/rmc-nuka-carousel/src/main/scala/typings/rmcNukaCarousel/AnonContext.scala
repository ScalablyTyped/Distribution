package typings.rmcNukaCarousel

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.react.mod._Global_.JSX.Element
import typings.rmcNukaCarousel.decoratorsMod.IDecoratorProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: js.Any = js.native
  var props: AnonChildren with IDecoratorProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  def getButtonStyles(disabled: js.Any): AnonBackground = js.native
  def handleClick(e: js.Any): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: String */](f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]]): Unit = js.native
  def setState[K /* <: String */](
    f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[_, K]],
    callback: js.Function0[_]
  ): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[_, K], callback: js.Function0[_]): Unit = js.native
}

