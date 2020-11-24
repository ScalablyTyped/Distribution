package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class DataConnection ()
    extends typings.skyway.DataConnection
  
  @js.native
  class MediaConnection ()
    extends typings.skyway.MediaConnection
  
  @js.native
  class MeshRoom ()
    extends typings.skyway.MeshRoom
  
  @js.native
  class Peer protected ()
    extends typings.skyway.Peer {
    def this(options: Options) = this()
    def this(id: String, options: Options) = this()
  }
  
  @js.native
  class SFURoom ()
    extends typings.skyway.SFURoom
}
