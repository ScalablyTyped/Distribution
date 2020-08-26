package typings.sindresorhusTransliterate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Add your own custom replacements.
  		The replacements are run on the original string before any other transformations.
  		This only overrides a default replacement if you set an item with the same key.
  		@default []
  		@example
  		```
  		import transliterate = require('@sindresorhus/transliterate');
  		transliterate('Я люблю единорогов', {
  			customReplacements: [
  				['единорогов', '🦄']
  			]
  		})
  		//=> 'Ya lyublyu 🦄'
  		```
  		*/
  val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCustomReplacementsVarargs(value: (js.Tuple2[String, String])*): Self = this.set("customReplacements", js.Array(value :_*))
    @scala.inline
    def setCustomReplacements(value: js.Array[js.Tuple2[String, String]]): Self = this.set("customReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomReplacements: Self = this.set("customReplacements", js.undefined)
  }
  
}

