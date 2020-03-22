package typings.sindresorhusTransliterate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(customReplacements: js.Array[js.Tuple2[String, String]] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (customReplacements != null) __obj.updateDynamic("customReplacements")(customReplacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

