package typings.reactInstantsearchDom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translations extends js.Object {
  var translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.native
}

object Translations {
  @scala.inline
  def apply(): Translations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translations]
  }
  @scala.inline
  implicit class TranslationsOps[Self <: Translations] (val x: Self) extends AnyVal {
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
    def setTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

