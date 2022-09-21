package typings.stompit

import typings.node.streamMod.Writable
import typings.stompit.clientMod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("stompit/lib/client/Transaction", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Transaction {
    def this(id: Double, client: typings.stompit.clientMod.^) = this()
  }
  
  @js.native
  trait Transaction extends StObject {
    
    def abort(): Unit = js.native
    def abort(options: SendOptions): Unit = js.native
    
    def commit(): Unit = js.native
    def commit(options: SendOptions): Unit = js.native
    
    def send(): Writable = js.native
    def send(headers: Any): Writable = js.native
    def send(headers: Any, options: SendOptions): Writable = js.native
    def send(headers: Unit, options: SendOptions): Writable = js.native
  }
}
