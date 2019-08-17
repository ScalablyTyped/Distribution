package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object senecaMod {
  import typings.std.Error

  type ActCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  type AddCallback[T] = js.Function2[
    /* msg */ MessagePayload[T], 
    /* respond */ js.Function2[/* error */ Error | Null, /* msg */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type CloseCallback = js.Function2[/* optional */ js.Any, /* done */ js.Function1[/* error */ Error, Unit], Unit]
  type DatabaseID = String
  type EntityListCallback = js.Function2[/* error */ Error, /* result */ js.Array[js.Any], Unit]
  type EntityLoadCallback = js.Function2[/* error */ Error, /* result */ js.Any, Unit]
  type EntityRemoveCallback = js.Function1[/* error */ Error, Unit]
  type EntitySaveCallback = js.Function2[/* error */ Error, /* result */ js.Any, Unit]
  type ExecutorCallback = js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  type ExecutorWorker = js.Function1[/* callback */ js.Any, Unit]
  type GlobalErrorHandler = js.Function1[/* error */ Error, Unit]
  type MessagePayload[T] = PartialMessagePayload with T
  type Pattern = String | MinimalPattern
  type PluginModule = js.Function1[/* options */ js.Any, Unit]
  type UnknownType = js.Any
}
