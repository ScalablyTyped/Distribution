package typings
package atSemanticDashUiDashReactEventDashStackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  /** An event name on which we will subscribe. */
  var name: propDashTypesLib.propDashTypesMod.Validator[java.lang.String]
  /** An event handler or array of event handlers. */
  var on: propDashTypesLib.propDashTypesMod.Validator[
    (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | scala.Null])
  ]
  /** A name of pool. */
  var pool: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  /** A DOM element on which we will subscribe. */
  var target: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

object Anon_Args {
  @scala.inline
  def apply(
    name: propDashTypesLib.propDashTypesMod.Validator[java.lang.String],
    on: propDashTypesLib.propDashTypesMod.Validator[
      (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | scala.Null])
    ],
    pool: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    target: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(name = name, on = on, pool = pool, target = target)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

