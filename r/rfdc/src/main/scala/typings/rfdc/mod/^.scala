package typings.rfdc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rfdc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Really Fast Deep Clone
    *
    * ### Types
    *
    * `rdfc` clones all JSON types:
    *
    * * `Object`
    * * `Array`
    * * `Number`
    * * `String`
    * * `null`
    *
    * With additional support for:
    *
    * * `Date` (copied)
    * * `undefined` (copied)
    * * `Function` (referenced)
    * * `AsyncFunction` (referenced)
    * * `GeneratorFunction` (referenced)
    * * `arguments` (copied to a normal object)
    *
    * All other types have output values that match the output
    * of `JSON.parse(JSON.stringify(o))`.
    *
    * For instance:
    *
    * ```js
    * const rdfc = require('rdfc')()
    * const err = Error()
    * err.code = 1
    * JSON.parse(JSON.stringify(e)) // {code: 1}
    * rdfc(e) // {code: 1}
    *
    * JSON.parse(JSON.stringify(new Uint8Array([1, 2, 3]))) //  {'0': 1, '1': 2, '2': 3 }
    * rdfc(new Uint8Array([1, 2, 3])) //  {'0': 1, '1': 2, '2': 3 }
    *
    * JSON.parse(JSON.stringify({rx: /foo/})) // {rx: {}}
    * rdfc({rx: /foo/}) // {rx: {}}
    * ```
    */
  def apply(): js.Function1[/* obj */ js.Any, _] = js.native
  def apply(opts: Options): js.Function1[/* obj */ js.Any, _] = js.native
}
