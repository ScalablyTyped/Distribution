package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtendOptions extends NewOptions {
  /**
           * @deprecated
           */
  var beforeInit: js.UndefOr[js.Function1[/* options */ ExtendOptions, scala.Unit]] = js.undefined
  /**
           * @deprecated
           */
  var init: js.UndefOr[js.Function1[/* options */ ExtendOptions, scala.Unit]] = js.undefined
  // Default false, inherit from Ractive.defaults
  var isolated: js.UndefOr[scala.Boolean] = js.undefined
}

