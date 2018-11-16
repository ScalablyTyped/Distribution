package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait syncDocOptions extends js.Object {
  /**
       * The context of your component.
       */
  var context: js.Object
  /**
       * A callback that will be called with any errors such as permissions
       * errors.
       */
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * The state property to sync.
       */
  var state: java.lang.String
  /**
       * A callback that will be called when the listener is set, use for
       * loading indicators.
       */
  var `then`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

