package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isObjectMod {
  
  /**
    * Returns `true` when the value is a regular Object and not a specialized Object
    *
    * This helps speed up deepEqual cyclic checks
    *
    * The premise is that only Objects are stored in the visited array.
    * So if this function returns false, we don't have to do the
    * expensive operation of searching for the value in the the array of already
    * visited objects
    *
    * @private
    * @param  {object}   value The object to examine
    * @returns {boolean}       `true` when the object is a non-specialised object
    */
  inline def apply(value: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/is-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
