package typings.stringifyAttributes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("stringify-attributes", JSImport.Namespace)
  @js.native
  def apply(attributes: Attributes): String = js.native
  
  type Attributes = StringDictionary[String | Double | Boolean | js.Array[String]]
}
