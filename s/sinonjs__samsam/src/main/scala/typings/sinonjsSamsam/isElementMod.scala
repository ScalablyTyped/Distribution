package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isElementMod {
  
  /**
    * Returns `true` when `object` is a DOM element node.
    *
    * Unlike Underscore.js/lodash, this function will return `false` if `object`
    * is an *element-like* object, i.e. a regular object with a `nodeType`
    * property that holds the value `1`.
    *
    * @alias module:samsam.isElement
    * @param {object} object The object to examine
    * @returns {boolean} Returns `true` for DOM element nodes
    */
  inline def apply(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/samsam/types/is-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
