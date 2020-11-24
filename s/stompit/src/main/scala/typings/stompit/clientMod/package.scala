package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type MessageCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* message */ typings.stompit.clientMod.Message, 
    scala.Unit
  ]
}
