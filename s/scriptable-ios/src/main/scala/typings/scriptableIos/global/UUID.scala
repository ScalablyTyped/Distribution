package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Unique identifier._
  * @see https://docs.scriptable.app/uuid
  */
@JSGlobal("UUID")
@js.native
object UUID extends js.Object {
  
  /**
    * _Generate a UUID._
    *
    * Used for getting the string value of a newly generated UUID.
    * @see https://docs.scriptable.app/uuid/#string
    */
  def string(): String = js.native
}
