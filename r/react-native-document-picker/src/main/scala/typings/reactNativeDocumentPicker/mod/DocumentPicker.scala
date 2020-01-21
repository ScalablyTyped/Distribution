package typings.reactNativeDocumentPicker.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-document-picker", "DocumentPicker")
@js.native
object DocumentPicker extends js.Object {
  def show(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = js.native
}

