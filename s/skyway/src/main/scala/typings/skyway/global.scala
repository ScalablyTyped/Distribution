package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DataConnection")
  @js.native
  class DataConnection ()
    extends StObject
       with typings.skyway.DataConnection
  
  @JSGlobal("MediaConnection")
  @js.native
  class MediaConnection ()
    extends StObject
       with typings.skyway.MediaConnection
  
  @JSGlobal("MeshRoom")
  @js.native
  class MeshRoom ()
    extends StObject
       with typings.skyway.MeshRoom
  
  @JSGlobal("Peer")
  @js.native
  class Peer protected ()
    extends StObject
       with typings.skyway.Peer {
    def this(options: Options) = this()
    def this(id: String, options: Options) = this()
  }
  
  @JSGlobal("SFURoom")
  @js.native
  class SFURoom ()
    extends StObject
       with typings.skyway.SFURoom
}
