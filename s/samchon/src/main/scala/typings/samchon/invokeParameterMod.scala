package typings.samchon

import typings.samchon.entityMod.Entity
import typings.std.Uint8Array
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeParameterMod {
  
  @JSImport("samchon/protocol/invoke/InvokeParameter", "InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter () extends Entity {
    def this(`val`: String) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: Uint8Array) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: Uint8Array) = this()
    def this(name: String, `val`: XML) = this()
    
    /**
      * Get name.
      */
    def getName(): String = js.native
    
    /**
      * Get type.
      */
    def getType(): String = js.native
    
    /**
      * Get value.
      */
    def getValue(): js.Any = js.native
    
    /**
      * Name of the parameter.
      *
      * @details Optional property, can be omitted.
      */
    var name: String = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def setValue(value: Double): Unit = js.native
    def setValue(value: Uint8Array): Unit = js.native
    def setValue(value: XML): Unit = js.native
    
    /**
      * Type of the parameter.
      */
    var `type`: String = js.native
    
    /**
      * Value of the parameter.
      */
    var value: Boolean | Double | String | XML | Uint8Array = js.native
  }
}
