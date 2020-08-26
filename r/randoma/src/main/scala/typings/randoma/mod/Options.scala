package typings.randoma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		[Initialization seed.](https://en.wikipedia.org/wiki/Random_seed) Multiple instances of `Randoma` with the same seed will generate the same random numbers.
  		*/
  val seed: String | Double = js.native
}

object Options {
  @scala.inline
  def apply(seed: String | Double): Options = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setSeed(value: String | Double): Self = this.set("seed", value.asInstanceOf[js.Any])
  }
  
}

