package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AckOrNack = js.Function2[
    /* err */ js.UndefOr[typings.std.Error], 
    /* recovery */ js.UndefOr[typings.rascal.mod.Recovery | js.Array[typings.rascal.mod.Recovery]], 
    scala.Unit
  ]
  
  type Cb[E, A] = js.Function1[/* x */ js.Tuple2[E | scala.Null, A | scala.Nothing], scala.Unit]
  
  type ConnectCb = js.Function1[
    /* x */ js.Tuple2[typings.std.Error | scala.Null, typings.amqplib.mod.Connection | scala.Null], 
    scala.Unit
  ]
  
  type CreateCb = js.Function1[
    /* x */ js.Tuple2[typings.std.Error | scala.Null, typings.rascal.mod.Broker], 
    scala.Unit
  ]
  
  type ErrorCb = js.Function1[/* x */ typings.std.Error | scala.Null, scala.Unit]
}
