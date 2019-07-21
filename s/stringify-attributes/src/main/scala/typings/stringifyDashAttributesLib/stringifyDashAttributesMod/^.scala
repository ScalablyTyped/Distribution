package typings
package stringifyDashAttributesLib.stringifyDashAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stringify-attributes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Turn an object into a string of HTML attributes.
  Note that the string is prepended with a space when there are attributes to simplify using it in a HTML tag.
  @example
  ```
  import stringifyAttributes = require('stringify-attributes');
  stringifyAttributes({
  	unicorn: '🦄',
  	rainbow: true,
  	number: 1,
  	multiple: ['a', 'b']
  });
  //=> ' unicorn="🦄" rainbow number="1" multiple="a b"'
  ```
  */
  def apply(attributes: Attributes): java.lang.String = js.native
}

