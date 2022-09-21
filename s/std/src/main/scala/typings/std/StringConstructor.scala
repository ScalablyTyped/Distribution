package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringConstructor
  extends StObject
     with /* standard es5 */
Instantiable0[java.lang.String]
     with Instantiable1[/* value */ Any, java.lang.String] {
  
  /* standard es5 */
  def apply(): java.lang.String = js.native
  def apply(value: Any): java.lang.String = js.native
  
  /* standard es5 */
  def fromCharCode(codes: Double*): java.lang.String = js.native
  
  /**
    * Return the String value whose elements are, in order, the elements in the List elements.
    * If length is 0, the empty string is returned.
    */
  /* standard es2015.core */
  def fromCodePoint(codePoints: Double*): java.lang.String = js.native
  
  /**
    * String.raw is usually used as a tag function of a Tagged Template String. When called as
    * such, the first argument will be a well formed template call site object and the rest
    * parameter will contain the substitution values. It can also be called directly, for example,
    * to interleave strings and values from your own tag function, and in this case the only thing
    * it needs from the first argument is the raw property.
    * @param template A well-formed template string call site representation.
    * @param substitutions A set of substitution values.
    */
  /* standard es2015.core */
  def raw(template: Raw, substitutions: Any*): java.lang.String = js.native
}
