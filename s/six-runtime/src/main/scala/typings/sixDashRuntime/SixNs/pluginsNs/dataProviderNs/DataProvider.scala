package typings.sixDashRuntime.SixNs.pluginsNs.dataProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Six.plugins.dataProvider.DataProvider")
@js.native
abstract class DataProvider () extends js.Object {
  def execute(ctx: js.Object, args: js.Any): js.Any = js.native
  def prepare(ctx: js.Object, depsRes: js.Object): js.Any = js.native
}

/* static members */
@JSGlobal("Six.plugins.dataProvider.DataProvider")
@js.native
object DataProvider extends js.Object {
  var deps: js.Array[String] = js.native
  var retry: Double = js.native
  var timeout: Double = js.native
}

