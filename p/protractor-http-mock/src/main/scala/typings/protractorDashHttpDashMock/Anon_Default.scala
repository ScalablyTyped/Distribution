package typings.protractorDashHttpDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  /**
    * Collection of default mocks to load for every test.
    * Default: []
    */
  var default: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name of the folder where mocks will reside.
    * Default: 'mocks'
    */
  var dir: js.UndefOr[String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(default: js.Array[String] = null, dir: String = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

