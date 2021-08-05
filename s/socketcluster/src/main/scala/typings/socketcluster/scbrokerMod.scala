package typings.socketcluster

import typings.scBroker.anon.Run
import typings.scBroker.scbrokerMod.SCBroker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scbrokerMod {
  
  @JSImport("socketcluster/scbroker", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.scBrokerCluster.scbrokerMod.^ {
    def this(options: Run) = this()
  }
  @JSImport("socketcluster/scbroker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(): SCBroker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SCBroker]
  inline def create(options: Run): SCBroker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[SCBroker]
}
