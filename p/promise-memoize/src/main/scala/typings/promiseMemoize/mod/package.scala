package typings.promiseMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.promiseMemoize.promiseMemoizeStrings.simple
    - typings.promiseMemoize.promiseMemoizeStrings.json
    - js.Function1[/ * args * / js.Array[js.Any], js.Any]
    - js.Array[
  typings.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
  */
  type KeyResolver = typings.promiseMemoize.mod._KeyResolver | (js.Function1[/* args */ js.Array[js.Any], js.Any]) | (js.Array[
    typings.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/* arg */ js.Any, js.Any])
  ])
}
