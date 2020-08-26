package typings.senchaTouch.Ext.data.identifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISequential extends ISimple {
  /** [Method] Returns the value of seed
    * @returns Number
    */
  var getSeed: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var seed: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of seed
    * @param seed Number The new value.
    */
  var setSeed: js.UndefOr[js.Function1[/* seed */ js.UndefOr[Double], Unit]] = js.native
}

object ISequential {
  @scala.inline
  def apply(): ISequential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequential]
  }
  @scala.inline
  implicit class ISequentialOps[Self <: ISequential] (val x: Self) extends AnyVal {
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
    def setGetSeed(value: () => Double): Self = this.set("getSeed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSeed: Self = this.set("getSeed", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setSetSeed(value: /* seed */ js.UndefOr[Double] => Unit): Self = this.set("setSeed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSeed: Self = this.set("setSeed", js.undefined)
  }
  
}

