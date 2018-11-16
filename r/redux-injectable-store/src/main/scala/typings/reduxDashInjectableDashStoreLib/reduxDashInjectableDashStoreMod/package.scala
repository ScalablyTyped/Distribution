package typings
package reduxDashInjectableDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashInjectableDashStoreMod {
  type WrapReducer[S] = js.Function1[
    /* reducer */ reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction], 
    reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction]
  ]
}
