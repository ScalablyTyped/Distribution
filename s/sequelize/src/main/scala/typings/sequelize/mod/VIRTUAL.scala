package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sequelize", "VIRTUAL")
@js.native
open class VIRTUAL protected ()
  extends StObject
     with DataTypeVirtual {
  /**
    * Virtual field
    *
    * Accepts subtype any of the DataTypes
    * Array of required attributes that are available on the model
    */
  def this(subtype: DataTypeAbstract) = this()
  def this(subtype: DataTypeAbstract, requireAttributes: js.Array[String]) = this()
  
  /**
    * Although this is not needed for the definitions itself, we want to make sure that DataTypeAbstract is not
    * something than can be evaluated to an empty object.
    */
  /* CompleteClass */
  var dialectTypes: String = js.native
}
