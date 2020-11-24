package typings.sindresorhusTransliterate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sindresorhus/transliterate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Convert Unicode characters to Latin characters using [transliteration](https://en.wikipedia.org/wiki/Transliteration).
  @param string - String to transliterate.
  @example
  ```
  import transliterate = require('@sindresorhus/transliterate');
  transliterate('Fußgängerübergänge');
  //=> 'Fussgaengeruebergaenge'
  transliterate('Я люблю единорогов');
  //=> 'Ya lyublyu edinorogov'
  transliterate('أنا أحب حيدات');
  //=> 'ana ahb hydat'
  transliterate('tôi yêu những chú kỳ lân');
  //=> 'toi yeu nhung chu ky lan'
  ```
  */
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
}
