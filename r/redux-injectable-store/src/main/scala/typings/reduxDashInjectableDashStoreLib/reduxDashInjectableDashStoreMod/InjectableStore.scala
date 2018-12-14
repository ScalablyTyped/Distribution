package typings
package reduxDashInjectableDashStoreLib.reduxDashInjectableDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableStore[S]
  extends reduxLib.reduxMod.Store[S, reduxLib.reduxMod.AnyAction] {
  def clearReducers(): scala.Unit = js.native
  def inject(namespace: java.lang.String, reducer: reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]): scala.Unit = js.native
  def injectAll(
    reducers: org.scalablytyped.runtime.StringDictionary[reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]]
  ): scala.Unit = js.native
}

