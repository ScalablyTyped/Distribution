package typings.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios  :{  primary  :string,   secondary  :string,   success  :string,   error  :string,   warning  :string},   android  :{  primary  :string,   secondary  :string,   success  :string,   error  :string,   warning  :string}}> */
trait RecursivePartialiosprimar extends js.Object {
  var android: js.UndefOr[RecursivePartialprimaryst] = js.undefined
  var ios: js.UndefOr[RecursivePartialprimaryst] = js.undefined
}

object RecursivePartialiosprimar {
  @scala.inline
  def apply(android: RecursivePartialprimaryst = null, ios: RecursivePartialprimaryst = null): RecursivePartialiosprimar = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialiosprimar]
  }
}

