package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFSUserVariable extends js.Object {
  
  /**
    * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
    * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
    * @return {string}        Returns: The variable type name.
    */
  def getTypeName(typeId: Double): String = js.native
  
  /**
    * Indicates if the variable is null.
    * @return {boolean} Returns: true if the variable has a null value.
    */
  def isNull(): Boolean = js.native
  
  /** @type {string} Indicates the name of this variable. */
  var name: String = js.native
  
  /** @type {number} Returns the value of this variable. */
  var value: Double = js.native
}
object SFSUserVariable {
  
  @scala.inline
  def apply(getTypeName: Double => String, isNull: () => Boolean, name: String, value: Double): SFSUserVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSUserVariable]
  }
  
  @scala.inline
  implicit class SFSUserVariableOps[Self <: SFSUserVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTypeName(value: Double => String): Self = this.set("getTypeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNull(value: () => Boolean): Self = this.set("isNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
