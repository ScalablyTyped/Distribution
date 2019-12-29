package typings.sequelize.sequelizeMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsonStatic
  extends /**
  * Creates an object representing nested where conditions for postgres's json data-type.
  * @see {Model#find}
  *
  * @method json
  * @param conditionsOrPath A hash containing strings/numbers or other nested hash, a string using dot
  *     notation or a string using postgres json syntax.
  * @param value An optional value to compare against. Produces a string of the form "<json path> =
  *     '<value>'".
  */
Instantiable1[(/* conditionsOrPath */ js.Object) | (/* conditionsOrPath */ String), json]
     with Instantiable2[
      (/* conditionsOrPath */ js.Object) | (/* conditionsOrPath */ String), 
      (/* value */ Boolean) | (/* value */ Double) | (/* value */ String), 
      json
    ]

