package typings
package sipDotJsLib.libExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED: The original implementation of exceptions in this library attempted to
  * deal with the lack of type checking in JavaScript by adding a "type" attribute
  * to objects and using that to discriminate. On top of that it layered allcoated
  * "code" numbers and constant "name" strings. All of that is unnecessary when using
  * TypeScript, inheriting from Error and properly setting up the prototype chain...
  */
@js.native
trait LegacyException extends Exception {
  var code: scala.Double = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
}

