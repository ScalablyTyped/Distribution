package typings
package propDashTypesLib.propDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requireable[T]
  extends Validator[js.UndefOr[T | scala.Null]] {
  @JSName("isRequired")
  var isRequired_Original: Validator[stdLib.NonNullable[T]] = js.native
  def isRequired(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

