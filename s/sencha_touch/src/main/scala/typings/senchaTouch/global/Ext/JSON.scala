package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.JSON")
@js.native
class JSON ()
  extends StObject
     with typings.senchaTouch.Ext.JSON
/* static members */
object JSON {
  
  @JSGlobal("Ext.JSON")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Decodes parses a JSON string to an object
    * @param json String The JSON string.
    * @param safe Boolean Whether to return null or throw an exception if the JSON is invalid.
    * @returns Object/null The resulting object.
    */
  inline def decode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[js.Any]
  inline def decode(json: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def decode(json: java.lang.String, safe: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decode(json: Unit, safe: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Encodes an Object Array or other value
    * @param o Object The variable to encode.
    * @returns String The JSON string.
    */
  inline def encode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[java.lang.String]
  inline def encode(o: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(o.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Encodes a Date
    * @param d Date The Date to encode.
    * @returns String The string literal to use in a JSON string.
    */
  inline def encodeDate(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDate")().asInstanceOf[java.lang.String]
  inline def encodeDate(d: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDate")(d.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
