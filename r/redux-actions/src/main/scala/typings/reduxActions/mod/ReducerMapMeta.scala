package typings.reduxActions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReducerMapMeta[State, Payload, Meta] extends /* actionType */ StringDictionary[
      (ReducerMeta[State, Payload, Meta]) | (ReducerNextThrowMeta[State, Payload, Meta]) | (ReducerMapMeta[State, Payload, Meta])
    ]
object ReducerMapMeta {
  
  @scala.inline
  def apply[State, Payload, Meta](): ReducerMapMeta[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerMapMeta[State, Payload, Meta]]
  }
}
