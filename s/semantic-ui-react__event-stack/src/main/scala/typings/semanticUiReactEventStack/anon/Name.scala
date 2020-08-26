package typings.semanticUiReactEventStack.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  /** An event name on which we will subscribe. */
  var name: Validator[String] = js.native
  /** An event handler or array of event handlers. */
  var on: Validator[
    (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
  ] = js.native
  /** A name of pool. */
  var pool: Requireable[String] = js.native
  /** A DOM element on which we will subscribe. */
  var target: Requireable[js.Object] = js.native
}

object Name {
  @scala.inline
  def apply(
    name: Validator[String],
    on: Validator[
      (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
    ],
    pool: Requireable[String],
    target: Requireable[js.Object]
  ): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Validator[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(
      value: Validator[
          (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
        ]
    ): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(value: Requireable[String]): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Requireable[js.Object]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

