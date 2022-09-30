package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores a list of numeric indices directly on the GPU that specify which entries in a vertex list
  * are used for a `Shape`.
  */
@JSGlobal("IndexList")
@js.native
open class IndexList protected ()
  extends StObject
     with typings.sphereEngineBrowser.IndexList {
  /**
    * Construct a new index list from an array of numeric indices.
    * @param indices The indices to be stored in the index list.
    */
  def this(indices: js.Array[Double]) = this()
  
  /* private */ /* CompleteClass */
  var _workaround: Null = js.native
}
