package typings.reactNativeShare.mod

import typings.reactNativeShare.AnonSocial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-share", JSImport.Default)
@js.native
object default extends js.Object {
  def open(options: MultipleOptions): js.Promise[OpenReturn] = js.native
  def open(options: Options): js.Promise[OpenReturn] = js.native
  def shareSingle(options: Options with AnonSocial): js.Promise[ShareSingleReturn] = js.native
}

