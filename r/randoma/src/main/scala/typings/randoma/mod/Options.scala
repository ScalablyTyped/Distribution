package typings.randoma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		[Initialization seed.](https://en.wikipedia.org/wiki/Random_seed) Multiple instances of `Randoma` with the same seed will generate the same random numbers.
  		*/
  val seed: String | Double
}

object Options {
  @scala.inline
  def apply(seed: String | Double): Options = {
    val __obj = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

