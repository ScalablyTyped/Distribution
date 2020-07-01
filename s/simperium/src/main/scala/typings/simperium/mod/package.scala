package typings.simperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChangeVersion = java.lang.String
  type DMPDiff = java.lang.String
  type EntitiesCallback[T, E] = js.Function2[
    /* error */ typings.std.NonNullable[E] | scala.Null, 
    /* entities */ js.UndefOr[js.Array[T]], 
    scala.Unit
  ]
  type EntityCallback[T, E] = js.Function2[
    /* error */ typings.std.NonNullable[E] | scala.Null, 
    /* entity */ js.UndefOr[T], 
    scala.Unit
  ]
  type EntityId = java.lang.String
  type Heartbeat = typings.simperium.mod.CustomEventEmitter[typings.simperium.mod.HeartbeatEvent]
  type JSONDiff[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? simperium.simperium.DiffOp<T[K]>}
    */ typings.simperium.simperiumStrings.JSONDiff with org.scalablytyped.runtime.TopLevel[T]
  type LocalQueue[T] = typings.simperium.mod.CustomEventEmitter[typings.simperium.mod.LocalQueueEvent[T]]
  type SimperiumEvent = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]]
}
