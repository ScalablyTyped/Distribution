package typings.prosemirrorTransform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "MapResult")
@js.native
class MapResult () extends js.Object {
  
  /**
    * Tells you whether the position was deleted, that is,
    * whether the step removed its surroundings from the document.
    */
  var deleted: Boolean = js.native
  
  /**
    * The mapped version of the position.
    */
  var pos: Double = js.native
}
