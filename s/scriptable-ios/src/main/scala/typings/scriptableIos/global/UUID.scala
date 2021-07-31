package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Unique identifier._
  * @see https://docs.scriptable.app/uuid
  */
object UUID {
  
  @JSGlobal("UUID")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Generate a UUID._
    *
    * Used for getting the string value of a newly generated UUID.
    * @see https://docs.scriptable.app/uuid/#string
    */
  @scala.inline
  def string(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[String]
}
