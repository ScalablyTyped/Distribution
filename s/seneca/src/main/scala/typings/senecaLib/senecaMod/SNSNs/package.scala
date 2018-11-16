package typings
package senecaLib.senecaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SNSNs {
  type ActCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  type AddCallback[T] = js.Function2[
    /* msg */ MessagePayload[T], 
    /* respond */ js.Function2[/* error */ stdLib.Error | scala.Null, /* msg */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type CloseCallback = js.Function2[
    /* optional */ js.Any, 
    /* done */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
    scala.Unit
  ]
  type DatabaseID = java.lang.String
  type EntityListCallback = js.Function2[/* error */ stdLib.Error, /* result */ js.Array[js.Any], scala.Unit]
  type EntityLoadCallback = js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  type EntityRemoveCallback = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type EntitySaveCallback = js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  type ExecutorCallback = js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  type ExecutorWorker = js.Function1[/* callback */ js.Any, scala.Unit]
  type GlobalErrorHandler = js.Function1[/* error */ stdLib.Error, scala.Unit]
  // { level: 'warn+' }
  type LogLevel = senecaLib.senecaLibStrings.none | senecaLib.senecaLibStrings.`debug+` | senecaLib.senecaLibStrings.`info+` | senecaLib.senecaLibStrings.`warn+`
  type LogSpec = senecaLib.senecaLibStrings.quiet | senecaLib.senecaLibStrings.silent | senecaLib.senecaLibStrings.any | senecaLib.senecaLibStrings.all | senecaLib.senecaLibStrings.print | senecaLib.senecaLibStrings.standard | senecaLib.senecaLibStrings.test
  type MessagePayload[T] = PartialMessagePayload with T
  type Pattern = java.lang.String | MinimalPattern
  type PluginModule = js.Function1[/* options */ js.Any, scala.Unit]
  type UnknownType = js.Any
}
