package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.rmcNukaCarousel.decoratorsMod.IDecoratorProps
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceUpdate extends StObject {
  
  var context: js.Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[js.Any]): Unit = js.native
  
  def getButtonStyles(active: js.Any): Border = js.native
  
  def getIndexes(count: js.Any, inc: js.Any): js.Array[Double] = js.native
  
  def getListItemStyles(): CSSProperties = js.native
  
  def getListStyles(): CSSProperties = js.native
  
  var props: Children & IDecoratorProps = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def setState[K /* <: String */](f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[js.Any, K]]): Unit = js.native
  def setState[K /* <: String */](
    f: js.Function2[/* prevState */ js.Any, /* props */ IDecoratorProps, Pick[js.Any, K]],
    callback: js.Function0[js.Any]
  ): Unit = js.native
  def setState[K /* <: String */](state: Pick[js.Any, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[js.Any, K], callback: js.Function0[js.Any]): Unit = js.native
  
  var state: js.Any = js.native
}
