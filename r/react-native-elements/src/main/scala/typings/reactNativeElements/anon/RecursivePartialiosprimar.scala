package typings.reactNativeElements.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string},   android :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}}> */
@js.native
trait RecursivePartialiosprimar extends js.Object {
  var android: js.UndefOr[RecursivePartialprimaryst] = js.native
  var ios: js.UndefOr[RecursivePartialprimaryst] = js.native
}

object RecursivePartialiosprimar {
  @scala.inline
  def apply(): RecursivePartialiosprimar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosprimar]
  }
  @scala.inline
  implicit class RecursivePartialiosprimarOps[Self <: RecursivePartialiosprimar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroid(value: RecursivePartialprimaryst): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setIos(value: RecursivePartialprimaryst): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
  
}

