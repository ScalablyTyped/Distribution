package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTimeoutInterval
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Default time to wait in ms before a test fails.
    */
  var defaultTimeoutInterval: js.UndefOr[Double] = js.native
  /**
    * If set, only execute specs whose names match the pattern, which is
    * internally compiled to a RegExp.
    */
  var grep: js.UndefOr[String] = js.native
  /**
    * Inverts 'grep' matches
    */
  var invertGrep: js.UndefOr[Boolean] = js.native
  /**
    * Function called to print jasmine results.
    */
  var print: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true, run specs in semi-random order
    */
  var random: js.UndefOr[Boolean] = js.native
  /**
    * Set the randomization seed if randomization is turned on
    */
  var seed: js.UndefOr[String] = js.native
  /**
    * If true, print colors to the terminal.
    */
  var showColors: js.UndefOr[Boolean] = js.native
}

object DefaultTimeoutInterval {
  @scala.inline
  def apply(): DefaultTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTimeoutInterval]
  }
  @scala.inline
  implicit class DefaultTimeoutIntervalOps[Self <: DefaultTimeoutInterval] (val x: Self) extends AnyVal {
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
    def setDefaultTimeoutInterval(value: Double): Self = this.set("defaultTimeoutInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTimeoutInterval: Self = this.set("defaultTimeoutInterval", js.undefined)
    @scala.inline
    def setGrep(value: String): Self = this.set("grep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    @scala.inline
    def setInvertGrep(value: Boolean): Self = this.set("invertGrep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertGrep: Self = this.set("invertGrep", js.undefined)
    @scala.inline
    def setPrint(value: () => Unit): Self = this.set("print", js.Any.fromFunction0(value))
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setShowColors(value: Boolean): Self = this.set("showColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColors: Self = this.set("showColors", js.undefined)
  }
  
}

