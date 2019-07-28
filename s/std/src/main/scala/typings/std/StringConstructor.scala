package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringConstructor
  extends Instantiable0[java.lang.String]
     with Instantiable1[/* value */ js.Any, java.lang.String] {
  def apply(): java.lang.String = js.native
  def apply(value: js.Any): java.lang.String = js.native
  def fromCharCode(codes: Double*): java.lang.String = js.native
  /**
    * Return the String value whose elements are, in order, the elements in the List elements.
    * If length is 0, the empty string is returned.
    */
  def fromCodePoint(codePoints: Double*): java.lang.String = js.native
  /**
    * String.raw is intended for use as a tag function of a Tagged Template String. When called
    * as such the first argument will be a well formed template call site object and the rest
    * parameter will contain the substitution values.
    * @param template A well-formed template string call site representation.
    * @param substitutions A set of substitution values.
    */
  def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
}

