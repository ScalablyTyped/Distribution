package typings.reactDashNativeDashShare.reactDashNativeDashShareMod

import typings.reactDashNativeDashShare.Anon_Social
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-share", JSImport.Default)
@js.native
object default extends js.Object {
  def open(options: MultipleOptions): js.Promise[OpenReturn] = js.native
  def open(options: Options): js.Promise[OpenReturn] = js.native
  def shareSingle(options: Options with Anon_Social): js.Promise[ShareSingleReturn] = js.native
}

