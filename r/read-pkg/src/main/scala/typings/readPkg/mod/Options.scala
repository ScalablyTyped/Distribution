package typings.readPkg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Current working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		[Normalize](https://github.com/npm/normalize-package-data#what-normalization-currently-entails) the package data.
  		@default true
  		*/
  val normalize: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, normalize: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

