package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _The current module._
  * @see https://docs.scriptable.app/module
  */
@JSGlobal("module")
@js.native
object module extends js.Object {
  
  /**
    * _Exported functions and modules._
    *
    * Values assigned to `exports` are returned by the global `importModule` function when the module is imported.
    *
    * `exports` can be of any type but by default it is an empty object. Consider the following example which exports the `area` and `circumference` functions.
    *
    *     module.exports.area = (r) => {
    *       return Math.PI * Math.pow(r, 2)
    *     }
    *
    *     module.exports.circumference = (r) => {
    *       return 2 * Math.PI * r
    *     }
    *
    * Alternatively if you only need to export a single function or object, you can assign directly to the `exports` property as shown in the following examples.
    *
    *     module.exports = (r) => {
    *       return 2 * Math.PI * r
    *     }
    *
    *     module.exports = "My string"
    * @see https://docs.scriptable.app/module/#exports
    */
  var exports: js.Any = js.native
  
  /**
    * _Path to file containing the module._
    *
    * This is the absolute path to the file containing the module.
    * @see https://docs.scriptable.app/module/#filename
    */
  var filename: String = js.native
}
