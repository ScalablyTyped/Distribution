package typings
package atSemanticDashUiDashReactEventDashStackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args extends js.Object {
  /** An event name on which we will subscribe. */
  @JSName("name")
  var name_Original: propDashTypesLib.propDashTypesMod.Validator[java.lang.String] = js.native
  /** An event handler or array of event handlers. */
  @JSName("on")
  var on_Original: propDashTypesLib.propDashTypesMod.Validator[
    (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | scala.Null])
  ] = js.native
  /** A name of pool. */
  var pool: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  /** A DOM element on which we will subscribe. */
  var target: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  /** An event name on which we will subscribe. */
  def name(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  /** An event handler or array of event handlers. */
  def on(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

