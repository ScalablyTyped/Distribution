package typings.sindresorhusSlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/slugify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Slugify a string.
  @param string - String to slugify.
  @example
  ```
  import slugify = require('@sindresorhus/slugify');
  slugify('I ♥ Dogs');
  //=> 'i-love-dogs'
  slugify('  Déjà Vu!  ');
  //=> 'deja-vu'
  slugify('fooBar 123 $#%');
  //=> 'foo-bar-123'
  slugify('я люблю единорогов');
  //=> 'ya-lyublyu-edinorogov'
  ```
  */
  def apply(string: String): String = js.native
  def apply(string: String, options: Options): String = js.native
}

