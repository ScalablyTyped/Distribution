package typings.shelljs.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellStringConstructor
  extends /**
  * Wraps a string (or array) value. This has all the string (or array) methods,
  * but also exposes extra methods: `.to()`, `.toEnd()`, and all the pipe-able
  * methods (ex. `.cat()`, `.grep()`, etc.).
  *
  * This can be easily converted into a string by calling `.toString()`.
  *
  * This type also exposes the corresponding command's stdout, stderr, and return status
  * code via the `.stdout` (string), `.stderr` (string), and `.code` (number) properties
  * respectively.
  *
  * Construct signature allows for:
  *
  * var foo = new ShellString('hello world');
  *
  * as per example in shelljs docs:
  * https://github.com/shelljs/shelljs#shellstringstr
  *
  * @param value     The string value to wrap.
  * @return                A string-like object with special methods.
  */
Instantiable1[(/* value */ js.Array[String]) | (/* value */ String), ShellArray | ShellString] {
  /**
    * Wraps a string (or array) value. This has all the string (or array) methods,
    * but also exposes extra methods: `.to()`, `.toEnd()`, and all the pipe-able
    * methods (ex. `.cat()`, `.grep()`, etc.).
    *
    * This can be easily converted into a string by calling `.toString()`.
    *
    * This type also exposes the corresponding command's stdout, stderr, and return status
    * code via the `.stdout` (string), `.stderr` (string), and `.code` (number) properties
    * respectively.
    *
    * @param value     The string value to wrap.
    * @return                A string-like object with special methods.
    */
  def apply(value: String): ShellString = js.native
  def apply(value: js.Array[String]): ShellArray = js.native
}

