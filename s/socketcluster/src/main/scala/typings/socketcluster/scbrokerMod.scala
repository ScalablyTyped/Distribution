package typings.socketcluster

import typings.scBroker.anon.Run
import typings.scBroker.scbrokerMod.SCBroker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scbrokerMod {
  
  @JSImport("socketcluster/scbroker", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.scBrokerCluster.scbrokerMod.^ {
    def this(options: Run) = this()
  }
  
  /* static member */
  @JSImport("socketcluster/scbroker", "create")
  @js.native
  def create(): SCBroker = js.native
  @JSImport("socketcluster/scbroker", "create")
  @js.native
  def create(options: Run): SCBroker = js.native
}
