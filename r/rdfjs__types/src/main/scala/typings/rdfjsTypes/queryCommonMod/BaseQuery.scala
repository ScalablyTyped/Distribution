package typings.rdfjsTypes.queryCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseQuery extends StObject {
  
  /**
    * Returns either a stream containing all the items that match the given query,
    * a boolean or void depending on the semantics of the given query.
    */
  def execute(): js.Promise[ResultStream[Any] | Boolean | Unit] = js.native
  def execute(opts: Any): js.Promise[ResultStream[Any] | Boolean | Unit] = js.native
  
  /**
    * Identifier for the type of result of tis query.
    */
  var resultType: String = js.native
}
