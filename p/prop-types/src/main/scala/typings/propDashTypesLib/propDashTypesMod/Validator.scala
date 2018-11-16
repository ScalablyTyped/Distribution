package typings
package propDashTypesLib.propDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[T] extends js.Object {
  def apply(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

